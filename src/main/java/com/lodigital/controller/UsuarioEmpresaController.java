package com.lodigital.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lodigital.dto.UsuarioEmpresaDTO;
import com.lodigital.model.ResetToken;
import com.lodigital.model.Usuario;
import com.lodigital.model.UsuarioEmpresa;
import com.lodigital.service.IResetTokenService;
import com.lodigital.service.IUsuarioEmpresaService;

@RestController
@RequestMapping("/usuarioEmpresa")
public class UsuarioEmpresaController {
	
	@Autowired
	private IUsuarioEmpresaService service;
	
	@Autowired
	private IResetTokenService tokenService;
	
	
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
	
	@GetMapping(value = "/usuariosEmpresasByCompanyAndUser/{idEmpresa}/{idUsuario}")
	public ResponseEntity<List<UsuarioEmpresa>> usuariosEmpresasByCompanyAndUser(@PathVariable("idEmpresa") Integer idEmpresa,@PathVariable("idUsuario") Integer idUsuario) {
		List<UsuarioEmpresa> usuarioEmpresa = new ArrayList<>();
		usuarioEmpresa = service.usuariosEmpresasByCompanyAndUser(idEmpresa,idUsuario);
		return new ResponseEntity<List<UsuarioEmpresa>>(usuarioEmpresa, HttpStatus.OK);
	}
	
	@PostMapping(value = "/crearUsuarioEmpresa")
	public ResponseEntity<Integer> crearUsuarioEmpresa(@Valid @RequestBody UsuarioEmpresa usuarioEmpresa){
		Integer usr = service.guarda(usuarioEmpresa.getEmpresa().getIdEmpresa(), 
									 usuarioEmpresa.getUsuario().getIdUsuario(), 
									 usuarioEmpresa.getRol().getIdRol(),
									 usuarioEmpresa.getFechaCreacion(), 
									 usuarioEmpresa.getEstadoUsuario().getIdEstadoUsuario());
		return new ResponseEntity<Integer>(usr, HttpStatus.OK);
	}
	@PutMapping(value = "/crearUsuarioEmpresa")
	public ResponseEntity<Integer> actualizarUsuarioEmpresa(@Valid @RequestBody UsuarioEmpresaDTO usuarioEmpresaDto){
		Integer usr = service.update(usuarioEmpresaDto.getEmpresa().getIdEmpresa(), 
									 usuarioEmpresaDto.getUsuario().getIdUsuario(), 
									 usuarioEmpresaDto.getFechaActivacion(), 
									 usuarioEmpresaDto.getEstadoUsuario().getIdEstadoUsuario());
		
		ResetToken rt = tokenService.findByToken(usuarioEmpresaDto.getToken());
		tokenService.eliminar(rt);
		return new ResponseEntity<Integer>(usr, HttpStatus.OK);
	}
}
