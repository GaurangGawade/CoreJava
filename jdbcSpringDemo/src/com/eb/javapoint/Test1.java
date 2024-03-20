package com.eb.javapoint;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		
		EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
		int status=dao.saveEmployee(new Employee(105,"maliha",15000));
		System.out.println(status);
		
		List<Employee> employees =dao.employee();

		 for(Employee record : employees) 
		 {
		 System.out.print("ID : " + record.getId() );
		 System.out.print(", Name : " + record.getName() );
		 System.out.println(", salary : " + record.getSalary());
		 
		 }

		/*dao.updateEmployee(102, "Mohad");*/
		
		
		Employee e=new Employee();
		e.setId(104);
		int status1=dao.deleteEmployee(e);
		System.out.println(status1);
		
		
	

	}

}
