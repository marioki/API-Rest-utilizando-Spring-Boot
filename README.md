# API-Rest-utilizando-Spring-Boot
 Reto: Construir un API Rest utilizando Spring Boot (Java), Maven y MySQL


# Uso del API

## Swagger-Ui
http://localhost:8080/swagger-ui.html#/user-rest
## Data-Source-url
//localhost:3306/users?zeroDateTimeBehavior=convertToNull&serverTimezone

## Endpoint base 

`http://localhost:8080/api/v1/users`



**Hyperlinks a cada sección**

- [Listar Usuarios](#getUsers)
- [Responder un solo usuario](#getUserById)
- [Crear un nuevo usuario](#createUser)
- [Modificar un usuario](#editUser)
- [Eliminar un usuario](#deleteUser)


## getUsers

1. Listar Usuarios

- Method: `GET`
- Path: `/api/v1/users`
- Pamateres:
  - `none`
  
Example Response

```javascript
[
  {
    "id": 0,
    "lastName": "string",
    "name": "string"
  }
]
```

[regresar al inicio del readme](#uso-del-api)

## getUserById

1. Traer un usuario

- Path: `/api/v1/users/{id}`
- Method: `GET`
- Pamateres:
  - `id`
  
 Example Response
  
```javascript
  {
    "id": 0,
    "lastName": "string",
    "name": "string"
  }
  
```
[regresar al inicio del readme](#uso-del-api)


## createUser
2. Crear un nuevo usuario

- Path: `/api/v1/users`
- Method: `POST`
- event.body:

```javascript
{
  "name": "string",
  "lastName":"string"
}
```
[regresar al inicio del readme](#uso-del-api)


## editUser
3. Modificar un usuario

- Path: `/api/v1/users/{id}`
- Method: `PUT`
- Pamateres:
  - `id`
- event.body:

```javascript
{
  "name": "string",
  "lastName":"string"
}
```

[regresar al inicio del readme](#uso-del-api)

## DeleteUser

1.  Eliminar un usuario

- Method: `DELETE`
- Path: `/api/v1/users/{id}`
- Pamateres:
  - `id`
  
  [regresar al inicio del readme](#uso-del-api)

  
