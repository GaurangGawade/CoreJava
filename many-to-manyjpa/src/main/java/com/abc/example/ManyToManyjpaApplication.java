package com.abc.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.abc.example.model.Skills;
import com.abc.example.model.Student;
import com.abc.example.repository.SkillsRepository;
import com.abc.example.repository.StudentRepository;

@SpringBootApplication
public class ManyToManyjpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ManyToManyjpaApplication.class, args);
		StudentRepository studentRepository = context.getBean(StudentRepository.class);
		SkillsRepository skillRepository = context.getBean(SkillsRepository.class);
		// create student object
		Student student = new Student();
		student.setStudentName("Robert");
		student.setQualification("BE");
		student.setRollNo(5);
		// Add One skills
		Skills skills = new Skills();
		skills.setSkillName("Java");
		skills.setSkillsScore("90%"); 
		// Add another skills
		Skills skills2 = new Skills();
		skills2.setSkillName("Python");
		skills2.setSkillsScore("45%");
		// Add skills to Student
		student.getSkills().add(skills);
		student.getSkills().add(skills2);
		// Add student to Skills;
		skills.getStudents().add(student);
		skills2.getStudents().add(student);
		// saving..
		studentRepository.save(student); //we have use CASCADE_ALL 
		}


}
