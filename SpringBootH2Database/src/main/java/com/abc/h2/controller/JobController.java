package com.abc.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abc.h2.exception.ResourceNotFoundException;
import com.abc.h2.model.Job;
import com.abc.h2.service.JobServices;

@RestController
public class JobController {
	
	@Autowired
	private JobServices jobService;
	
	@GetMapping("/jobs")
	public List<Job> getAllJobs(){
	 return jobService.getJobs();
	}
	
	// request body covert json object to java obj
	@PostMapping("/jobs")
	public ResponseEntity<Job> saveJob(@RequestBody Job job){
	     return new
		 ResponseEntity<Job>(jobService.saveJob(job),HttpStatus.CREATED);
	}
	
	@PutMapping("/jobs/{id}")
	public ResponseEntity<Job> updateJobs(@RequestBody Job
	job, @PathVariable("id") long id) throws ResourceNotFoundException {
	 job.setId(id);
	 return new
     ResponseEntity<Job>(jobService.updateJob(job),HttpStatus.CREATED);
	}
	
	@DeleteMapping("/jobs/{id}")
	public ResponseEntity<String>deleteJobs(@PathVariable("id") long id) throws ResourceNotFoundException{
	 jobService.deleteJob(id);
	 return new
	 ResponseEntity<String>("Deleted",HttpStatus.OK);

	}

}
