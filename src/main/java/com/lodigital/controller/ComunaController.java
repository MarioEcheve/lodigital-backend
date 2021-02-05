package com.lodigital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lodigital.model.Comuna;
import com.lodigital.model.Empresa;
import com.lodigital.model.Usuario;
import com.lodigital.service.IComunaService;

@RestController
@RequestMapping("/comuna")
public class ComunaController {
	
	@Autowired
	private IComunaService comunaService;
	
	@GetMapping(value = "/comunaPorRegion/{idRegion}")
	public ResponseEntity<List<Comuna>> comunasPorRegion(@PathVariable("idRegion") Integer idRegion) {
		List<Comuna> lista = comunaService.comunas(idRegion);
		return new ResponseEntity<List<Comuna>>(lista, HttpStatus.OK);
	}
	
}