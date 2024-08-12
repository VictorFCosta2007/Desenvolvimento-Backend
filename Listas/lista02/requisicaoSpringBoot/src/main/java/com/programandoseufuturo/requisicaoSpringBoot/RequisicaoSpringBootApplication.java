package com.programandoseufuturo.requisicaoSpringBoot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/app")
public class RequisicaoSpringBootApplication {

	List<IlhaDeCalor> ilhasDeCalor = new ArrayList<>();

	@GetMapping("/IlhasDeCalor")
	public List<IlhaDeCalor> listarIlhaDeCalor() {
		return ilhasDeCalor;
	}

	@PostMapping("/adicionarIlhas")
	public String adicionarIlhaDeCalor(@RequestBody IlhaDeCalor ilhaDeCalor) {
		for (IlhaDeCalor ilhaDeCalorNaLista : ilhasDeCalor) {
			if(ilhaDeCalor.getId() == ilhaDeCalorNaLista.getId()) {
				return "Ilha já existente na Lista...";
			} 
		}
		ilhasDeCalor.add(ilhaDeCalor);
		return String.format("Ilha de Calor do bairro %s adicionada com sucesso!", ilhaDeCalor.getBairro());
	}


	public static void main(String[] args) {
		SpringApplication.run(RequisicaoSpringBootApplication.class, args);
	}

}
