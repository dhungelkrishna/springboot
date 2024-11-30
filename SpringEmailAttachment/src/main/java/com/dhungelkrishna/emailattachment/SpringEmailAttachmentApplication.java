package com.dhungelkrishna.emailattachment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import jakarta.mail.MessagingException;

@SpringBootApplication
public class SpringEmailAttachmentApplication {


	@Autowired
	private EmailSenderService emailSenderService;
	public static void main(String[] args) {
		SpringApplication.run(SpringEmailAttachmentApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void sendEmail() throws MessagingException {
		emailSenderService.sendMailWithAttachment("aakritidhungel01@gmail.com", "Simple message", "Email with Attachment. ", "C:/Users/lenovo/Downloads/CV_Krishna_Dhungel_pdf.pdf");
	}



}
