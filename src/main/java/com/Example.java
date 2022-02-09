package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Locale;
import java.util.function.Function;

@SpringBootApplication
public class Example {

	public static void main(String[] args) {
		SpringApplication.run(Example.class, args);
	}

	@Bean
	public Function<String, String> lowercase() {
		return value -> value.toLowerCase(Locale.ROOT);
	}

	@Bean
	public Function<String, String> uppercase() {
		return value -> {
			System.out.println("AAAAAA");
			return "bbbb";
		};
	}

}
