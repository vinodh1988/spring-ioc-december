package com.iocapp.system2;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(4)
public class Deployment implements AutomatedTask{

	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("Deployment Task....");
	}

}
