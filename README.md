# Web Service SpringBoot
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Joao-Darwin/web-service-springboot/blob/main/LICENCE) 

# Sobre o projeto

O projeto foi desenvolvido pensando na criação de um web service, que tinha como principal objetivo consolidar a aprendizagem da linguagem Java do framework SpringBoot bem como o modelo de domínio e a arquitetura de um projeto feito com springboot.

O web service consiste no back-end de uma serviço web de aplicação um e-commerce, onde teremos associaçõs entre usuário, pedido, produtos e categorias

## Modelo de domínio
![Domínio](https://github.com/Joao-Darwin/repoImgs/blob/main/Imgs%20-%20Web%20Service%20SpringBoot/modeloDeDominio.png)

## Modelo de instâncias
![Web 1](https://github.com/Joao-Darwin/repoImgs/blob/main/Imgs%20-%20Web%20Service%20SpringBoot/modeloDeInstancias.png)

## Camadas lógicas
![Modelo Conceitual](https://github.com/Joao-Darwin/repoImgs/blob/main/Imgs%20-%20Web%20Service%20SpringBoot/camadasLogicas.png)

# Tecnologias utilizadas
## Back end
- Java (linguagem)
- Spring Boot (framework)
- JPA / Hibernate (mapeamento e persistência de dados)
- Maven (gerênciador de depedências)
- H2 (banco de dados para teste)
- MySQL (banco de dados)
- PostMan (API client)

# Como executar o projeto

## Back end
Pré-requisitos: Java 17 e Spring Boot 3.0

### Clonar repositório
```bash
git clone https://github.com/Joao-Darwin/web-service-springboot webServiceSpring
```

### Entrar na pasta do projeto
```bash
cd webServiceSpring
```
### Instalar o Maven
```bash
sudo apt-get install maven
```
### Instalar depedências do projeto
```bash
sudo mvn clean install
```
### Executar o projeto
```bash
mvn spring-boot:run
```

# Autor

João Darwin

https://www.linkedin.com/in/joao-darwin/
