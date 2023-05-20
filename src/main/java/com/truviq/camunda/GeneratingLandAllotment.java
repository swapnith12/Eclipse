/*package com.truviq.camunda;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;


public class GeneratingLandAllotment implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		if((Boolean)execution.getVariable("APIICApproval")){
		int landnumber=(int)(Math.random()*1000);
		System.out.println(landnumber);
		execution.setVariable("LandNumber", landnumber+"");
		}
		
	}
	}
	*/
	


package com.truviq.camunda;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class GeneratingLandAllotment implements JavaDelegate{
	@Override
	public void execute(DelegateExecution execution)throws Exception{
		
		PreparedStatement getStatement=null;
		PreparedStatement updateStatement=null;
		Connection conn=null;
			
		try {
		int latest=0;
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/LandAllotment","root","root");
		String get ="Select LatestLandNumber from landallotment.storelandnumber where Getter='getter';";
		
		
	     getStatement=conn.prepareStatement(get);

		
		ResultSet rs=getStatement.executeQuery();
		while(rs.next()) {
			latest=rs.getInt("LatestLandNumber");
		}
		latest++;
		
		
		String update="update landallotment.storelandnumber set latestlandnumber ="+latest+" where Getter='getter';";
		updateStatement=conn.prepareStatement(update);
		updateStatement.executeUpdate();
		execution.setVariable("LandNumber", latest);
		
		
		System.out.println("Succesfully fetched and updated the Land Number with  latest value ");
    
		     }
		catch(SQLException exception) {
			exception.printStackTrace();
		}
		catch(Exception exception) {
			exception.printStackTrace();
		}
		finally {
	        // Close resources
	        try {
	            if (getStatement!= null) {
	            	getStatement.close();
	            }
	        } catch (SQLException se2) {
	            // ignore
	        }
	        try {
	        	if (updateStatement!= null) {
	        		updateStatement.close();
	        	}
	        } catch (SQLException se2) {
	        	// ignore
	        }
	        try {
	            if (conn!= null) {
	                conn.close();
	            }
	        } catch (SQLException se) {
	            se.printStackTrace();
	        }
	    }
	  }
	}
	
		
		
	



