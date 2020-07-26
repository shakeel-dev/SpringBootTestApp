package com.nit.mukram.runners;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner 
{
    @Override
	public void run(String... args) throws Exception
	{
    	int a=10;
		System.out.println("Welcome to Spring Boot App!!"+a);
    }
}
