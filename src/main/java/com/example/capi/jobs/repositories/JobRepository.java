package com.example.capi.jobs.repositories;

import com.example.capi.jobs.entities.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface JobRepository extends JpaRepository<Jobs,Long> {
     List<Jobs> getByName(String name);
}