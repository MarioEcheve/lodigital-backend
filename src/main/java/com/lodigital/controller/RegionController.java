package com.lodigital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lodigital.model.Region;
import com.lodigital.service.IRegionService;

@RestController
@RequestMapping("/region")
public class RegionController {
	
	@Autowired
	private IRegionService regionService;
	
	@GetMapping
	public ResponseEntity<List<Region>> listar(){
		 List<Region> lista = regionService.listar();
		return new ResponseEntity<List<Region>>(lista, HttpStatus.OK);
	}
}
