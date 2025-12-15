package com.iocapp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.iocapp.system.Activity;
import com.iocapp.system.DigitalDocumenting;
import com.iocapp.system.Documenting;

@Configuration
public class CentralConfig {

	{
		System.out.println("CentralConfig instantiated");
	} // runs automatically everytime object is created
	
	@Bean(name="simpledoc")
	public Activity document() {
		return new Documenting();
	}

	@Bean(name="digidoc")
	public Activity DigitalDocumenting() {
		return new DigitalDocumenting();
	}
}

