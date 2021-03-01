package com.lodigital.controller;

import java.util.List;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

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

import com.lodigital.dto.UsuarioLibroDTO;
import com.lodigital.model.Contrato;
import com.lodigital.model.UsuarioLibro;
import com.lodigital.service.IUsuarioLibroService;

@RestController
@RequestMapping("/usuarioLibro")
public class UsuarioLibroController {
	
	@Autowired
	private IUsuarioLibroService usuarioLibroService;
	
	@PostMapping(value = "/crearUsuarioLibro")
	public ResponseEntity<Integer> crearUsuario(@Valid @RequestBody UsuarioLibroDTO usuarioLibroDTO){
		Integer idEmpresa;
		if(usuarioLibroDTO.getMandante().equals(true)) {
			idEmpresa = usuarioLibroDTO.getLibro().getContrato().getIdEmpresaMandante();
		}else {
			idEmpresa = usuarioLibroDTO.getLibro().getContrato().getIdEmpresaContratista();
		}
		
		Integer usr = usuarioLibroService.guarda(idEmpresa, 
													  usuarioLibroDTO.getUsuarioEmpresa().getUsuario().getIdUsuario(), 
													  usuarioLibroDTO.getUsuarioEmpresa().getRol().getIdRol(), 
													  usuarioLibroDTO.getLibro().getIdLibro(), 
													  usuarioLibroDTO.getCargo(), 
													  usuarioLibroDTO.getPerfilUsuarioLibro().getId(), 
													  usuarioLibroDTO.getEstadoUsuarioLibro().getId()); 
		return new ResponseEntity<Integer>(usr, HttpStatus.OK);
	}
	 
	@PutMapping(value = "/actualizarUsuarioLibro")
	public ResponseEntity<Integer> actualizarUsuarioLibro(@Valid @RequestBody UsuarioLibroDTO usuarioLibroDTO){
		Integer idEmpresa;
		if(usuarioLibroDTO.getMandante().equals(true)) {
			idEmpresa = usuarioLibroDTO.getLibro().getContrato().getIdEmpresaMandante();
		}else {
			idEmpresa = usuarioLibroDTO.getLibro().getContrato().getIdEmpresaContratista();
		}
		
		Integer usr = usuarioLibroService.actualizar(idEmpresa, 
													  usuarioLibroDTO.getUsuarioEmpresa().getUsuario().getIdUsuario(), 
													  usuarioLibroDTO.getUsuarioEmpresa().getRol().getIdRol(), 
													  usuarioLibroDTO.getLibro().getIdLibro(), 
													  usuarioLibroDTO.getCargo(), 
													  usuarioLibroDTO.getPerfilUsuarioLibro().getId(), 
													  usuarioLibroDTO.getEstadoUsuarioLibro().getId()); 
		return new ResponseEntity<Integer>(usr, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<UsuarioLibro>> listar(){
		 List<UsuarioLibro> lista = usuarioLibroService.listar();
		return new ResponseEntity<List<UsuarioLibro>>(lista, HttpStatus.OK);
	}
	
	@GetMapping(value = "/buscarUsuarioLibrosByLibro/{idLibro}")
	public ResponseEntity<List<UsuarioLibro>> buscarUsuarioLibrosByLibro(@PathVariable("idLibro") Integer idLibro){
		 List<UsuarioLibro> lista = usuarioLibroService.buscarUsuarioLibrosByLibro(idLibro);
		return new ResponseEntity<List<UsuarioLibro>>(lista, HttpStatus.OK);
	}

}
