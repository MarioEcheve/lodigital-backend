package com.lodigital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lodigital.model.PerfilUsuarioLibro;
import com.lodigital.service.IPerfilUsuarioLibroService;

@RestController
@RequestMapping("/perfilUsuarioLibro")
public class PerfilUsuarioLibroController {

	@Autowired
	private IPerfilUsuarioLibroService perfilUsuarioLibroService;
	
	@GetMapping
	private ResponseEntity<List<PerfilUsuarioLibro>> listar(){
		List<PerfilUsuarioLibro> lista = perfilUsuarioLibroService.listar();
		return new ResponseEntity<List<PerfilUsuarioLibro>>(lista,HttpStatus.OK);
	}
}
