package com.example.capi.jobs.mapper;

import com.example.capi.jobs.dto.JobsDTO;
import com.example.capi.jobs.dto.PersonJobResponse;
import com.example.capi.jobs.entities.PersonJob;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class PersonJobResponseMapper {

    public PersonJobResponse convertToPersonJobResponse(List<PersonJob> personJobs){
        PersonJobResponse personJobResponse = new PersonJobResponse();
        personJobResponse.setPersonId(personJobs.get(0).getPersonId());
        List<JobsDTO> jobs = new ArrayList<>();
        personJobs.forEach(personJob-> {
            JobsDTO jobsDTO = new JobsDTO();
            jobsDTO.setId(personJob.getJobs().getId());
            jobsDTO.setName(personJob.getJobs().getName());
            jobsDTO.setDescription(personJob.getJobs().getDescription());
            jobsDTO.setType(personJob.getJobs().getType());
            jobs.add(jobsDTO);
        });
//        for(PersonJob personJob:personJobs){
//            jobs.add(personJob.getJobs());
//        }

        personJobResponse.setJobs(jobs);
        return personJobResponse;
    }
}
