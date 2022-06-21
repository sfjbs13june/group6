package com.eshika.training.data;

import java.util.Objects;

public class patient {

    public String name;
    public int age;
    public int id;
    public String disease;

    public patient() {
    }

    public patient(String name,int age, int id, String disease) {

        this.name = name;
        this.age=age;
        this.id=id;
        this.disease=disease;

    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getId() { return this.id; }

    public String getDisease() {
        return this.disease;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setDisease(String disease) {
        this.disease = disease;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof com.eshika.training.data.patient))
            return false;
        com.eshika.training.data.patient patient = (com.eshika.training.data.patient) o;
        return Objects.equals(this.name, patient.name)
                && Objects.equals(this.age, patient.age)
                && Objects.equals(this.id, patient.id)
                && Objects.equals(this.disease, patient.disease);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.age, this.id, this.disease);
    }

    @Override
    public String toString() {
        return "Patient{" + ", name='" + this.name + '\'' + ", age='" + this.age + '\'' + ", id='" + this.id + ", disease='" + this.disease + '\'' + '}';
    }
}
