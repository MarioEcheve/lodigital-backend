package com.lodigital.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lodigital.model.Contrato;
import com.lodigital.model.UsuarioLibro;
import com.lodigital.service.IUsuarioLibroService;

@RestController
@RequestMapping("/usuarioLibro")
public class UsuarioLibroController {
	
	@Autowired
	private IUsuarioLibroService usuarioLibroService;
	
	@PostMapping(value = "/crearUsuarioLibro")
	public ResponseEntity<UsuarioLibro> crearUsuario(@Valid @RequestBody UsuarioLibro usuarioLibro){
		UsuarioLibro usr = usuarioLibroService.save(usuarioLibro);
		return new ResponseEntity<UsuarioLibro>(usr, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<UsuarioLibro>> listar(){
		 List<UsuarioLibro> lista = usuarioLibroService.listar();
		return new ResponseEntity<List<UsuarioLibro>>(lista, HttpStatus.OK);
	}

}
