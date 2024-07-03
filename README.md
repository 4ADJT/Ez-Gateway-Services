# Ez-Blue - The Blue Zone Easy
## Ez-Gateway-Services

Ez-Gateway é um API Gateway baseado no Spring Cloud Gateway que roteia solicitações para os microserviços `Ez-Client-Services` e `Ez-Blue-Services`.

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
git clone <URL-DO-REPOSITORIO>
cd Ez-Gateway-Server
```

2. Compile e execute o projeto
```sh
mvn clean package
mvn spring-boot:run
```
## Executar com Docker

1. Compile o projeto e crie a imagem Docker:
```sh
docker build -t ez-gateway-server .
```

2. Execute o container:
```sh
docker run -p 8761:8761 ez-gateway-server
```

## Configuração
A configuração do Gateway Services pode ser encontrada no arquivo application.properties na pasta src/main/resources.