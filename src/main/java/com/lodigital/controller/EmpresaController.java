package com.lodigital.controller;

import java.util.List;

import javax.validation.Valid;

import org.jfree.util.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping(value = "/usuarioByRut/{rut}")
	public ResponseEntity<Usuario> usuarioByRut(@PathVariable("rut") String rut) {
		Usuario usr = empresaService.buscarPorRut(rut);
		return new ResponseEntity<Usuario>(usr, HttpStatus.OK);
	}
	
	@GetMapping(value = "/empresaByRut/{rut}")
	public ResponseEntity<Empresa> empresaByRut(@PathVariable("rut") String rut) {
		Empresa usr = empresaService.empresaByRutEmpresa(rut);
		return new ResponseEntity<Empresa>(usr, HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Empresa> modificar(@Valid @RequestBody Empresa empresa){
		Empresa emp = empresaService.update(empresa);
		return new ResponseEntity<Empresa>(emp, HttpStatus.OK);
	}
}
