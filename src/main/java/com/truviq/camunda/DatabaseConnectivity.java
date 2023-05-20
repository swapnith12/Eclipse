package com.truviq.camunda;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class DatabaseConnectivity implements JavaDelegate {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
   static final String DB_URL = "jdbc:mysql://localhost:3306/LandAllotment";

   // Database credentials
   static final String USER = "root";
   static final String PASS = "root";

   public static void main(String[] args) {
       
   }

@Override
public void execute(DelegateExecution execution) throws Exception {
	Connection conn = null;
    PreparedStatement stmt = null;

    try {
        // Register JDBC driver
        Class.forName(JDBC_DRIVER);

        // Open a connection
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        
        if(true) {

        // SQL query to insert data into table
        //	String sql = "INSERT INTO ApprovedLandApplications(LandNumber,ReferenceID,applicant_email,FirmName,ContactPerson,NameofPromotor,PromotorMobile,ProjectCategory,EmploymentCount,AreaOfTheLand,LandLocation, FireDepartmentComments,FireDepartmentApproval,WaterDepartmentComments,WaterDepartmentApproval,EnvironmentDepartmentComments,EnvironmentDepartmentApproval,APIICComments,APIICApproval ) VALUES (?, ?, ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        	String sql = "INSERT INTO ApprovedLandApplications(LandNumber,ReferenceID,applicant_email,FirmName,ContactPerson,NameofPromoter,PromoterMobile,ProjectCategory,EmploymentCount,AreaOfTheLand,LandLocation, DepartmentAComments,DepartmentAApproval,DepartmentBComments,DepartmentBApproval,DepartmentCComments,DepartmentCApproval,FinalAuthorityComments,FinalAuthorityApproval ) VALUES (?, ?, ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        // Prepare the statement with the query
        stmt = conn.prepareStatement(sql);

        // Set the parameters for the statement
        stmt.setObject(1, (Object)execution.getVariable("LandNumber"));
        stmt.setString(2,  (String)execution.getVariable("BusinessKey")); 
        stmt.setString(3, (String)execution.getVariable("mailID"));
        stmt.setString(4,  (String)execution.getVariable("FirmName"));
        stmt.setString(5,  (String)execution.getVariable("ContactPerson"));
        stmt.setString(6,  (String)execution.getVariable("nameOfPromoter"));
        stmt.setString(7,  (String)execution.getVariable("mobileNumber"));
        stmt.setString(8,  (String)execution.getVariable("ProjectCategory"));
        stmt.setString(9,  (String)execution.getVariable("employment"));
        stmt.setString(10,  (String)execution.getVariable("areaOfTheLand"));
        stmt.setString(11,  (String)execution.getVariable("LandLocation"));
        stmt.setString(12,  (String)execution.getVariable("Acomments"));
        stmt.setBoolean(13,  (Boolean)execution.getVariable("Aapproval"));
        stmt.setString(14,  (String)execution.getVariable("Bcomments"));
        stmt.setBoolean(15,  (Boolean)execution.getVariable("Bapproval"));
        stmt.setString(16,  (String)execution.getVariable("Ccomments"));
        stmt.setBoolean(17,  (Boolean)execution.getVariable("Capproval"));
        stmt.setString(18,  (String)execution.getVariable("finalAuthorityComments"));
        stmt.setBoolean(19,  (Boolean)execution.getVariable("finalAuthorityApproval"));

        // Execute the statement
        stmt.executeUpdate();

        System.out.println("Data inserted successfully.");
        }

    } catch (SQLException se) {
        // Handle errors for JDBC
        se.printStackTrace();
    } catch (Exception e) {
        // Handle errors for Class.forName
        e.printStackTrace();
    } finally {
        // Close resources
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException se2) {
            // ignore
        }
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
}
}

