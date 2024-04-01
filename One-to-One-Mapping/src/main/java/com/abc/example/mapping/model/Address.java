package com.abc.example.mapping.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

	@Data
	@Entity
	@Table(name = "address")
	public class Address {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		@Column(name = "zip_code")
		private String zipCode;
		@Column(name = "state")
		private String state;
		@Column(name = "country")
		private String country;
	}
