package com.lodigital.controller;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lodigital.dto.RequestDTO;
import com.lodigital.service.impl.PDFServicesImpl;

@RestController
public class TestPdfController {
	
	@Autowired @Qualifier(value = "pdfservice")
	private PDFServicesImpl pdfServices;
	
	 @PostMapping(value = "/pdf/generar", produces = MediaType.APPLICATION_PDF_VALUE)
	    public ResponseEntity<InputStreamResource> generarPdf(@RequestBody RequestDTO requestDTO) throws IOException {
	        InputStream inputStream = pdfServices.generarPdf("templates/test.html",requestDTO.getParametros(),"/templates");
	        return ResponseEntity.status(HttpStatus.CREATED)
	                .header("Content-Disposition", "attachment; filename=starter-test.pdf")
	                .body(new InputStreamResource(inputStream));
	    }
}