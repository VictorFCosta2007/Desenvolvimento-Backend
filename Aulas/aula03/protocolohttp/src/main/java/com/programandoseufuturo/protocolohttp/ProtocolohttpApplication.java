package com.programandoseufuturo.protocolohttp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/app")
public class ProtocolohttpApplication {

	@GetMapping("/ola-mundo/{nome}")
	public String olaMundo(@PathVariable String nome){
		return String.format("Ola, %s", nome);
	}

	@PostMapping("/validar-idade")
	public String validaIdadeUsuario(@RequestBody Usuario usuario){
		if(usuario.getIdade() >= 18) {
			return String.format("O usuario %s pode acessar o sistema", usuario.getNome());
		}
		return String.format("O usuario %s não pode acessar o sistema", usuario.getNome());
	} 

	public static void main(String[] args) {
		SpringApplication.run(ProtocolohttpApplication.class, args);
	}

}
