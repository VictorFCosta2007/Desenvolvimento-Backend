package com.example.entradaPermitida;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/app")
public class EntradaPermitidaApplication {

	@GetMapping("/{senhaInserida}")
	public String senhaDeAutorizacao(@PathVariable String senhaInserida){
		String senhaCorreta = "senha123";
		
		if(senhaInserida.equals(senhaCorreta)){
			return "Entrada autorizada";
		} else {
			return "Entrada não autorizada";
		}
			
		
	}

	public static void main(String[] args) {
		SpringApplication.run(EntradaPermitidaApplication.class, args);
	
	}

}
