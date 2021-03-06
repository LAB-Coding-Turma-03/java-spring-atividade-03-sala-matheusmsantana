package br.com.impacta.lab.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividades")
public class CondicionalController {

	@GetMapping("/condicional")
	public ResponseEntity<String> simularValores(@RequestParam(name="idade") int idade) {
		/*
		 * Elabore um algoritmo para dizer a partir da idade se a 
		 * pessoa tem mais ou menos do que 18 anos.
		 *  
		 *  Retornar os seguintes textos:
		 *  
		 *  
		 *  Para maiores de dezoito anos -> Possui mais de 18 anos
		 *  
		 *  Para menores de dezoito anos -> Possui menos de 18 anos
		 *  
		 */
		if(idade < 18) 
		{
			return ResponseEntity.ok("Possui menos de 18 anos");
		}else 
		{
			return ResponseEntity.ok("Possui mais de 18 anos");
		}
		
	}
	
}
