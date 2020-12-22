package com.lodigital.controller;

import java.util.List;

import org.jfree.util.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lodigital.model.Empresa;
import com.lodigital.model.Usuario;
import com.lodigital.service.IEmpresaService;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
	
	@Autowired
	private IEmpresaService empresaService;
	
	@GetMapping
	public ResponseEntity<List<Empresa>> listar(){
		 List<Empresa> lista = empresaService.listar();
		return new ResponseEntity<List<Empresa>>(lista, HttpStatus.OK);
	}
	
}
