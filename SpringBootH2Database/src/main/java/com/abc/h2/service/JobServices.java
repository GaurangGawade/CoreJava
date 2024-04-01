package com.abc.h2.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;
import com.abc.h2.exception.ResourceNotFoundException;
import com.abc.h2.model.Job;
import com.abc.h2.repository.JobRepository;

@Service
@Transactional
public class JobServices {
	
	@Autowired
	private JobRepository jobRepository;
	/*
	 * Post into H2 database
	 */
	public Job saveJob(Job job) 
	{
	 return jobRepository.save(job);
	}
	/*
	 * Get List from H2 db
	 */
	public List<Job> getJobs()
	{
	 return jobRepository.findAll();
	}
	/*
	 * Update Job in H2 DB
	 */
	public Job updateJob(Job job) throws ResourceNotFoundException 
	{
		Optional<Job> job_new = jobRepository.findById(job.getId());
	 if(!job_new.isPresent()) {
	 throw new ResourceNotFoundException("Resource Not Found!!!!");

	 }
	 else 
	 {
		 Job job2 = job_new.get();
		 job2.setJobDescription(job.getJobDescription());
		 job2.setId(job.getId());
		 job2.setJobLocation(job.getJobLocation());
		 job2.setJobName(job.getJobName());
		 job2.setJobType(job.getJobType());
		 jobRepository.save(job2);
		 return job2;
	 }

	}
	/*
	 * Get Job By id from H2 DB
	 */
	public Job getJobById(long id) throws
	ResourceNotFoundException {
	 Optional<Job> job_new = jobRepository.findById(id);
	 if(!job_new.isPresent()) {
	 throw new ResourceNotFoundException("Resource Not Found!!!!");
	 }else {
	 return job_new.get();
	 }

	}
	/*
	 * Delete Job
	 */
	public void deleteJob(long id) throws ResourceNotFoundException {
	 Optional<Job> job_new = jobRepository.findById(id);
	 if(!job_new.isPresent()) {
	 throw new ResourceNotFoundException("Resource NotFound!!!!");
	 }
	 
	 else 
		 {
		 jobRepository.delete(job_new.get());
		
		 }
	
	}

	

}
