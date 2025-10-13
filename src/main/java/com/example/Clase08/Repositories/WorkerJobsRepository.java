package com.example.Clase08.Repositories;

import com.example.Clase08.Entities.WorkerJobs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerJobsRepository extends JpaRepository<WorkerJobs,Integer> {
}
