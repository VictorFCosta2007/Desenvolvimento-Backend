package com.programandoseufuturo.ola_mundo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/app")
public class OlaMundoApplication {

	@GetMapping("/{nome}")
	public String cumprimentar(@PathVariable String nome) {
		return "Olá " + nome;
	}

	
	
	public static void main(String[] args) {
		SpringApplication.run(OlaMundoApplication.class, args);
		
	}

}
