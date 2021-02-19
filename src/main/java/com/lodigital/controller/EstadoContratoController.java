package com.lodigital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lodigital.model.EstadoContrato;
import com.lodigital.service.IEstadoContratoService;

@RestController
@RequestMapping("/estadoContrato")
public class EstadoContratoController {

	@Autowired
	private IEstadoContratoService estadoContratoService;
	
	@GetMapping
	public ResponseEntity<List<EstadoContrato>> listar(){
		 List<EstadoContrato> lista = estadoContratoService.listar();
		return new ResponseEntity<List<EstadoContrato>>(lista, HttpStatus.OK);
	}
}
