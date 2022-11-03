package com.example.BESP4PC;

import com.example.BESP4PC.service.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BeSp4PcApplication {


	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(BeSp4PcApplication.class, args);
		MessageService messageService1 = context.getBean("messageService", MessageService.class);
		System.out.println(messageService1.getMessages());
	}

}
