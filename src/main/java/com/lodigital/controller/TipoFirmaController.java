package com.lodigital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lodigital.model.TipoFirma;
import com.lodigital.service.ITipoFirmaService;

@RestController
@RequestMapping("/tipoFirma")
public class TipoFirmaController {
	
	@Autowired
	private ITipoFirmaService tipoFirmaService;
	
	@GetMapping
	ResponseEntity<List<TipoFirma>> listar(){
		List<TipoFirma> lista = tipoFirmaService.listar();
		return new ResponseEntity<List<TipoFirma>>(lista, HttpStatus.OK);
	}
}
