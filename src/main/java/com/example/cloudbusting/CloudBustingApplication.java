package com.example.cloudbusting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude ={DataSourceAutoConfiguration.class})
public class CloudBustingApplication {

	public static void main(String[] args) {
		 {SpringApplication.run(CloudBustingApplication.class, args);}
	}

}
