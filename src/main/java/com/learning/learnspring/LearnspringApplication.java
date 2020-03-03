package com.learning.learnspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class LearnspringApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(LearnspringApplication.class, args);
	}

	//if you want to put the config here, instead of creating another packet, it should look like this:
	//@Override
	//public void addViewControllers(ViewControllerRegistry registry){
	//	registry.addViewController("/").setViewName("home");
	//}
}
