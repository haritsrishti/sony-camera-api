# sony-camera-api

Project Name - sony-camera-api

Package - com.sony.camera

source - controller, service, request, response, config, model, mapper, util, constants, repository

testing - controller, service, request, response, config, model, mapper, util, constants, repository

Host name - http://localhost:8080

Context root: /camera/v1

For CREATE use Post
-------------------

Resource URI: /dslr

http response status: 200 ok, 201 created
for bad payload: 400 bad request

request

{
"model": "Alpha A7 III",
"resolution": "24.2 MP",
"sensorType": "Full-frame CMOS",
"price": 1999.99,
"features": ["4K video recording", "5-axis in-body image stabilization"]
}

response

{
"id": "hjfdhdhdhghh"
"model": "Alpha A7 III",
"resolution": "24.2 MP",
"sensorType": "Full-frame CMOS",
"price": 1999.99,
"features": ["4K video recording", "5-axis in-body image stabilization"],
"status": "Created"
}


For Read use GET
----------------

resource URI: /{id}

http response status: 200 ok
for bad payload: 400 bad request

responce

{
"id": "hjfdhdhdhghh"
"model": "Alpha A7 III",
"resolution": "24.2 MP",
"sensorType": "Full-frame CMOS",
"price": 1999.99,
"features": ["4K video recording", "5-axis in-body image stabilization"],
"status": "Created"
}


For Update use put
------------------

resource URI: /{id}

http response status: 200 ok
for bad payload: 400 bad request

request
{
"sensorType": "Full-frame CMOS",
"price": 1000000.00,
"features": ["8K video recording", "5-axis in-body image stabilization"]
}

response

{
"id": "hjfdhdhdhghh"
"model": "Alpha A7 III",
"resolution": "24.2 MP",
"sensorType": "Full-frame CMOS",
"price": 1000000.00,
"features": ["8K video recording", "5-axis in-body image stabilization"],
"status": "Updated"
}


For Delete use delete

204 no content

resource URI: /{id}

response
none



TESTING STRETEGIES

POST

resource endpoint - http://localhost:8080/camera/v1/dslr

request body
------------
{
"model": "Alpha A7 III",
"resolution": "24.2 MP",
"sensorType": "Full-frame CMOS",
"price": 1999.99,
"features": ["4K video recording", "5-axis in-body image stabilization"]
}


response body
-------------
{
"id": "hjfdhdhdhghh"
"model": "Alpha A7 III",
"resolution": "24.2 MP",
"sensorType": "Full-frame CMOS",
"price": 1999.99,
"features": ["4K video recording", "5-axis in-body image stabilization"],
"status": "Created"
}


usecase1 -

steps
1. Go to the Postman
2. Select request method as POST
3. Input the endpoint
4. go to request body, and then raw use JSON
5. write data in JSON format
6. Hit and send

Expected Response
-----------------

should return 201 created with response body in case of successful creation
should return 400 Bad request in case of bad payload.




GET

resource endpoint - http://localhost:8080/camera/v1/dslr/{id}

responce body
--------------

{
"id": "hjfdhdhdhghh"
"model": "Alpha A7 III",
"resolution": "24.2 MP",
"sensorType": "Full-frame CMOS",
"price": 1999.99,
"features": ["4K video recording", "5-axis in-body image stabilization"],
"status": "Created"
}

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







