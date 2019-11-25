package com.nare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nare.service.EmployeeRestService;

@SpringBootApplication
public class P3RestTemplateClientApplication {

	public static void main(String[] args) {
		 ConfigurableApplicationContext c=SpringApplication.run(P3RestTemplateClientApplication.class, args);
		  EmployeeRestService e=c.getBean("employeeRestService",EmployeeRestService.class);
		  e.getAllNames();
		 
		  e.getempbyid(10);
		  e.addEmployee();
	}

}
