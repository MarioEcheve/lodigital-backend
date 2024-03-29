package com.lodigital.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping(value = "/crearContrato")
	public ResponseEntity<Contrato> crearUsuario(@Valid @RequestBody Contrato contrato){
		Contrato con = contratoService.save(contrato);
		return new ResponseEntity<Contrato>(con, HttpStatus.OK);
	}
	
	@GetMapping(value="/buscarContratoById/{idContrato}")
	private ResponseEntity<Contrato> buscarContratoById(@PathVariable Integer idContrato){
		Contrato cn = contratoService.findById(idContrato);
		return new ResponseEntity<Contrato>(cn, HttpStatus.OK);
	}
	
	@GetMapping(value = "/contratoById/{idContrato}")
	public ResponseEntity<Contrato> contratoById(@PathVariable Integer idContrato){
		 Contrato contrato = contratoService.findById(idContrato);
		return new ResponseEntity<Contrato>(contrato, HttpStatus.OK);
	}
	
}
