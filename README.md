# Ez-Blue - The Blue Zone Easy
## Ez-Gateway-Services

Ez-Gateway-Services é um API Gateway baseado no Spring Cloud Gateway que roteia solicitações para os microserviços `Ez-Client-Services` e `Ez-Blue-Services`.

## Intenção

O objetivo deste serviço é atuar como ponto de entrada único para todas as solicitações dos clientes, roteando-as para os microserviços apropriados, além de aplicar políticas de segurança, balanceamento de carga e outras funcionalidades.

## Como executar

### Requisitos

- JDK 17+
- Maven 3.6.3+
- Docker (opcional para execução com Docker)

## Executar localmente

1. Clone o repositório:
```sh
git clone https://github.com/4ADJT/Ez-Gateway-Services.git
cd Ez-Gateway-Services
```

2. Compile e execute o projeto
```sh
mvn clean package
mvn spring-boot:run
```
## Executar com Docker

1. Compile o projeto e crie a imagem Docker:
```sh
docker build -t ez-gateway-services .
```

2. Execute o container:
```sh
docker run -p 8080:8080 ez-gateway-services
```

## Configuração
A configuração do Ez-Gateway-Services pode ser encontrada no arquivo application.properties na pasta src/main/resources.