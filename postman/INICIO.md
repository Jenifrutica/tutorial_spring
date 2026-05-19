# Configurar Postman (desde cero)

## Paso 0 — Antes de Postman

En una terminal, desde la raíz del proyecto:

```powershell
cd "C:\Tercer semestre\biblioteca-apii"
.\mvnw spring-boot:run
```

Espera el mensaje `Started BibliotecaApiiApplication`. No cierres esa ventana.

---

## Paso 1 — Importar en Postman (pantalla principal)

1. Abre Postman.
2. Clic en **Import** (arriba a la izquierda, o en el menú lateral).
3. Arrastra estos dos archivos de la carpeta `postman/`:
   - `Biblioteca-API.postman_collection.json`
   - `Biblioteca-Local.postman_environment.json`
4. Clic en **Import**.

---

## Paso 2 — Activar el entorno

1. Arriba a la derecha verás un desplegable que dice **No Environment**.
2. Cámbialo a **Biblioteca - Local**.

---

## Paso 3 — Ejecutar las pruebas (en orden)

En el panel izquierdo: **Collections** → **Biblioteca API**.

| # | Request | Respuesta esperada |
|---|---------|-------------------|
| 1 | Crear libro | `201 Created` + JSON con `id` |
| 2 | Listar libros | `200 OK` + array |
| 3 | Consultar libro por ID | `200 OK` |
| 4 | Actualizar libro | `200 OK` |
| 5 | Eliminar libro | `204 No Content` |

Clic en cada request → **Send**.

> El request **1. Crear libro** guarda solo el `id` en la variable `libroId` para los pasos 3, 4 y 5.

---

## Si algo falla

| Error | Solución |
|-------|----------|
| Could not send request | La API no está corriendo → `mvnw spring-boot:run` |
| 500 Internal Server Error | Revisa MongoDB en `application.properties` |
| 404 en GET/PUT/DELETE por id | Ejecuta primero **1. Crear libro** |
