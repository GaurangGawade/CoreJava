package com.abc.example.model;

import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.*;
import lombok.RequiredArgsConstructor;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "student_name")
	private String studentName;
	@Column(name = "roll_no")
	private long rollNo;
	@Column(name = "qualification")
	private String qualification;
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinTable(name = "student_skill",
	joinColumns = {@JoinColumn(name="student_id")},
	inverseJoinColumns = {@JoinColumn(name="skill_id")}
	)
	private Set<Skills> skills = new HashSet<Skills>();
	@Override
	public String toString() {
	return "Student [id=" + id + ", studentName=" + studentName + ", rollNo=" + rollNo + ", qualification="
	+ qualification + "]";
	}
	

}
