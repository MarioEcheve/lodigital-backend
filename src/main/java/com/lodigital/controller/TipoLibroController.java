package com.lodigital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lodigital.model.TipoLibro;
import com.lodigital.service.ITipoLibroService;

@RestController
@RequestMapping("/tipoLibro")
public class TipoLibroController {

	@Autowired
	private ITipoLibroService tipoLibroService;
	
	@GetMapping
	public ResponseEntity<List<TipoLibro>> listar() {
		List<TipoLibro> lista = tipoLibroService.listar();
		return new ResponseEntity<List<TipoLibro>>(lista, HttpStatus.OK);
	}
}
