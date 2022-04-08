package com.example.demoadminclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
@EnableCaching
public class SpringBootAdminClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdminClientApplication.class, args);
	}

}
