package com.abc.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.example.model.Skills;

@Repository
public interface SkillsRepository extends JpaRepository<Skills, Long> {
		
	Skills findBySkillName(String string);

}
