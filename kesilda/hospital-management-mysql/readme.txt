Sample Request for Post for Hospital Management Project with Mysql DB

1. Post URL : http://localhost:8080/addPatient

{
        "age": 33,
        "name": "kesil",
        "disease": "Brusitis"
    }

2.  Get URL : http://localhost:8080/showPatientDetails/4

3.  Get URL : http://localhost:8080/showAllPatient

4.  Delete URL : http://localhost:8080/removePatient/0


5. Post URL : http://localhost:8080/addHospital

{

        "name": "KCG",
        "address": "Coimbatore"
    }

6.  Get URL : http://localhost:8080/getAllHospital

7.  Delete URL : http://localhost:8080/removeHospital/5

8. PUT URL: http://localhost:8080/modifyHospitalDetails

{
      "td":6,
        "name": "Km Diag",
        "address": "Coimbatore1"
    }

    SQL Commands:

    select * from db.hospital;

    select * from db.patient;