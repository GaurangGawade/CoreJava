package com.abc.h2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.abc.h2.model.Job;

public interface JobRepository extends JpaRepository<Job,Long> {


}
