package com.example.Clase08.Services;

import com.example.Clase08.DTO.WorkerInfoDTO;
import com.example.Clase08.Entities.ProfessionalInfo;
import com.example.Clase08.Entities.WorkerInfo;
import com.example.Clase08.Entities.WorkerJobs;
import com.example.Clase08.Repositories.ProfessionalInfoRepository;
import com.example.Clase08.Repositories.WorkerInfoRepository;
import com.example.Clase08.Repositories.WorkerJobsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class WorkerService {

    private final WorkerInfoRepository workerInfoRepository;
    private final ProfessionalInfoRepository professionalInfoRepository;
    private final WorkerJobsRepository workerJobsRepository;

    public void CreateNewWorker(WorkerInfoDTO workerInfoDTO){

        WorkerInfo workerInfo = new WorkerInfo();
        workerInfo.setFirstName(workerInfoDTO.getFirstName());
        workerInfo.setMiddleName(workerInfoDTO.getMiddleName());
        workerInfo.setLastName(workerInfoDTO.getLastName());
        workerInfo.setDateOfBirth(workerInfoDTO.getDateOfBirth());
        workerInfo.setAddress(workerInfoDTO.getAddress());
        workerInfo.setCity(workerInfoDTO.getCity());
        workerInfo.setState(workerInfoDTO.getState());
        workerInfo.setCountry(workerInfoDTO.getCountry());
        workerInfo.setPostalCode(workerInfoDTO.getPostalCode());
        workerInfo.setPhoneNumber(workerInfoDTO.getPhoneNumber());
        workerInfo.setAlternatePhoneNumber(workerInfoDTO.getAlternatePhoneNumber());
        workerInfo.setEmail(workerInfoDTO.getEmail());
        workerInfo.setGenderId(workerInfoDTO.getGenderId());
        workerInfo.setNationality(workerInfoDTO.getNationality());

        ProfessionalInfo professionalInfo = new ProfessionalInfo();
        professionalInfo.setQualification(workerInfoDTO.getQualification());
        professionalInfo.setSpecialization(workerInfoDTO.getSpecialization());
        professionalInfo.setYearsOfExperience(workerInfoDTO.getYearsOfExperience());
        professionalInfo.setPreviousCompany(workerInfoDTO.getPreviousCompany());
        professionalInfo.setPreviousJobTitle(workerInfoDTO.getPreviousJobTitle());
        professionalInfo.setPreviousJobStartDate(workerInfoDTO.getPreviousJobStartDate());
        professionalInfo.setPreviousJobEndDate(workerInfoDTO.getPreviousJobEndDate());

        WorkerJobs workerJobs = new WorkerJobs();
        workerJobs.setJobStartDate(workerInfoDTO.getJobStartDate());
        workerJobs.setJobEndDate(workerInfoDTO.getJobEndDate());
        workerJobs.setSalary(workerInfoDTO.getSalary());
        workerJobs.setContractTypeId(workerInfoDTO.getContractTypeId());
        workerJobs.setDepartment(workerInfoDTO.getDepartment());

        workerInfoRepository.save(workerInfo);
        professionalInfoRepository.save(professionalInfo);
        workerJobsRepository.save(workerJobs);

    }
}
