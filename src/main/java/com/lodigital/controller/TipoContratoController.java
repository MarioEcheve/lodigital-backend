package com.lodigital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lodigital.model.TipoContrato;
import com.lodigital.service.ITipoContratoService;

@RestController
@RequestMapping("/tipoContrato")
public class TipoContratoController {

	@Autowired
	private ITipoContratoService tipoContratoService;
	
	@GetMapping
	public ResponseEntity<List<TipoContrato>> listar(){
		 List<TipoContrato> lista = tipoContratoService.listar();
		return new ResponseEntity<List<TipoContrato>>(lista, HttpStatus.OK);
	}
}
