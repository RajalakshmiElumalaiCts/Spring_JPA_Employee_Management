package com.jpa.emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
public class SpringJpaEmployeeManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaEmployeeManagementApplication.class, args);
	}
	
	@Bean
	public ServletRegistrationBean configureWebXml(DispatcherServlet dispatcherservlet){
		ServletRegistrationBean servlet = new ServletRegistrationBean(dispatcherservlet);
		servlet.addUrlMappings("*.do");
		return servlet;	
		
	}
}
