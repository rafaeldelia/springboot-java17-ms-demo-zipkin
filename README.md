# /rafaeldelia -- Microservice integrating with zipkin 

### Integração com o Zipkin

##### Objetivo
O Zipkin é uma ferramenta de rastreamento distribuído que tem como objetivo ajudar a entender e solucionar problemas em sistemas distribuídos. Aqui estão alguns dos principais objetivos do Zipkin:

Rastreamento distribuído: Em sistemas distribuídos, uma única solicitação pode atravessar vários serviços. O Zipkin permite rastrear o caminho de uma solicitação através de todos esses serviços, fornecendo informações sobre cada ponto de passagem e o tempo gasto em cada um.

Identificação de gargalos de desempenho: Ao fornecer informações detalhadas sobre o tempo de execução de cada componente de um sistema distribuído, o Zipkin pode ajudar a identificar gargalos de desempenho, pontos de latência e áreas que podem ser otimizadas para melhorar o desempenho geral do sistema.

Depuração de problemas: Quando ocorrem erros ou problemas em um sistema distribuído, pode ser difícil identificar a causa raiz, especialmente quando várias partes do sistema estão envolvidas. O Zipkin fornece uma visão abrangente do fluxo de solicitação, ajudando os desenvolvedores a rastrear e entender a origem de problemas e falhas.

Monitoramento de comunicação entre serviços: Em arquiteturas de microsserviços, é crucial monitorar a comunicação entre os diferentes serviços para garantir a integridade e o desempenho do sistema como um todo. O Zipkin fornece insights sobre como os serviços se comunicam entre si, permitindo identificar padrões de tráfego, dependências e problemas de comunicação.

##### Integração Spring boot + Zipkin

O objetivo de integrar um aplicativo Spring Boot chamado "demo-zipkin" com outro aplicativo Spring Boot chamado "demo-rest-template" é permitir o rastreamento distribuído das solicitações HTTP feitas pelo "demo-rest-template" utilizando o Zipkin.

Uma vez integrados, você poderá utilizar o dashboard do Zipkin para visualizar e analisar o fluxo de solicitações entre os dois aplicativos Spring Boot, fornecendo insights valiosos sobre o desempenho e a integridade do sistema distribuído como um todo.

### 1. Tecnologias Utilizadas

   - Java 17
   - Spring Boot 3.2.3
   - Lombok
   - Spring Actuator
   - SonarLint
   
   -- OpenTelemetry
   - Spring Cloud Starter Zipkin
   - Micrometer Tracing Bridge OTel  -> Esta dependência é um "bridge" para integrar o Micrometer com o OpenTelemetry
   - Zipkin Exporter -> Adaptador que conecta o Micrometer ao OpenTelemetry
   - Spring AOP -> É uma dependência do Spring Boot que facilita o uso do AOP (Aspect-Oriented Programming) em aplicativos Spring Boot.
   
### 2. Configuração 

##### Instale

* [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/download/) ou outra IDE
* [Java JDK 17](https://openjdk.java.net/projects/jdk/17/)
* [Git](https://git-scm.com/downloads)
* [Postman Agent](https://www.postman.com/downloads/);
* [Sonar Lint](https://www.sonarsource.com/products/sonarlint/)

### 3. Build e Deploy 

#### 3.1 Ambiente de desenvolvimento (LocalHost)

##### Spring Boot 

   1. Abra o terminal e navegue até a pasta desejada
   2. Digite no terminal -> git clone <repo>
   3. Abra a IDE escolhida
   4. Importe o projeto
   5. Realize o build 
      1. Aperte o botão com o símbolo de um martelo
      - ou
      2. Digite no terminal mvn package -U
   6. Execute o projeto
      1. Aperte o botão com o símbolo de play
      - ou
      2. Digite no terminal mvn exec:java

##### SonarLint

   1. Adicione o plugin sonarLint na IDE
   2. Selecione a pasta ms-usuario e Digite Ctrl+Shift+S  
   3. Ou
   4. Abra algum arquivo   
   5. Vizualise os erros indicados pelo sonarLint
   6. Corrija-os

### 4. Executar o Teste

##### 4.1 - Docker Compose - Subindo o Zipkin

   1. Acesse a pasta \src\zipkin
   2. Abra o cmd e execute o comando: "docker compose up -d"
   3. Acesse a URL: "http://localhost:9411/zipkin"
   4. Se tiver no ar é porque está pronto para iniciar as chamadas no Postman.

##### 4.2 - Postman

   1. Abra o Postman Agent
   2. Acesse o postman por meio do link: https://web.postman.co/
   3. Crie um workplace
   4. Clique em "import"
   5. Selecione o arquivo "SpringBoot + ZIPKIN.postman_collection" localizado na pasta /src/postman

##### 4.3 - CURL

   1. curl --location 'http://localhost:8083/demo-zipkin/zipkin'
   
##### 4.4 - Zipkin
   
   1. Acesse a URL: "http://localhost:9411/zipkin"
   2. Aperte o botão RUN QUERY
   3. Veja o tracing da chamada até o microserviço 2   
   
   
   