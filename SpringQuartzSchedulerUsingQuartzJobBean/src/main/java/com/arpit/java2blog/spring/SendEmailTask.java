package com.arpit.java2blog.spring;

import java.util.Calendar;

public class SendEmailTask {
	
	 public void sendEmail() {
		  		 
		  // You may want to put some condition for sending email
          // Actual email send logic		 
		  System.out.println("Sending email at "+ Calendar.getInstance().getTime());
		 
	 }

}
