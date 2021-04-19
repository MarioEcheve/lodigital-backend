package com.lodigital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lodigital.model.ConfiguracionTipoFolioTipoLibro;
import com.lodigital.service.IConfiguracionTipoFolioTipoLibroService;

@RestController
@RequestMapping("/configuracionTipoFolioTipoLibro")
public class ConfiguracionTipoFolioTipoLibroController {

	@Autowired
	private IConfiguracionTipoFolioTipoLibroService configuracionTipoFolioTipoLibroService;
	
	
	@GetMapping
	public ResponseEntity<List<ConfiguracionTipoFolioTipoLibro>> listar(){
		 List<ConfiguracionTipoFolioTipoLibro> lista = configuracionTipoFolioTipoLibroService.listar();
		return new ResponseEntity<List<ConfiguracionTipoFolioTipoLibro>>(lista, HttpStatus.OK);
	}
}
