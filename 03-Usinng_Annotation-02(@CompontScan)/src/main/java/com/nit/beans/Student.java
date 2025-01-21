package com.nit.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stu")
public class Student {
	@Value("234")
	private int roll;
	@Value("Bab")
	private String name;
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	

}
