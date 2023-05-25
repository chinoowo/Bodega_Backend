package com.example.crudrapido;

import org.hibernate.sql.Delete;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class CrudrapidoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudrapidoApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {registry.addMapping("/**").allowedOrigins("http://localhost")
					.allowedMethods("GET","POST","PUT","DELETE","OPTIONS")
					.allowCredentials(true);

			}
		};
	}

    @Bean
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }



}




