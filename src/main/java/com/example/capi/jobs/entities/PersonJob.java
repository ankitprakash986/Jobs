package com.example.capi.jobs.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="person_job")
public class PersonJob implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "person_id")
    Long personId;
    @OneToOne
    @JoinColumn(name="job_id",referencedColumnName = "job_id")
    Jobs jobs;

}
