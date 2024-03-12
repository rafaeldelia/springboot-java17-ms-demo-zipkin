package com.arphoenix.zipkin.demozipkin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arphoenix.zipkin.demozipkin.service.ZipkinService;

@RestController
class ZipkinController {

	@Autowired
	ZipkinService zipkinService;

	@GetMapping(value = "/zipkin")
	public String zipkinService1() {
		return zipkinService.zipkinService();
	}
}