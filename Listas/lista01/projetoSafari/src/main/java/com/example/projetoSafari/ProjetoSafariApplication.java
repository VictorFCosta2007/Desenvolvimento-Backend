package com.example.projetoSafari;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/app")
public class ProjetoSafariApplication {

	@GetMapping("/{quilometragem}")
	public String qtdeAPagar(@PathVariable int quilometragem){
		int qtdePratas = quilometragem * 25;

		return "O preço final de sua expedicao eh: " + qtdePratas + " pratas";
	}



	public static void main(String[] args) {
		SpringApplication.run(ProjetoSafariApplication.class, args);
	}
}
