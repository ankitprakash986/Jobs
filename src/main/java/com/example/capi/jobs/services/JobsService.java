package com.example.capi.jobs.services;

import com.example.capi.jobs.entities.Jobs;

import java.util.List;

public interface JobsService {
    List<Jobs> getJobs(String name);
}
