package com.cts.demos.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.demos.configuration.ApplicationConfig;
import com.cts.demos.model.Employee;
import com.cts.demos.model.Student;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		/*
		 * Employee employee=(Employee)context.getBean("employee");
		 * employee.setId("E0001"); employee.setName("Umesh");
		 * employee.setDesig("Analyst"); System.out.println(employee.getId());
		 * System.out.println(employee.getName());
		 * System.out.println(employee.getDesig());
		 */
        Student student=(Student)context.getBean("student");
        student.setName("Rajib");
        System.out.println(student.getName());
	}

}
