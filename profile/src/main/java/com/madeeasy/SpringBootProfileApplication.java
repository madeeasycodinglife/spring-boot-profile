package com.madeeasy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProfileApplication implements CommandLineRunner {

	@Value("${spring.datasource.url}")
	private String url ;
	@Value("${spring.datasource.username}")
	private String userName;
	@Value("${spring.jpa.database-platform}")
	private String databasePlatform;

	@Value("${server.port}")
	private String port;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfileApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("port : "+port);
		System.out.println("url : "+ url);
		System.out.println("username : "+userName);
		System.out.println("databasePlatform : "+databasePlatform);
	}
}
