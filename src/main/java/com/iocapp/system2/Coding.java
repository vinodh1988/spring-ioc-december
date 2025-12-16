package com.iocapp.system2;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class Coding implements AutomatedTask {

	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("Coding Activity");
	}

}
