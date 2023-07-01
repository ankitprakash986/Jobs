package com.example.capi.jobs.controller;

import com.example.capi.jobs.dto.PersonJobResponse;
import com.example.capi.jobs.services.JobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class JobsController {
    @Autowired
    private JobsService jobsService;
    @GetMapping("/ping")
    public ResponseEntity<String> ping (){
        return ResponseEntity.ok("I m Working.");
    }

    @GetMapping("/job/{personId}")
    public ResponseEntity<PersonJobResponse> fetchJobsByPersonId(@PathVariable String personId){
        return ResponseEntity.ok(jobsService.fetchJobsByPersonId(Long.parseLong(personId)));
    }
}
