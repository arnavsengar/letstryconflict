package io.javabrains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;*/

@SpringBootApplication
//@OpenAPIDefinition(info = @Info(title = "Course API", version = "3.0", description = "Just trial"))

public class CousrseApiDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(CousrseApiDataApplication.class, args);
	}

}
