package com.udacit.jwdnd.c1.review;

import com.udacit.jwdnd.c1.review.service.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}

	@Bean
	public String message(){
		System.out.println("Hello,Spring!");
		return "Hello, Spring!";
	}

	@Bean
	public String uppercaseMessage(MessageService messageService){
		System.out.println(messageService.uppercase());
		return messageService.uppercase();
	}

	@Bean
	public String lowercasemessage(MessageService messageService){
		System.out.println(messageService.lowercase());
		return messageService.lowercase();
	}

}
