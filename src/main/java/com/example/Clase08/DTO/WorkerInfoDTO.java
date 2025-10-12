package com.example.Clase08.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class WorkerInfoDTO {

    private String firstName;
    private String middleName;
    private String lastName;
    private Date dateOfBirth;
    private String address;
    private String city;
    private String state;
    private String country;
    private String postalCode;
    private String phoneNumber;
    private String alternatePhoneNumber;
    private String email;
    private Integer genderId;
    private String nationality;
    private String qualification;
    private String specialization;
    private Integer yearsOfExperience;
    private String previousCompany;
    private String previousJobTitle;
    private Date previousJobStartDate;
    private Date previousJobEndDate;
    private Integer jobId;
    private Date jobStartDate;
    private Date jobEndDate;
    private Double salary;
    private Integer contractTypeId;
    private String department;

}
