package com.cloud.disk;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class DiskApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DiskApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		//run before start-up
	}
}
