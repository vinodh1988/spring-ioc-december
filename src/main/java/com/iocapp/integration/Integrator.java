package com.iocapp.integration;

import org.springframework.beans.factory.annotation.Autowired;

import com.iocapp.system.ProcessX;

public class Integrator {
  @Autowired
  private ProcessX p;
  
  public void doTask() {
	  p.perform();
  }
}
