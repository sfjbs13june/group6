package com.group6project2.Data;

import java.util.Objects;

public class Patient{
    public int pid;
    public String name;
    public String age;
    public String occupation;

    public Patient() {
    }

    public Patient(int pid, String name, String age, String occupation) {
        this.pid = pid;
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }
    public int getPid() {
        return this.pid;
    }
    public String getName() { return this.name;}
    public String getAge() {
        return this.age;
    }
    public String getOccupation() {
        return this.occupation;
    }

    public void setId(int pid) {
        this.pid = pid;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

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
                && Objects.equals(this.occupation, patient.occupation);

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.pid, this.name, this.age, this.occupation);
    }

    @Override
    public String toString() {
        return "Patient{" + ", pid='" + this.pid + '\'' + ", name='" + this.name + '\'' + ", age='" + this.age +'\'' + '}';
    }
}