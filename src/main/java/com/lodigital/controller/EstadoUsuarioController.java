package com.lodigital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lodigital.model.EstadoUsuario;
import com.lodigital.service.IEstadoService;

@RestController
@RequestMapping("/estadoUsuario")
public class EstadoUsuarioController {

	@Autowired
	private IEstadoService estadoUsuarioService;
	
	@GetMapping
	public ResponseEntity<List<EstadoUsuario>> listar(){
		 List<EstadoUsuario> lista = estadoUsuarioService.listar();
		return new ResponseEntity<List<EstadoUsuario>>(lista, HttpStatus.OK);
	}
}	
