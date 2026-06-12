# Microservicios Spring Boot con Docker

Proyecto de ejemplo compuesto por varios microservicios desarrollados con Spring Boot y ejecutados mediante Docker Compose.

## Servicios incluidos

* `eureka-server`: servidor de descubrimiento de servicios.
* `gateway-service`: puerta de entrada principal a los microservicios.
* `producto-service`: microservicio de productos.
* `usuario-service`: microservicio de usuarios.

## Tecnologías utilizadas

* Java
* Spring Boot
* Spring Cloud
* Eureka Server
* Spring Cloud Gateway
* Docker
* Docker Compose
* Maven

## Estructura del proyecto

```text
microservicios-spring-docker/
├── eureka-server/
├── gateway-service/
├── producto-service/
├── usuario-service/
├── compose.yaml
└── README.md
```

## Ejecución con Docker Compose

Primero debes tener Docker Desktop iniciado.

Desde la carpeta raíz del proyecto ejecuta:

```bash
docker compose up --build
```

Para detener los contenedores:

```bash
docker compose down
```

## Puertos

* Eureka Server: `8761`
* Gateway Service: `8083`
* Producto Service: `8084`
* Usuario Service: `8082`

## Autor

Alex Espinoza
