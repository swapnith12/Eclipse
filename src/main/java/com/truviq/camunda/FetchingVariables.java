package com.truviq.camunda;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import com.pd4ml.PD4ML;

public class FetchingVariables implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
        PD4ML pd4ml = new PD4ML();
    	
       /* String[] myProperties = new String[] {"A","B"};
    	Map<String, Object> myVariables=new HashMap<>();
    	myVariables.put("var1", "System1");
    	myVariables.put("var2", "System1");
    	myVariables.put("var3", "System1");
    	myVariables.put("var4", "System1");
    	myVariables.put("var5", "System1");
    	myVariables.put("var6", "System1");
     
    	Set entry=myVariables.entrySet();
    	for(Map.Entry<String,Object> entry : myVariables.entrySet()) {
    		System.out.println("key"+ " " +entry.getKey());
    		System.out.println("Value"+ " " +entry.getValue().toString());
    		System.out.println();	
    	}
    	int[] arr= {1,2,3,3,4,4,55,43};
    	System.out.println(Arrays.toString(arr));
    	
        
       String proVar1= (String)execution.getVariable("landlocation");
       String proVar2= (String)execution.getVariable("FirmName");
       
       
       
       String firmname = (String)execution.getVariable("FirmName");
       String contactperson = (String)execution.getVariable("ContactPerson");
       String Mail = (String)execution.getVariable("mailID");
       String Employment = (String)execution.getVariable("employment");
       String promotername = (String)execution.getVariable("nameOfPromoter");
       String areaofland = (String)execution.getVariable("areaOfTheLand");
       String ProjectCategory = (String)execution.getVariable("ProjectCategory");

       String Mobilenumber = (String)execution.getVariable("mobileNumber");*/

       Object LandNumber =execution.getVariable("LandNumber");
       String BusinessKey =(String)execution.getVariable("BusinessKey");
       String mailID =(String)execution.getVariable("mailID");
       String FirmName =(String)execution.getVariable("FirmName");
       String ContactPerson =(String)execution.getVariable("ContactPerson");
       String nameOfPromoter =(String)execution.getVariable("nameOfPromoter");
       String mobileNumber =(String)execution.getVariable("mobileNumber");
       String ProjectCategory =(String)execution.getVariable("ProjectCategory");
       String employment =(String)execution.getVariable("employment");
       String areaOfTheLand =(String)execution.getVariable("areaOfTheLand");
       String Acomments =(String)execution.getVariable("Acomments");
       Object Aapproval =execution.getVariable("Aapproval");
       String Bcomments =(String)execution.getVariable("Bcomments");
       Object Bapproval =execution.getVariable("Bapproval");
       String Ccomments =(String)execution.getVariable("Ccomments");
       Object Capproval =execution.getVariable("Capproval");
       String finalAuthorityComments =(String)execution.getVariable("finalAuthorityComments");
       Object finalAuthorityApproval =execution.getVariable("finalAuthorityApproval");

 
       
      /* String html ="<div style='font-size: 14pt; font-weight: bold; text-align: center; color:red; background-color: yellow; text-decoration: underline;'>Land Allotment Application Details</div>"
       		+"<br><br>"+
    		   "<b>  Firm Name:</b>"+firmname+"<br><br>" +
               "<b> Contact Name:</b>"+contactperson+"<br><br>"+
               "<b> Email:</b>"+Mail+"<br><br>" +
               "<b> Name Of The Promoter:</b>"+promotername+"<br><br>"+
               "<b> Mobile Number:</b>"+Mobilenumber+"<br><br>" +
               "<b> Estimated Number of Employment:</b>"+Employment+"<br><br>" +
               "<b> Land in yards:</b>"+areaofland+"<br><br>" +
               "<b> Land Location:</b>"+Landlocation+"<br><br>"+
               "<b> TD Comments:</b>"+TDComments+"<br><br>" +
               "<b> LRW Comments:</b>"+LRWComments+"<br><br>"+
               "<b> FDComments:</b>"+FDComments+"<br><br>"+
               "<b> APIIC Comments:</b>"+APIIComments;*/
       
       String html =
       "<html>"+
       "<head> " +
         "<title>Sample Form</title>" +
         "<style>" +
           "body { "+
            " font-family: Arial, sans-serif;"+
            " background-color: #f5f5f5; " +
          " } " +
          " form { " +
           "  max-width: 500px; "+
           "  margin: 0 auto;  " +
            " background-color: #fff; " +
            " padding: 20px; " +
           "  border-radius: 10px; " +
            " box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1); "+
           " }"+
          " label {"+
             
             "font-weight: bold; " +
            " margin-bottom: 5px; "+
        "   } "+

         "  h3 { " +
           "  align:center; "+
            " font-weight: bold;"+
            " margin-bottom: 10px; "+
          "}" +
           
           "input { " +
             "display: block;" +
            "  width: 80%; "+
            " padding: 10px; "+
            " border: 1px solid black; "+
            " border-radius: 5px; "+
             " margin-bottom: 20px; "+
          " } "+

           
        " </style> " +
      "</head><body><form><h3> Land Application with Reference ID : " +BusinessKey+" </h3><br><h3 > Your Details</h3><label for="+
        "LandNumber>Land Number </label><input type="+
      "text id="+
       "name name=name required value="+ 
      LandNumber + ">" +

           "<label for='mailID' >Applicant Mail:</label> "+
          "<input type='email' id='email' name='email' required value="+mailID+">"  +

    "  <label for='FirmName'>Company Name:</label> " +
     " <input type='text' id='FirmName' name='FirmNames' required value="+FirmName+">" +


     " <label for='nameOfPromoter'>Promoter  Name:</label> " +
     " <input type='text' id='nameOfPromoter' name='nameOfPromoter' required value=" +nameOfPromoter+">"   +

     " <label for='mobileNumber'>Mobile Number:</label> " +
      "<input type='text' id='mobileNumber' name='mobileNumber' required value="+mobileNumber+">"+

      "<label for='ProjectCategory'>Project Category:</label> " +
      "<input type='text' id='ProjectCategory' name='ProjectCategory' required value="+ProjectCategory+">" +


     " <label for='employment'>Number of Employment Opportunities:</label> "+
     " <input type='text' id='employment' name='employment' required value="+employment +">"+

      "<label for='areaOfTheLand'>Land Area:</label>"+
      "<input type='text' id='areaOfTheLand' name='areaOfTheLand' required value="+areaOfTheLand+"><br>"+

    "  <h3 > Sub Departments' Response </h3> " +

     " <label for='Acomments'>Department A Comments:</label> "+
     " <input type='text' id='Acomments' name='Acomments' required value="+Acomments+"><br>"+
     " <label for='Aapproval'>Department A Approval</label> "+
     " <input type='text' id='Aapproval' name='Aapproval' required value="+Aapproval+"><br>"+

      "<label for='Bcomments'>Department B Comments:<label>"+
      "<input type='text' id='Bcomments' name='Bcomments' required value="+Bcomments+"><br"+
      "<label for='Bapproval'>Department B Approval</label>"+
      "<input type='text' id='Bapproval' name='Bapproval' required value="+Bapproval+"><br>"+

     " <label for='Ccomments'>Department C Commentslabel> "+
     " <input type='text' id='Ccomments' name='Ccomments' required value="+Ccomments+"><br"+
      "<label for='Capproval'>Department C Approval</label>"+
     " <input type='text' id='Capproval' name='Capproval' required value="+Capproval+"><br>"+

      "<br>"+
      "<h3 > Final Department's Response </h3>"+

     " <label for='finalAuthorityComments'>Final Authority Comments</label>"+
      "<input type='text' id='finalAuthorityComments' name='finalAuthorityComments' required value="+finalAuthorityComments+"<br>"+

      "<label for='finalAuthorityApproval'>Final Authority Approval</label>"+
     " <input type='text' id='finalAuthorityApproval' name='finalAuthorityApproval' required value="+finalAuthorityApproval+"><br>"+







      
   " </form>"+
 " </body>"+
"</html>";
       

       
    	              
    	ByteArrayInputStream bais = new ByteArrayInputStream(html.getBytes());
    	// read and parse HTML
    	pd4ml.readHTML(bais);
    	System.out.println("Generating 'pdf in  drive");
        File pdf = new File("C:\\Users\\sam\\OneDrive\\Desktop\\Land Application.pdf");
    	//File pdf = File.createTempFile("result", ".pdf", "C\\\\:");
    	System.out.println("File created successfully!");

    	FileOutputStream fos = new FileOutputStream(pdf);
    	// render and write the result as PDF
    	pd4ml.writePDF(fos);
    	System.out.println("PDF is now have content in it");

    	// alternatively or additionally: 
    	// pd4ml.writeRTF(rtfos, false);
    	// BufferedImage[] images = pd4ml.renderAsImages();
    	
    	// open the just-generated PDF with a default PDF viewer
	//if ( args.length == 0 ) {
			//Desktop.getDesktop().open(pdf);
		//}
	}
}
