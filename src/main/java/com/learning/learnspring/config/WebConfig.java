package com.learning.learnspring.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    //clasa in config pt a sterge HomeController, care nu avea decat / ca endpoint

    @Override
    public void addViewControllers(ViewControllerRegistry registry){
      registry.addViewController("/").setViewName("home");
    }
}
