package com.bridgelabz.employeepayrollapp;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
@Slf4j
public class EmpPayrollApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EmpPayrollApplication.class, args);
		
		//log.info("Employee Payroll Application Started in {} Environment",
				//context.getEnvironment().getProperty("environment"));
		//log.info("Employee Payroll DB User is {} Environment",
			//	context.getEnvironment().getProperty("spring.datasource.username"));
	}
}