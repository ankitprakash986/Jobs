package com.example.capi.jobs.services;

import com.example.capi.jobs.entities.Jobs;
import com.example.capi.jobs.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobsServiceImpl implements JobsService {
    @Autowired
    private JobRepository jobRepository;
    @Override
    public List<Jobs> getJobs(String name) {
        return jobRepository.getByName(name);
    }
}
