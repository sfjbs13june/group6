Sample Request for Post for Hospital Management Project with Mysql DB


 http://localhost:8082/postMessage?msg=Hello Kesilda (MQ Test URL)


1. Post URL : http://localhost:8081/addPatient

{
        "age": 33,
        "name": "kesil",
        "disease": "Brusitis"
    }

2.  Get URL : http://localhost:8081/showPatientDetails/4

3.  Get URL : http://localhost:8081/showAllPatient

4.  Delete URL : http://localhost:8081/removePatient/0

5. Post URL : http://localhost:8082/addHospital

{

        "name": "KCG",
        "address": "Coimbatore"
    }

6.  Get URL : http://localhost:8082/getAllHospital

7.  Delete URL : http://localhost:8082/removeHospital/5

8. PUT URL: http://localhost:8082/modifyHospitalDetails

{
      "td":6,
        "name": "Km Diag",
        "address": "Coimbatore1"
    }

    SQL Commands:

    select * from db.hospital;

    select * from db.patient;