package com.example.capi.jobs.controller;

import com.example.capi.jobs.entities.Jobs;
import com.example.capi.jobs.services.JobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobsController {
    @Autowired
    private JobsService jobsService;
    @GetMapping("/ping")
    public ResponseEntity<String> ping (){
        return ResponseEntity.ok("I m Working.");
    }

    @GetMapping("/jobs/{name}")
    public ResponseEntity<List<Jobs>> getJobs(@PathVariable("name") String asxax){
        return ResponseEntity.ok(jobsService.getJobs(asxax));
    }

    @GetMapping("/jobs")
    public ResponseEntity<List<Jobs>> getJobsRequestParam(@RequestParam String asxax){
        return ResponseEntity.ok(jobsService.getJobs(asxax));
    }
}
