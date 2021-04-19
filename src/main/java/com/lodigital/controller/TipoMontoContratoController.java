package com.lodigital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lodigital.model.TipoMontoContrato;
import com.lodigital.service.ITipoMontoContratoService;

@RestController
@RequestMapping("/tipoMontoContrato")
public class TipoMontoContratoController {
	
	@Autowired
	private ITipoMontoContratoService tipoMontoContratoService;
	
	
	@GetMapping
	private ResponseEntity<List<TipoMontoContrato>> listar(){
		List<TipoMontoContrato> lista = tipoMontoContratoService.listar();
		return new ResponseEntity<List<TipoMontoContrato>>(lista , HttpStatus.OK);
	}

}
