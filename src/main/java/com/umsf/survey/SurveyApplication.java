package com.umsf.survey;

import java.lang.management.ManagementFactory;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SurveyApplication {

	public static void main(String[] args) {
		System.getProperty("java.version");
		System.out.println(ManagementFactory.getRuntimeMXBean().getVmVersion());
		SpringApplication.run(SurveyApplication.class, args);
	}
	
    @Bean
    ApplicationRunner applicationRunner(Environment environment) {
        return args -> {
        	System.out.println("from system.properties " + environment.getProperty("maven.version"));
        	System.out.println("from system.properties " + environment.getProperty("java.runtime.version"));
        };
    }

}