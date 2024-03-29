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
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lodigital.dto.GenerarCodigoVerificacionDTO;
import com.lodigital.model.Folio;
import com.lodigital.service.IFolioService;

@RestController
@RequestMapping("/folio")
public class FolioController {

	@Autowired
	private IFolioService folioService;
	
	@GetMapping(value="/listar")
	private ResponseEntity<List<Folio>> listar(){
		List<Folio> lista = folioService.listar();
		return new ResponseEntity<List<Folio>>(lista, HttpStatus.OK);
	}
	
	@PostMapping(value = "/crearFolio")
	public ResponseEntity<Folio> crearFolio(@Valid @RequestBody Folio folio){
		Folio lib = folioService.save(folio);
		return new ResponseEntity<Folio>(lib, HttpStatus.OK);
	}
	
	@GetMapping(value="/folioByLibro/{idLibro}")
	private ResponseEntity<List<Folio>> folioByLibro(@PathVariable("idLibro") Integer idLibro){
		List<Folio> lista = folioService.folioByLibro(idLibro);
		return new ResponseEntity<List<Folio>>(lista, HttpStatus.OK);
	}
	@GetMapping(value="/folioById/{idFolio}")
	private ResponseEntity<Folio> folioById(@PathVariable("idFolio") Integer idFolio){
		Folio lista = folioService.findById(idFolio);
		return new ResponseEntity<Folio>(lista, HttpStatus.OK);
	}
	
	@GetMapping(value="/eliminarFolioBorrador/{idFolio}")
	private ResponseEntity<Boolean> eliminarFolioBorrador(@PathVariable("idFolio") Integer idFolio){
		Boolean respuesta = folioService.delete(idFolio);
		return new ResponseEntity<Boolean>(respuesta, HttpStatus.OK);
	}
	
    @GetMapping("/correlativoFolio/{idLibro}")
    public String correlativoFolio(@PathVariable Integer idLibro) throws JsonProcessingException{
        String json = new ObjectMapper().writeValueAsString(folioService.correlativoFolio(idLibro));
        return json;
    }
    @PostMapping("/generarCodigoVerificacion")
    public String generarCodigoVerificacion(@RequestBody GenerarCodigoVerificacionDTO generarCodigoVerificacionDTO) throws JsonProcessingException{
        String codigo = folioService.generarCodigoVerificacion(generarCodigoVerificacionDTO);
        return new  ObjectMapper().writeValueAsString(codigo);
    }
}
