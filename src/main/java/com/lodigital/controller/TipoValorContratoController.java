package com.lodigital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lodigital.model.TipoValorContrato;
import com.lodigital.service.ITipoValorContratoService;

@RestController
@RequestMapping("/tipoValorContrato")
public class TipoValorContratoController {
	
	@Autowired
	private ITipoValorContratoService  tipoValorContratoService;
	
	@GetMapping
	private ResponseEntity<List<TipoValorContrato>> listar(){
		List<TipoValorContrato> lista = tipoValorContratoService.listar();
		return new ResponseEntity<List<TipoValorContrato>>(lista , HttpStatus.OK);
	}
}
