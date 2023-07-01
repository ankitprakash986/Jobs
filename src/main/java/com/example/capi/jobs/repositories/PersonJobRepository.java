package com.example.capi.jobs.repositories;

import com.example.capi.jobs.entities.PersonJob;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonJobRepository extends JpaRepository<PersonJob,Long> {


    List<PersonJob> getPersonJobByPersonId(Long id);
}
