package com.lodigital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lodigital.model.Contrato;
import com.lodigital.service.IContratoService;

@RestController
@RequestMapping("/contrato")
public class ContratoController {

	@Autowired
	private IContratoService contratoService;
	
	@GetMapping(value = "/contratoByCompany/{idEmpresa}")
	public ResponseEntity<List<Contrato>> contratoByCompany(@PathVariable Integer idEmpresa){
		 List<Contrato> lista = contratoService.contratoByCompany(idEmpresa);
		return new ResponseEntity<List<Contrato>>(lista, HttpStatus.OK);
	}
	
}
