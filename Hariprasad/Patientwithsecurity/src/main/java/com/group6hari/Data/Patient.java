package com.group6hari.Data;

import java.util.Objects;

public class Patient{
    public String name;
    public String role;

    public Patient() {
    }

    public Patient(String name, String role) {

        this.name = name;
        this.role = role;
    }

    public String getName() {
        return this.name;
    }

    public String getRole() {
        return this.role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Patient))
            return false;
        Patient patient = (Patient) o;
        return Objects.equals(this.name, patient.name)
                && Objects.equals(this.role, patient.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.role);
    }

    @Override
    public String toString() {
        return "Patient{" + ", name='" + this.name + '\'' + ", role='" + this.role + '\'' + '}';
    }
}