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
public class WorkerJobs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "worker_id")
    private Integer workerId;

    @Column(name = "job_start_date")
    private Date jobStartDate;

    @Column(name = "job_end_date")
    private Date jobEndDate;

    @Column(name = "salary")
    private Integer salary;

    @Column(name = "contract_type_id")
    private Integer contractTypeId;

    @Column(name = "department")
    private String department;

}
