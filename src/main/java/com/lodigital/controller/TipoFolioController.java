package com.lodigital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lodigital.model.TipoFolio;
import com.lodigital.service.ITipoFolioService;

@RestController
@RequestMapping("/tipoFolio")
public class TipoFolioController {
	
	@Autowired
	private ITipoFolioService tipoFolioService;

	@GetMapping(value="/listar")
	private ResponseEntity<List<TipoFolio>> listar(){
		List<TipoFolio> lista = tipoFolioService.listar();
		return new ResponseEntity<List<TipoFolio>>(lista, HttpStatus.OK);
	}
}
