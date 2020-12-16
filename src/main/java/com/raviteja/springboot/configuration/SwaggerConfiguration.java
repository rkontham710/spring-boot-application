package com.raviteja.springboot.configuration;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfiguration {
	
	@Bean
	public Docket api() {

		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.raviteja.springboot"))
				.paths(PathSelectors.any()).build().apiInfo(apiInformation());
	}
	
	@SuppressWarnings("deprecation")
	private ApiInfo apiInformation() {
		return new ApiInfo("Spring Boot Application", 
				           "This project contains all the annoations required for Spring Boot Application", 
				           "1.0", 
				           "https://github.com/rkontham710", 
				           "Raviteja Kontham", 
				           "2625", 
				           "www.titiksha.com");
	}
	
	
}
