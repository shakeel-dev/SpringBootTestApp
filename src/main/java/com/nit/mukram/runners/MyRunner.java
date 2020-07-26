package com.nit.mukram.runners;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner 
{
	private static Logger log=LoggerFactory.getLogger(MyRunner.class);
	
    @Override
	public void run(String... args) throws Exception
	{
    	int a=10;
    	try {
    		log.info("STARTED");
    		System.out.println("Welcome to Spring Boot App!!"+a);
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	log.info("END");
    }
}
