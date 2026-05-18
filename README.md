# API REST - Sistema de Biblioteca

API REST con Spring Boot y MongoDB Atlas para gestion de libros (CRUD).

## Tecnologias

- Java 17
- Spring Boot 4.0.6
- Spring Data MongoDB
- MongoDB Atlas
- Lombok

## Estructura del proyecto

```
src/main/java/com/biblioteca/
├── BibliotecaApiiApplication.java
├── controller/LibroController.java
├── dto/LibroRequest.java, LibroResponse.java
├── model/Libro.java
├── repository/LibroRepository.java
└── service/LibroService.java, LibroServiceImpl.java
```

## Configuracion

1. Copia `src/main/resources/application.properties.example` a `application.properties`
2. Reemplaza la URI con tu cadena de conexion de MongoDB Atlas
3. En Atlas, configura **Network Access** con tu IP o `0.0.0.0/0`

## Ejecucion

```bash
./mvnw spring-boot:run
```

O ejecuta `BibliotecaApiiApplication` desde IntelliJ.

## Endpoints

| Metodo | URL | Descripcion |
|--------|-----|-------------|
| POST | `/api/libros` | Crear libro |
| GET | `/api/libros` | Listar libros |
| GET | `/api/libros/{id}` | Consultar por ID |
| PUT | `/api/libros/{id}` | Actualizar libro |
| DELETE | `/api/libros/{id}` | Eliminar libro |

Base URL: `http://localhost:8080`


