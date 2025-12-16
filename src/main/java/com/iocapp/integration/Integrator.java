package com.iocapp.integration;

import org.springframework.beans.factory.annotation.Autowired;

import com.iocapp.system.ProcessX;

public class Integrator {
  @Autowired
  private ProcessX write; 
  @Autowired
  private ProcessX read;
  // this is only reference (null by default)
            //but spring ioc injects object if it finds anything appropriate
     //in our cass there is only implementation for ProcessX ie., ReadData
     //so ReadData singleton is injected
  public void doTask() {
	  read.perform();
	  write.perform();
  }
}
