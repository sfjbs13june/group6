package com.group6hari20.Data;

import java.util.Objects;

public class Patient{
    public int pid;
    public String name;
    public String age;
    public String disease;

    public Patient() {
    }

    public Patient(int pid, String name, String age, String disease) {
        this.pid = pid;
        this.name = name;
        this.age = age;
        this.disease = disease;
    }
    public int getPid() { return this.pid; }
    public void setId(int pid) { this.pid = pid; }

    public String getName() { return this.name;}
    public void setName(String name) { this.name = name; }


    public String getAge() { return this.age;}
    public void setAge(String age) { this.age = age; }

    public String getDisease() {return this.disease;  }
    public void setDisease(String occupation) {this.disease= disease; }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Patient))
            return false;
        Patient patient = (Patient) o;
        return Objects.equals(this.pid, patient.pid)
                && Objects.equals(this.name, patient.name)
                && Objects.equals(this.age, patient.age)
                && Objects.equals(this.disease, patient.disease);

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.pid, this.name, this.age, this.disease);
    }

    @Override
    public String toString() {
        return "Patient{" + ", name='" + this.name + '\'' + ", age='" + this.age + '\'' + '}';
    }
}