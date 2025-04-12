package com.example.walterapi.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API Livraria")
                        .description("API para gerenciamento de livros")
                        .version("1.0")
                        .contact(new Contact().name("Walter").email("walter@exemplo.com")));
    }
}
