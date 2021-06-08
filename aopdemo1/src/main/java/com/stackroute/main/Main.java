package com.stackroute.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.stackroute.config.ConfigClass;
import com.stackroute.model.Student;


public class Main {

	public static void main(String[] args) {AbstractApplicationContext context=new AnnotationConfigApplicationContext(ConfigClass.class);
	Student student=(Student)context.getBean("student");
	  student.setName("Ram");
     String name=student.getName();
	System.out.println(name);
	student.setMarks(10);
    int marks=student.getMarks();
    System.out.println(marks);
	}

}
