package com.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.boot.service.HelloMessageService;

@SpringBootApplication
public class SpringBootConsoleConfiguration implements CommandLineRunner {

	@Autowired
	private HelloMessageService messageService;

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(
				SpringBootConsoleConfiguration.class);
		app.setBannerMode(Banner.Mode.CONSOLE);
		app.run(args);
	}

	public void run(String... arg0) throws Exception {

		if (arg0.length > 0) {
			System.out.println(messageService.getMessage(arg0[0].toString()));
		} else {
			System.out.println(messageService.getMessage());
		}
	}

}
