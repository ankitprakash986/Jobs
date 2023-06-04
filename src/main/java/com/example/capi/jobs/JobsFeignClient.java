package com.example.capi.jobs;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "jobs-feign-client")
public interface JobsFeignClient {
}
