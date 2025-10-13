package com.example.Clase08.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "\"Professional_Info\"")
public class ProfessionalInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "worker_id")
    private Integer workerId;

    @Column(name = "qualification")
    private String qualification;

    @Column(name = "specialization")
    private String specialization;

    @Column(name = "years_of_experience")
    private Integer yearsOfExperience;

    @Column(name = "previous_company")
    private String previousCompany;

    @Column(name = "previous_job_title")
    private String previousJobTitle;

    @Column(name = "previous_job_start_date")
    private Date previousJobStartDate;

    @Column(name = "previous_job_end_date")
    private Date previousJobEndDate;

}
