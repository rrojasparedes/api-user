# API de Creación de Usuarios

Esta API permite la creación de usuarios mediante una solicitud POST a la ruta `/create`. La solicitud debe incluir un JSON con la siguiente estructura:

```json
{
   "name": "Rafael Rojas",
   "email": "rrojasparedes@gmail.com",
   "password": "aatreqw",
   "phones": [
      {
         "number": "1234567",
         "citycode": "1",
         "contrycode": "57"
      },
      {
         "number": "22221",
         "citycode": "14",
         "contrycode": "65"
      }
   ]
}
```

# Ejemplo de Respuesta Exitosa:

En caso de éxito, la API devuelve una respuesta con el siguiente formato:

```json
{
    "id": 1,
    "created": "2023-11-24T15:43:32.350+00:00",
    "modified": "2023-11-24T15:43:32.350+00:00",
    "lastLogin": "2023-11-24T15:43:32.350+00:00",
    "token": "0ba2437d-1a9d-44e2-b169-e100a6b9041d",
    "active": false
}
```

# Ejemplo de Respuesta en Caso de Error:

En caso de error, la API devuelve un mensaje en el siguiente formato:

```json
{
    "mensaje": "El correo ya está registrado."
}
```

El mensaje indica el tipo de error que ha ocurrido. Pueden ocurrir distintos errores como "El correo ya está registrado", "Contraseña inválida", entre otros, dependiendo de la validación realizada por la API.

# Métodos Disponibles:

POST /create: Crea un nuevo usuario con la información proporcionada en el cuerpo de la solicitud.
