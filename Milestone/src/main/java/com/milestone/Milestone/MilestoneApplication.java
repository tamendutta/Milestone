package com.milestone.Milestone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;



@SpringBootApplication
public class MilestoneApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MilestoneApplication.class, args);
	}
	@Override
	protected SpringaApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MilestoneApplication.class);
	}
}
