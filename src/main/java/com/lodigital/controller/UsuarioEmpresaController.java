package com.lodigital.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lodigital.model.UsuarioEmpresa;
import com.lodigital.service.IUsuarioEmpresaService;

@RestController
@RequestMapping("/usuarioEmpresa")
public class UsuarioEmpresaController {
	
	@Autowired
	private IUsuarioEmpresaService service;
	
	@GetMapping(value = "/{idUsuario}")
	public ResponseEntity<List<UsuarioEmpresa>> usuariosEmpresasByUser(@PathVariable("idUsuario") Integer idUsuario) {
		List<UsuarioEmpresa> usuarioEmpresa = new ArrayList<>();
		usuarioEmpresa = service.usuariosEmpresasByUser(idUsuario);
		return new ResponseEntity<List<UsuarioEmpresa>>(usuarioEmpresa, HttpStatus.OK);
	}
	@GetMapping(value = "/usuariosEmpresasByCompany/{idEmpresa}")
	public ResponseEntity<List<UsuarioEmpresa>> usuariosEmpresasByCompany(@PathVariable("idEmpresa") Integer idEmpresa) {
		List<UsuarioEmpresa> usuarioEmpresa = new ArrayList<>();
		usuarioEmpresa = service.usuariosEmpresasByCompany(idEmpresa);
		return new ResponseEntity<List<UsuarioEmpresa>>(usuarioEmpresa, HttpStatus.OK);
	}
}
