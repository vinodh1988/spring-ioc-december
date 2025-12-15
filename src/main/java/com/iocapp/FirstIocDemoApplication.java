package com.iocapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstIocDemoApplication {

	public static void main(String[] args) {
	  //you dont need to create application context
		// the below line will create it
	ApplicationContext ac=	SpringApplication.run(FirstIocDemoApplication.class, args);
	System.out.println(ac.getId());
	System.out.println("Code finished");
	}

}
