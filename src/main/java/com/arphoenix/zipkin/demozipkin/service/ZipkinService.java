package com.arphoenix.zipkin.demozipkin.service;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.micrometer.observation.annotation.Observed;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Observed
public class ZipkinService {

	private final RestTemplate restTemplate;

	public String zipkinService() {
		ResponseEntity<String> response = restTemplate.exchange("http://localhost:8084/demo-rest-template", HttpMethod.GET, null,
				String.class);
		return response.getBody();
	}
}