package com.lodigital.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lodigital.model.Usuario;
import com.lodigital.service.IUsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private IUsuarioService usuarioService;
	
	@Autowired
	private BCryptPasswordEncoder bcrypt;
	
	@PutMapping
	public ResponseEntity<Usuario> modificar(@Valid @RequestBody Usuario usuario){
		String password = bcrypt.encode(usuario.getPassword());
		usuario.setPassword(password);
		Usuario usr = usuarioService.update(usuario);
		return new ResponseEntity<Usuario>(usr, HttpStatus.OK);
	}
	
	@GetMapping(value = "/usuarioByRut/{rut}")
	public ResponseEntity<Usuario> usuariosByRut(@PathVariable("rut") String rut) {
		Usuario usuario = usuarioService.usuariosByRut(rut);
		return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
	}
	
	@PostMapping(value = "/crearUsuario")
	public ResponseEntity<Usuario> crearUsuario(@Valid @RequestBody Usuario usuario){
		Usuario usr = usuarioService.save(usuario);
		return new ResponseEntity<Usuario>(usr, HttpStatus.OK);
	}
	
}