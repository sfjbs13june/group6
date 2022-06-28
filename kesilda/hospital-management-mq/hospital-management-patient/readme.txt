Sample Request for Post for Hospital Management Project with Mysql DB

1. Post URL : http://localhost:8081/addPatient

{
        "age": 33,
        "name": "kesil",
        "disease": "Brusitis"
    }

2.  Get URL : http://localhost:8081/showPatientDetails/4

3.  Get URL : http://localhost:8081/showAllPatient

4.  Delete URL : http://localhost:8081/removePatient/0


    SQL Commands:

    select * from db.hospital;

    select * from db.patient;