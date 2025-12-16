package com.iocapp.system;

import org.springframework.stereotype.Component;

@Component
public class ReadData implements Process {
	{
		System.out.println("ReadData Intiated");
	}
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Reading data from the Storage");
	}

}
