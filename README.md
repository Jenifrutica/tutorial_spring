# API REST - Sistema de Biblioteca

API REST para gestionar libros, desarrollada con Spring Boot y MongoDB Atlas siguiendo arquitectura por capas (Model, Repository, Service, DTO y Controller).

Incluye operaciones CRUD completas sobre la entidad `Libro`, con persistencia en MongoDB.

## Endpoints

| Metodo | URL | Descripcion |
|--------|-----|-------------|
| POST | `/api/libros` | Crear libro |
| GET | `/api/libros` | Listar libros |
| GET | `/api/libros/{id}` | Consultar por ID |
| PUT | `/api/libros/{id}` | Actualizar libro |
| DELETE | `/api/libros/{id}` | Eliminar libro |

Base URL: `http://localhost:8080`
