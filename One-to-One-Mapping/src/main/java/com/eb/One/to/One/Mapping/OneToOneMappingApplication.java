package com.eb.One.to.One.Mapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.abc.example.mapping.model.Address;
import com.abc.example.mapping.model.Employee;
import com.abc.example.mapping.repository.AddressRepository;
import com.abc.example.mapping.repository.EmployeeRepository;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OneToOneMappingApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(OneToOneMappingApplication.class, args);
		EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);
		AddressRepository addressRepository = context.getBean(AddressRepository.class);
		Address address = new Address();
		address.setZipCode("425201");
		address.setCountry("USA");
		address.setState("Newyork");
		Employee employee = new Employee();
		employee.setEmpName("Nicolas");
		employee.setAddress(address);
		employeeRepository.save(employee);

	}

}
