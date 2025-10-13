package com.example.Clase08.Controllers;

import com.example.Clase08.DTO.WorkerInfoDTO;
import com.example.Clase08.Services.WorkerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class WorkerController {

    private WorkerService workerService;

    @PostMapping("/createworker")
    public void CrearUsuario(@RequestBody WorkerInfoDTO workerInfoDTO){
        workerService.CreateNewWorker(workerInfoDTO);
    }
}
