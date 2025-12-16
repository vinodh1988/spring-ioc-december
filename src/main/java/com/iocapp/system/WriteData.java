package com.iocapp.system;

import org.springframework.stereotype.Component;

@Component("write")
public class WriteData implements ProcessX {

	@Override
	public void perform() {
		// TODO Auto-generated method stub
        System.out.println("Writing data into disk");
	}

}
