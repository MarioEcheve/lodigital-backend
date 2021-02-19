package com.lodigital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lodigital.model.TipoModalidad;
import com.lodigital.service.ITipoModalidadService;

@RestController
@RequestMapping("/tipoModalidad")
public class TipoModalidadController {

	@Autowired
	private ITipoModalidadService tipoModalidadService;
	
	@GetMapping
	public ResponseEntity<List<TipoModalidad>> listar(){
		List<TipoModalidad> lista = tipoModalidadService.listar();
		return new ResponseEntity<List<TipoModalidad>>(lista, HttpStatus.OK); 
	}
	
}
