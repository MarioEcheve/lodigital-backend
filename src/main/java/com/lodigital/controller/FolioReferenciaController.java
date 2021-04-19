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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lodigital.model.FolioReferencia;
import com.lodigital.service.IFolioReferenciaService;

@RestController
@RequestMapping("/folioReferencia")
public class FolioReferenciaController {
	
	@Autowired
	private IFolioReferenciaService folioReferenciaService;
	
	@PostMapping(value = "/crearFolioReferencia")
	public ResponseEntity<FolioReferencia> crearFolioReferencia(@Valid @RequestBody FolioReferencia folioReferencia){
		FolioReferencia fr = folioReferenciaService.save(folioReferencia);
		return new ResponseEntity<FolioReferencia>(fr, HttpStatus.OK);
	}
	
	@GetMapping(value = "/obtenerFolioReferencia/{idFolio}")
	public ResponseEntity<List<FolioReferencia>> obtenerFolioReferencia(@PathVariable("idFolio") Integer idFolio){
		//FolioReferencia fr = folioReferenciaService.save(folioReferencia);
		List<FolioReferencia> lista = folioReferenciaService.buscaFolioReferenciaByFolioOrigen(idFolio);
		return new ResponseEntity<List<FolioReferencia>>(lista, HttpStatus.OK);
	}
	
	@GetMapping(value="/eliminarFolioReferencia/{idFolio}")
	private ResponseEntity<Boolean> eliminarFolioReferencia(@PathVariable("idFolio") Integer idFolio){
		Boolean respuesta = folioReferenciaService.delete(idFolio);
		return new ResponseEntity<Boolean>(respuesta, HttpStatus.OK);
	}
}
