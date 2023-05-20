package com.truviq.camunda;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.ArrayList;

public class DeserializeArrayListVariable implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {

        // Get the serialized ArrayList variable
        ArrayList<Object> serializedData = (ArrayList<Object>) execution.getVariable("NameOfPromoter");

        // Serialize ArrayList as JSON
        
        ObjectMapper objectMapper = new ObjectMapper();
        
        System.out.println(objectMapper);
        
        String json = objectMapper.writeValueAsString(serializedData);
        System.out.println(json);
        

        // Set the variable as JSON
        execution.setVariable("PromotersDetails", json);
    }
}
