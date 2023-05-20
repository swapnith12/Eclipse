/*package com.truviq.camunda;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.impl.pvm.delegate.ActivityBehavior;
import org.camunda.bpm.engine.impl.pvm.delegate.ActivityExecution;

public class EmailSender implements JavaDelegate, ActivityBehavior {

    private String mSubject;
    private String recipientMail;
    private String mBody;

    public void sendEmail() throws MessagingException {
        // Define email server properties
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.ssl.trust", "*");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        // Create a new session with an authenticator
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("truviqs@gmail.com", "jllyqimsyyoqzlwm");
            }
        });

        // Create a new message
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("truviqs@gmail.com"));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientMail));
        message.setSubject(mSubject);
        message.setText(mBody);

        // Send the message
        Transport.send(message);
    }

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        this.recipientMail = (String) execution.getVariable("recipientMail");
        this.mSubject = (String) execution.getVariable("mSubject");
        this.mBody = (String) execution.getVariable("mBody");
        sendEmail();
    }

    @Override
    public void execute(ActivityExecution execution) throws Exception {
        this.recipientMail = (String) execution.getVariable("recipientMail");
        this.mSubject = (String) execution.getVariable("mSubject");
        this.mBody = (String) execution.getVariable("mBody");
        sendEmail();
    }
}*/



/*
package com.truviq.camunda;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
//import org.camunda.bpm.engine.impl.el.FixedValue;
import org.camunda.bpm.engine.impl.pvm.delegate.ActivityBehavior;
import org.camunda.bpm.engine.impl.pvm.delegate.ActivityExecution;

public class EmailSender implements JavaDelegate,ActivityBehavior {
	static java.lang.String mSubject="Land Allotment Application Status";
	static java.lang.String recipientMail="khadervali667@gmail.com";
	static java.lang.String mBody="Your Application got approved.Congratulations";
  public static void sendEmail(String recipientMail2, String mSubject2, String mBody2) throws MessagingException {
    // Define email server properties
    Properties props = new Properties();
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.enable", "true");
    props.put("mail.smtp.ssl.trust", "*");
    props.put("mail.smtp.ssl.protocols", "TLSv1.2");
    props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.port", "587");

    // Create a new session with an authenticator
    Session session = Session.getInstance(props, new Authenticator() {
      protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication("truviqs@gmail.com", "jllyqimsyyoqzlwm");
      }
    });

    // Create a new message
    Message message = new MimeMessage(session);
    message.setFrom(new InternetAddress("truviqs@gmail.com"));
    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientMail2));
    message.setSubject(mSubject2);
    message.setText(mBody2);

    // Send the message
    Transport.send(message);
  }

@Override
public void execute(DelegateExecution execution) throws Exception {
	// TODO Auto-generated method stub
	sendEmail(recipientMail,mSubject,mBody);
}

@Override
public void execute(ActivityExecution execution) throws Exception {
	// TODO Auto-generated method stub
	sendEmail(recipientMail,mSubject,mBody);
}
}*/

/*package com.truviq.camunda;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
//import org.camunda.bpm.engine.impl.el.FixedValue;
//import org.camunda.bpm.engine.impl.el.FixedValue;
import org.camunda.bpm.engine.impl.pvm.delegate.ActivityBehavior;
import org.camunda.bpm.engine.impl.pvm.delegate.ActivityExecution;

public class EmailSender implements JavaDelegate,ActivityBehavior {
	//static java.lang.String mSubject="Land Allotment Application Status";
	//static java.lang.String recipientMail="shaiksameer967633@gmail.com";
   // static FixedValue mBody = new FixedValue("Your Application got approved. Congratulations");


  public static void sendEmail(String recipientMail2, String mSubject2, String mBody2) throws MessagingException {
    // Define email server properties
    Properties props = new Properties();
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.enable", "true");
    props.put("mail.smtp.ssl.trust", "*");
    props.put("mail.smtp.ssl.protocols", "TLSv1.2");
    props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.port", "587");

    // Create a new session with an authenticator
    Session session = Session.getInstance(props, new Authenticator() {
      protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication("truviqs@gmail.com", "jllyqimsyyoqzlwm");
      }
    });

    // Create a new message
    Message message = new MimeMessage(session);
    message.setFrom(new InternetAddress("truviqs@gmail.com"));
    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientMail2));
    message.setSubject(mSubject2);
    message.setText(mBody2);

    // Send the message
    Transport.send(message);
  }

@Override
public void execute(DelegateExecution execution) throws Exception {
	String mBody = execution.getVariable("mBody").toString();

    String mSubject = (String) execution.getVariable("mSubject");
    String recipientMail = (String) execution.getVariable("recipientMail");

	// TODO Auto-generated method stub
	sendEmail(recipientMail,mSubject,mBody);
}

@Override
public void execute(ActivityExecution execution) throws Exception {
	String mBody = execution.getVariable("mBody").toString();

    String mSubject = (String) execution.getVariable("mSubject");
    String recipientMail = (String) execution.getVariable("recipientMail");

	// TODO Auto-generated method stub
	sendEmail(recipientMail,mSubject,mBody);
}
}*/

