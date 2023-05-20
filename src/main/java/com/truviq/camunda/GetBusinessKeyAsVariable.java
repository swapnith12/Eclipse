package com.truviq.camunda;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class GetBusinessKeyAsVariable  implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		String businessKey=(String)execution.getBusinessKey();
		execution.setVariable("BusinessKey", businessKey);
		
	}

}
