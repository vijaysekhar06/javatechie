package com.sai;


import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootApp1Application {
	public static Logger logger=LoggerFactory.getLogger(SpringBootApp1Application.class);

	@PostConstruct
	public void init()
	{
		logger.info("Application Started......");
	}
	public static void main(String[] args) {
		logger.info("Application Started  main method......");
		ApplicationContext applicationContext=SpringApplication.run(SpringBootApp1Application.class, args);
	    System.out.println(applicationContext);
	}

}
