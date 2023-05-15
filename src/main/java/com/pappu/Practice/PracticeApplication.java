package com.pappu.Practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		System.out.println("hello this is my first docker file");
		SpringApplication.run(PracticeApplication.class, args);
	}

}
