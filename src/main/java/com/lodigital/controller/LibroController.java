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

import com.lodigital.model.Libro;
import com.lodigital.service.ILibroService;

@RestController
@RequestMapping("/libro")
public class LibroController {
	
	@Autowired
	private ILibroService libroService;
	
	@GetMapping(value="/listar")
	private ResponseEntity<List<Libro>> listar(){
		List<Libro> lista = libroService.listar();
		return new ResponseEntity<List<Libro>>(lista, HttpStatus.OK);
	}
	
	@GetMapping(value = "/libroByContrato/{idContrato}")
	public ResponseEntity<List<Libro>> libroByContrato(@PathVariable("idContrato") Integer idContrato) {
		List<Libro> lista = libroService.libroByContrato(idContrato);
		return new ResponseEntity<List<Libro>>(lista, HttpStatus.OK);
	}
	
	@PostMapping(value = "/crearLibro")
	public ResponseEntity<Libro> crearUsuario(@Valid @RequestBody Libro libro){
		Libro lib = libroService.save(libro);
		return new ResponseEntity<Libro>(lib, HttpStatus.OK);
	}
}
