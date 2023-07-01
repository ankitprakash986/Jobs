package com.example.capi.jobs.dto;

import lombok.Data;

import java.util.List;
@Data
public class PersonJobResponse {
    Long personId;
    List<JobsDTO> jobs;
}
