Sample Request for Post

1. Post URL : http://localhost:8080/addPatient

{
        "id": 3,
        "age": 33,
        "name": "VioletKesi",
        "disease": "Brusitis"
    }

2. PUT URL : http://localhost:8080/modifyDetails/3


   {
           "id": 3,
           "age": 33,
           "name": "Violet",
           "disease": "Brusitis"
       }

3.  Get URL : http://localhost:8080/showPatientDetails/2

4.  Get URL : http://localhost:8080/showAllPatient

5.  Delete URL : http://localhost:8080/removePatient/3


6. Post URL : http://localhost:8080/addHospital

{
        "id": 3,
        "name": "KCG",
        "address": "Coimbatore"
    }

7. PUT URL : http://localhost:8080/modifyHospitalDetails/3


   {
           "id": 3,
           "name": "KCG1",
           "address": "Coimbatore"
       }


8.  Get URL : http://localhost:8080/getAllHospital

9.  Delete URL : http://localhost:8080/removeHospital/3

10.  docker run -p 8082:8080 kesilda017/hospital-management:1.0.0
