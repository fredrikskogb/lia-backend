package com.example.accessingdatamongodb.model;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;



public class Customer {

    @Id
    private String id;

    private String firstName;
    private String lastName;
    private String birthDate;
    private String email;
    private LocalDate customerCreated;
    private String password;

    private Customer() {}

    public Customer(String firstName, String lastName, String birthDate, String email, LocalDate customerCreated,
    String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.customerCreated = customerCreated;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getCustomerCreated() { return customerCreated; }

    public void setCustomerCreated(LocalDate customerCreated) {
        this.customerCreated = customerCreated;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String email) {
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s', birthDate='%s', email='%s', customerCreated='%s', password='%s']",
                id, firstName, lastName, birthDate, email, customerCreated, password);
    }

}