package com.iocapp.system;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("read")
@Primary
public class ReadData implements ProcessX {
	{
		System.out.println("ReadData Intiated");
	}
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Reading data from the Storage");
	}

}
