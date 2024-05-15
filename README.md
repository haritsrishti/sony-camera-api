# sony-camera-api

Project Name - sony-camera-api

Package - com.sony.camera

source - controller, service, request, response, config, model, mapper, util, constants, repository

testing - controller, service, request, response, config, model, mapper, util, constants, repository

Host name - http://localhost:8080

Context root: /camera/v1
# Sony Camera API

## Overview

This API manages Sony camera products, allowing CRUD operations.

## Installation

Clone the repository and install dependencies:

```bash
git clone https://github.com/your_username/sony-camera-api.git
cd sony-camera-api
npm install
```

## Usage

- Base URL: `http://localhost:8080/camera/v1`

### Create a Camera (POST)

- Endpoint: `/dslr`
- Request Body:

```json
{
  "model": "Alpha A7 III",
  "resolution": "24.2 MP",
  "sensorType": "Full-frame CMOS",
  "price": 1999.99,
  "features": ["4K video recording", "5-axis in-body image stabilization"]
}
```

- Response Body (201 Created):

```json
{
  "id": "hjfdhdhdhghh",
  "model": "Alpha A7 III",
  "resolution": "24.2 MP",
  "sensorType": "Full-frame CMOS",
  "price": 1999.99,
  "features": ["4K video recording", "5-axis in-body image stabilization"],
  "status": "Created"
}
```

### Read a Camera (GET)

- Endpoint: `/dslr/{id}`
- Response Body (200 OK):

```json
{
  "id": "hjfdhdhdhghh",
  "model": "Alpha A7 III",
  "resolution": "24.2 MP",
  "sensorType": "Full-frame CMOS",
  "price": 1999.99,
  "features": ["4K video recording", "5-axis in-body image stabilization"],
  "status": "Created"
}
```

### Update a Camera (PUT)

- Endpoint: `/dslr/{id}`
- Request Body:

```json
{
  "sensorType": "Full-frame CMOS",
  "price": 1000000.00,
  "features": ["8K video recording", "5-axis in-body image stabilization"]
}
```

- Response Body (200 OK):

```json
{
  "id": "hjfdhdhdhghh",
  "model": "Alpha A7 III",
  "resolution": "24.2 MP",
  "sensorType": "Full-frame CMOS",
  "price": 1000000.00,
  "features": ["8K video recording", "5-axis in-body image stabilization"],
  "status": "Updated"
}
```

### Delete a Camera (DELETE)

- Endpoint: `/dslr/{id}`
- Response: 204 No Content

## Testing

### Postman

#### Create a Camera

- Method: POST
- Endpoint: `http://localhost:8080/camera/v1/dslr`
- Request Body: (see above example)
- Expected Response: 201 Created with the created camera object

#### Read a Camera

- Method: GET
- Endpoint: `http://localhost:8080/camera/v1/dslr/{id}`
- Expected Response: 200 OK with the requested camera object

#### Update a Camera

- Method: PUT
- Endpoint: `http://localhost:8080/camera/v1/dslr/{id}`
- Request Body: (see above example)
- Expected Response: 200 OK with the updated camera object

#### Delete a Camera

- Method: DELETE
- Endpoint: `http://localhost:8080/camera/v1/dslr/{id}`
- Expected Response: 204 No Content

usecase 1 -

steps-
1. Go to the Postman
2. Select request method as GET
3. Input the endpoint
4. Hit and send

expected response
-----------------

should return 200 ok with response body in case of successful fetching the data.
should return 400 Bad request in case of wrong URL.
should return 404 not found in case of no data found in the database.



PUT

resource endpoint - http://localhost:8080/camera/v1/dslr/{id}

request body
------------

{
"sensorType": "Full-frame CMOS",
"price": 1000000.00,
"features": ["8K video recording", "5-axis in-body image stabilization"]
}

response body
-------------

{
"id": "hjfdhdhdhghh"
"model": "Alpha A7 III",
"resolution": "24.2 MP",
"sensorType": "Full-frame CMOS",
"price": 1000000.00,
"features": ["8K video recording", "5-axis in-body image stabilization"],
"status": "Updated"
}

Steps-
1. Go to the Postman
2. Select request method as PUT
3. Input the endpoint
4. go to request body, and then raw use JSON
5. write data in JSON format, which you have to update
6. Hit and send

expected response
-----------------

should return 200 ok with response body in case of successful updating the data.
should return 400 Bad request in case of wrong URL.
should return 404 in case existing id doesnot exist in the database.


DELETE

resource endpoint - http://localhost:8080/camera/v1/dslr/{id}

Steps-
1. Go to the Postman
2. Select request method as DELETE
3. Input the endpoint
4. Hit and send

expected response
----------------

should return 204 no contant in case of successful deleting the data
should return 404 not found in case of id doesnot exist.
Should return 400 in case of id is invalid.







