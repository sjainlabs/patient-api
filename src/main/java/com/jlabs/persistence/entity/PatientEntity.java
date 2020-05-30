package com.jlabs.persistence.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "PATIENT")
public class PatientEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "AGE")
    private int age;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "CITY")
    private String city;
    @Column(name = "STATE")
    private String state;
    @Column(name = "ZIPCODE")
    private Integer zipCode;
    @Column(name = "CONTACT")
    private String contact;
    @Column(name = "EMERGENCY_CONTACT")
    private String emergencyContact;
    @Column(name = "CARE_OF")
    private String careOf;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "WEIGHT")
    private Double weight;
    @Column(name = "HEIGHT")
    private Double height;
    @Column(name = "SYMPTONS")
    private String symptoms;
    @Column(name = "PRESCRIPTION")
    private String prescription;
    @Column(name = "ADDITIONAL_NOTES")
    private String additionalNotes;
}
