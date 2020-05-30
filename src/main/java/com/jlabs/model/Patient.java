package com.jlabs.model;

import lombok.*;

/**
 * Created by sjain on 5/25/20.
 */

@Getter
@NoArgsConstructor
@Builder(toBuilder = true)
@ToString
@AllArgsConstructor
public class Patient {

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String city;
    private String state;
    private int zipCode;
    private String contactNumber;
    private String emergencyContactNumber;
    private String careOf;
    private String email;
    private Double weight;
    private Double height;
    private String symptoms;
    private String prescriptions;
    private String additionalNotes;
}
