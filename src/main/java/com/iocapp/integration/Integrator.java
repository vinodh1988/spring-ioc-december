package com.iocapp.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.iocapp.system.ProcessX;
import com.iocapp.system2.AutomatedTask;

public class Integrator {
  @Autowired
 // @Qualifier("read")
  private ProcessX x; 
  @Autowired
 // @Qualifier("write")
  private ProcessX y;//Autowiring by name
  
  @Autowired
  private List<AutomatedTask> tasks;//all the implementations of
                               //Automated Task will be inject
  public void doTask() {
	  x.perform();
	  y.perform();
	  for(int i=0;i<tasks.size();i++)
		   tasks.get(i).make();
  }
}
