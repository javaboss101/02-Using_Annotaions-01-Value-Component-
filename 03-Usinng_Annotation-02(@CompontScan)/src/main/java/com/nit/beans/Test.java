package com.nit.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Java_Config.class);
		Student stu=(Student)context.getBean("stu");
		
		
		System.out.println(stu);
	}

}
