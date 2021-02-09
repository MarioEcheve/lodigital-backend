package com.lodigital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lodigital.model.EstadoServicioContrato;
import com.lodigital.model.EstadoUsuario;
import com.lodigital.service.IEstadoService;
import com.lodigital.service.IEstadoServicioContratoService;

@RestController
@RequestMapping("/estadoServicioContrato")
public class EstadoServicioContratoController {

	@Autowired
	private IEstadoServicioContratoService estadoServicioService;
	
	@GetMapping
	public ResponseEntity<List<EstadoServicioContrato>> listar(){
		 List<EstadoServicioContrato> lista = estadoServicioService.listar();
		return new ResponseEntity<List<EstadoServicioContrato>>(lista, HttpStatus.OK);
	}
}
