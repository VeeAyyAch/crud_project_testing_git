package com.example.simplespringboot.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Simple Spring Boot API")
                        .description("A simple Spring Boot application with a GET endpoint that returns different messages based on the ID")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Vaibhav")
                                .email("vaibhav@example.com")));
    }
}
