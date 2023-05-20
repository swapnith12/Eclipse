package com.truviq.camunda;
import java.time.LocalDateTime;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class Subtract30days implements JavaDelegate {
public void execute(DelegateExecution execution) throws Exception {
		
		// TODO Auto-generated method stub
		String dateString = (String)execution.getVariable("ending");
		LocalDateTime dateTime = LocalDateTime.parse(dateString);
		LocalDateTime newDateTime = dateTime.minusDays(1);
		String newDateString = newDateTime.toString(); 
		execution.setVariable("OneDaylessISO", newDateString);// in ISO 8601 format
		System.out.println(newDateString);
		
	}

}
