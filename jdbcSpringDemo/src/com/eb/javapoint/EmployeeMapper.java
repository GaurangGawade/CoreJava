package com.eb.javapoint;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee>{
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Employee e1=new Employee();
		e1.setId(rs.getInt("id"));
		e1.setName(rs.getString("name"));
		e1.setSalary(rs.getFloat("salary"));
		return e1;
	}

}
