package com.dhungelkrishna.mailsender;

import java.net.ConnectException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class MailsenderApplication {


	@Autowired
	private EmailSenderService emailSenderService;


	public static void main(String[] args) {
		SpringApplication.run(MailsenderApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void sendMail() {
		emailSenderService.sendEmail("aakritidhungel01@gmail.com", "AI ko Ramro Sanga Pada", "Expert System, KR, strong ai weak ai, machine vision, machine learning yellow + black = golden yesto wala ramro sanga pada hae. Thank You. <b> Regards -- Krishna Dhungel </b>");
	}
}
