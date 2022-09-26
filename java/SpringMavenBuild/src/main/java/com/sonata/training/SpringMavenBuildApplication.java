package com.sonata.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.sonata.training")
@SpringBootApplication
public class SpringMavenBuildApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMavenBuildApplication.class, args);
	}

}