/*
package com.truviq.camunda;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.impl.pvm.delegate.ActivityBehavior;
import org.camunda.bpm.engine.impl.pvm.delegate.ActivityExecution;

public class EmailSender implements JavaDelegate {

  public static void sendEmail(String recipientMail, String mSubject, String mBody) throws MessagingException {
    // Define email server properties
    Properties props = new Properties();
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.enable", "true");
    props.put("mail.smtp.ssl.trust", "*");
    props.put("mail.smtp.ssl.protocols", "TLSv1.2");
    props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.port", "587");

    // Create a new session with an authenticator
    Session session = Session.getInstance(props, new Authenticator() {
      protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication("truviqs@gmail.com", "jllyqimsyyoqzlwm");
      }
    });

    // Create a new message
    Message message = new MimeMessage(session);
    message.setFrom(new InternetAddress("truviqs@gmail.com"));
    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientMail));
    message.setSubject(mSubject);
    message.setText(mBody);

    // Send the message
    Transport.send(message);
  }

  @Override
  public void execute(DelegateExecution execution) throws Exception {
    String mBody1 = (String) execution.getVariable("Body");
   String  mSubject1 = (String) execution.getVariable("Subject");
    String recipientMail1 = (String) execution.getVariable("recipientMail");
    String  businessKey=(String)execution.getBusinessKey();

    sendEmail(recipientMail1, businessKey, mBody1);
  }

}*/

/*package com.truviq.camunda;

import java.io.File;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.activation.DataSource;
import javax.activation.FileDataSource;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class EmailSender implements JavaDelegate {

  public static void sendEmail(String recipientMail, String mSubject, String mBody, File attachmentFile) throws MessagingException {
    // Define email server properties
    Properties props = new Properties();
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.enable", "true");
    props.put("mail.smtp.ssl.trust", "*");
    props.put("mail.smtp.ssl.protocols", "TLSv1.2");
    props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.port", "587");

    // Create a new session with an authenticator
    Session session = Session.getInstance(props, new Authenticator() {
      protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication("truviqs@gmail.com", "jllyqimsyyoqzlwm");
      }
    });

    // Create a new message
    Message message = new MimeMessage(session);
    message.setFrom(new InternetAddress("truviqs@gmail.com"));
    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientMail));
    message.setSubject(mSubject);
    message.setText(mBody);
    
    

    // Create a text message part
    MimeBodyPart messageBodyPart = new MimeBodyPart();
    messageBodyPart.setText(mBody);
    
    // Create a multipart message
    
    Multipart multipart = new MimeMultipart();

    // Add the text message part to the multipart message
    
    multipart.addBodyPart(messageBodyPart);

    // Create a file attachment part
    MimeBodyPart attachmentPart = new MimeBodyPart();
    MimeBodyPart fileBodyPart = new MimeBodyPart();
    DataSource source = new FileDataSource(attachmentFile);
    fileBodyPart.setDataHandler(new DataHandler(source));
    fileBodyPart.setFileName(attachmentFile.getName());

    attachmentPart.setDataHandler(new DataHandler(source));
    attachmentPart.setFileName(attachmentFile.getName());

    // Add the file attachment part to the multipart message
    multipart.addBodyPart(attachmentPart);

    // Set the multipart message as the content of the email
    message.setContent(multipart);

    // Send the message
    Transport.send(message);
  }

  @Override
  public void execute(DelegateExecution execution) throws Exception {
	 String mBody1 = (String) execution.getVariable("Body");
	 String  mSubject1 = (String) execution.getVariable("Subject");
	 String recipientMail1 = (String) execution.getVariable("recipientMail");
	 String  businessKey=(String)execution.getBusinessKey();
    File pdfFile = new File("F:/Sample.pdf");

    sendEmail(recipientMail1, "Status of Your Application with "+businessKey, mBody1,pdfFile);
  }


}


package com.truviq.camunda;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;*/



