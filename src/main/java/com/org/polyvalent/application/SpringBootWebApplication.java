package com.org.polyvalent.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackages ="com.org.polyvalent.repository" )
@EntityScan(basePackages = "com.org.polyvalent.domain")
public class SpringBootWebApplication {
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootWebApplication.class);
    }
	
    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebApplication.class, args);
    }
    
    
}
