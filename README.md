# Experis


## Agrupación 🚀
La estructura del proyecto es la siguiente

- com.experis.noticias
- com.experis.noticias.controller
- com.experis.noticias.models
- com.experis.noticias.repository
- com.experis.noticias.service.impl

- com.experis.noticias.test.controller
- com.experis.noticias.testcontroller.mock

Introducción: Desafio para optar por el cargo de Desarrollador Fullstack.

Tecnología Utilizada: #n el proyecto se utilizo Java 11, Spring Boot 2.6.6, 
Lombok, H2 Database, Mockito para pruebas unitarias, Swagger 2.8.0 para la 
documentación de la API, Angular 16 para el front-end, Bootstrap y SweetAlert.


Despliegue y Pruebas: Para levantar el frontend se debe posicionar dentro del directorio,
abrir una cmd y escribir el siguiente texto ng serve. Para levantar el backend se debe 
utilizar el siguiente comando mvn spring-boot:run.
El microservicio cuenta con un Bean que se utiliza para cargar 2 registros al iniciar
la pieza para que así se pueda validar el servicio de listar todas las noticias favoritas.


Para acceder al Swagger se debe hacer desde la siguiente ruta: http://localhost:8080/swagger-ui/index.html?configUrl=/api-docs/swagger-config#/


