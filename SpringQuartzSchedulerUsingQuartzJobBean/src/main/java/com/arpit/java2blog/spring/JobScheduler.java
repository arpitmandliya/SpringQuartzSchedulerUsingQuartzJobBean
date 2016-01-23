package com.arpit.java2blog.spring;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class JobScheduler extends QuartzJobBean {
	SendEmailTask sendEmailTask;

	
	public void setSendEmailTask(SendEmailTask sendEmailTask) {
		this.sendEmailTask = sendEmailTask;
	}


	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
		
		sendEmailTask.sendEmail();
	}
	
	
}
