package com.example.Clase08.Repositories;

import com.example.Clase08.Entities.WorkerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerInfoRepository extends JpaRepository<WorkerInfo,Integer> {
}
