Sample Request for Post for Hospital Management Project with Mongo DB

1. Post URL : http://localhost:8080/addPatient

{
        "patTd": 3,
        "age": 33,
        "name": "kesil",
        "disease": "Brusitis"
    }

2.  Get URL : http://localhost:8080/showPatientDetails/kesil

3.  Get URL : http://localhost:8080/showAllPatient

4.  Delete URL : http://localhost:8080/removePatient/kesil


5. Post URL : http://localhost:8080/addHospital

{
        "hospitalId": 1,
        "name": "KCG",
        "address": "Coimbatore"
    }

6.  Get URL : http://localhost:8080/getAllHospital

7.  Delete URL : http://localhost:8080/removeHospital/KCG


#Show data::

docker exec -it third-mongo-spring-data_mongo_1 bash

mongo

show dbs

use test_db

show tables

db.hospital.find()

db.patient.find()





