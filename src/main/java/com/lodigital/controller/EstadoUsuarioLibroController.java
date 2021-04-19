package com.lodigital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lodigital.model.EstadoUsuarioLibro;
import com.lodigital.service.IEstadoUsuarioLibroService;

@RestController
@RequestMapping("/estadoUsuarioLibro")
public class EstadoUsuarioLibroController {

	@Autowired
	private IEstadoUsuarioLibroService estadoUsuarioLibroService;
	
	@GetMapping
	private ResponseEntity<List<EstadoUsuarioLibro>> listar(){
		List<EstadoUsuarioLibro> lista = estadoUsuarioLibroService.listar();
		return new ResponseEntity<List<EstadoUsuarioLibro>>(lista, HttpStatus.OK);
	}
}
