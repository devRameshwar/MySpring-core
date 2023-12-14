package com.first.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
@ComponentScan("com.*")
@Configuration
public class SpringWebMvcConfiguration extends WebMvcConfigurationSupport {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for(Object data :beanDefinitionNames) {
			System.out.println(data);
		}
	}

}