package com.truviq.camunda;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class EmailSender implements JavaDelegate {

  public static void sendEmail(String recipientMail, String mSubject, String mBody, File dataFile) throws MessagingException {
    // Define email server properties
    Properties props = new Properties();
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.enable", "true");
    props.put("mail.smtp.ssl.trust", "*");
    props.put("mail.smtp.ssl.protocols", "TLSv1.2");
    props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.port", "587");

    // Create a new session with an authenticator
    Session session = Session.getInstance(props, new Authenticator() {
      protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication("truviqs@gmail.com", "jllyqimsyyoqzlwm");
      }
    });

    // Create a new message
    Message message = new MimeMessage(session);
    message.setFrom(new InternetAddress("truviqs@gmail.com"));
    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientMail));
    message.setSubject(mSubject);
    message.setText(mBody);
    
    // Create a multipart message
    Multipart multipart = new MimeMultipart();

    // Add the text message part to the multipart message
    MimeBodyPart messageBodyPart = new MimeBodyPart();
    messageBodyPart.setText(mBody);
    multipart.addBodyPart(messageBodyPart);

    // Create a file attachment part
    MimeBodyPart attachmentPart = new MimeBodyPart();
    DataSource fileDataSource = new FileDataSource(dataFile);
    attachmentPart.setDataHandler(new DataHandler(fileDataSource));
    attachmentPart.setFileName(dataFile.getName());
    System.out.println(dataFile.getName());
    // Add the file attachment part to the multipart message
    multipart.addBodyPart(attachmentPart);

    // Set the multipart message as the content of the email
    message.setContent(multipart);

    // Send the message
    Transport.send(message);
  }

 /*@Override
  public void execute(DelegateExecution execution) throws Exception {
    String mBody = (String) execution.getVariable("Body");
    String mSubject = (String) execution.getVariable("Subject");
    String recipientMail = (String) execution.getVariable("recipientMail");

    // Create file from process variables
    String fileName = "data.txt";
    String filePath = "C:\\temp\\" + fileName;
    File file = new File(filePath);
    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
    writer.write("Example data from process variables");
    writer.close();

    // Send email with file attachment
  }*/
  public void execute(DelegateExecution execution) throws Exception {
	    // Create a file to write the process variables data
	  
		 String mBody1 = (String) execution.getVariable("finalAuthorityComments");
		// String  mSubject1 = (String) execution.getVariable("Subject");
		 String recipientMail1 = (String) execution.getVariable("mailID");
		 String  businessKey=(String)execution.getBusinessKey();
	  
	   //String filename="LandApplication.txt";
	   String filepath="C:\\Users\\sam\\OneDrive\\Desktop\\Land Application.pdf";
	    File dataFile = new File(filepath);

	  /*  // Create a writer to write to the file
	    BufferedWriter writer = new BufferedWriter(new FileWriter(dataFile));

	    // Retrieve the process variables and write them to the file
	   // Map<String, Object> variables = execution.getVariables();
	    Map<String, Object> variables = execution.getVariables();
	    //variables.put("name", "sameer");
	   // variables.put("company", "Truviq Systems");
	    
	    for (Map.Entry<String, Object> entry : variables.entrySet()) {
	    	writer.newLine();
	    	writer.newLine();
	        writer.write(entry.getKey() + ": \t\t\t\t" + entry.getValue().toString());
	        writer.newLine();
	        writer.newLine();
	        writer.newLine();
	    }

	    // Close the writer
	    writer.close();*/

	    // Send the email with the file as attachment
	    sendEmail(recipientMail1, "Status of Application with Reference Id : "+businessKey,mBody1 , dataFile);
	    System.out.println("Success");
	}

}



 /*package com.truviq.camunda;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.*;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class EmailSender implements JavaDelegate {

  public static void sendEmail(String recipientMail, String mSubject, String mBody, String pdfFilePath) throws MessagingException, IOException {
    // Define email server properties
    Properties props = new Properties();
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.enable", "true");
    props.put("mail.smtp.ssl.trust", "*");
    props.put("mail.smtp.ssl.protocols", "TLSv1.2");
    props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
    props.put("mail.smtp.host", "smtp.gmail.com");
    
    props.put("mail.smtp.port", "587");

    // Create a new session with an authenticator
    Session session = Session.getInstance(props, new Authenticator() {
      protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication("kimidigopalakrishna79@gmail.com", "nfjizlyklvhdlzca");
      }
    });

    // Create a new message
    Message message = new MimeMessage(session);
    message.setFrom(new InternetAddress("kimidigopalakrishna79@gmail.com"));
    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientMail));
    message.setSubject(mSubject);

    // Create the message body
    message.setText(mBody);

    // Create the PDF attachment
    MimeBodyPart pdfAttachment = new MimeBodyPart();
    File pdfFile = new File(pdfFilePath);
    pdfAttachment.attachFile(pdfFile);

    // Add the PDF attachment to a Multipart object
    Multipart multipart = new MimeMultipart();
    multipart.addBodyPart(pdfAttachment);

    // Set the content of the message to the Multipart object
    message.setContent(multipart);

    // Send the message
    Transport.send(message);
  }

  @Override
  public void execute(DelegateExecution execution) throws Exception {
	  

		 String mBody1 = (String) execution.getVariable("Body");
		 String  mSubject1 = (String) execution.getVariable("Subject");
		 String recipientMail1 = (String) execution.getVariable("recipientMail");
		 String  businessKey=(String)execution.getBusinessKey();
	  
   
         String pdfFilePath = "F:/Sample.pdf";

         sendEmail(recipientMail1, mSubject1, mBody1, pdfFilePath);
  }
  
}*/
