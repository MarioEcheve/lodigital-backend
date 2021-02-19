package com.lodigital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lodigital.model.EstadoLibro;
import com.lodigital.service.IEstadoLibroService;

@RestController
@RequestMapping("/estadoLibro")
public class EstadoLibroController {

	
	@Autowired
	private IEstadoLibroService estadoLibroService;
	
	@GetMapping
	public ResponseEntity<List<EstadoLibro>> listar() {
		List<EstadoLibro> lista = estadoLibroService.listar();
		return new ResponseEntity<List<EstadoLibro>>(lista, HttpStatus.OK);
	}
}
