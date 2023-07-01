package com.example.capi.jobs.services;

import com.example.capi.jobs.dto.PersonJobResponse;
import com.example.capi.jobs.entities.Jobs;
import com.example.capi.jobs.entities.PersonJob;
import com.example.capi.jobs.mapper.PersonJobResponseMapper;
import com.example.capi.jobs.repositories.JobRepository;
import com.example.capi.jobs.repositories.PersonJobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobsServiceImpl implements JobsService {
    @Autowired
    private JobRepository jobRepository;
    @Autowired
    private PersonJobRepository personJobRepository;
    @Autowired
    private PersonJobResponseMapper personJobResponseMapper;
    @Override
    public List<Jobs> getJobs(String name) {
        return jobRepository.getByName(name);
    }

    public PersonJobResponse fetchJobsByPersonId(Long id){
        List<PersonJob> personJobs= personJobRepository.getPersonJobByPersonId(id);

        PersonJobResponse personJobResponse ;

        personJobResponse=personJobResponseMapper.convertToPersonJobResponse(personJobs);

        return personJobResponse;
    }
}
