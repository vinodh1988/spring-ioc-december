package com.iocapp.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.iocapp.system.ProcessX;

public class Integrator {
  @Autowired
  @Qualifier("read")
  private ProcessX x; 
  @Autowired
  @Qualifier("write")
  private ProcessX y;//Autowiring by name
  // this is only reference (null by default)
            //but spring ioc injects object if it finds anything appropriate
     //in our cass there is only implementation for ProcessX ie., ReadData
     //so ReadData singleton is injected
  public void doTask() {
	  x.perform();
	  y.perform();
  }
}
