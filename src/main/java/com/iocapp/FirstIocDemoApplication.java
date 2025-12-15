package com.iocapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.iocapp.system.Activity;

@SpringBootApplication
public class FirstIocDemoApplication {

	public static void main(String[] args) {
	  //you dont need to create application context
		// the below line will create it
	ApplicationContext ac=	SpringApplication.run(FirstIocDemoApplication.class, args);
	System.out.println(ac.getId());
	System.out.println("Code finished");
	
	Activity obj=(Activity)ac.getBean("simpledoc");
	obj.task();
	System.out.println(obj.hashCode());
	obj=(Activity)ac.getBean("simpledoc");
	obj.task();
	System.out.println(obj.hashCode());
	obj=(Activity)ac.getBean("simpledoc");
	obj.task();
	System.out.println(obj.hashCode());
	
	obj=(Activity)ac.getBean("simpledoc");
	obj=(Activity)ac.getBean("digidoc");
	obj.task();
	System.out.println(obj.hashCode());
	obj=(Activity)ac.getBean("digidoc");
	obj.task();
	obj=(Activity)ac.getBean("digidoc");
	System.out.println(obj.hashCode());
	obj=(Activity)ac.getBean("digidoc");
	obj.task();
	System.out.println(obj.hashCode());
	}

}
