package com.lodigital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lodigital.model.Rol;
import com.lodigital.service.IRolService;

@Controller
@RequestMapping("/rol")
public class RolController {

	@Autowired
	private IRolService rolService;
	
	@GetMapping
	public ResponseEntity<List<Rol>> listar(){
		 List<Rol> lista = rolService.listar();
		return new ResponseEntity<List<Rol>>(lista, HttpStatus.OK);
	}
}
