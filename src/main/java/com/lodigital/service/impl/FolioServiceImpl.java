package com.lodigital.service.impl;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lodigital.dto.GenerarCodigoVerificacionDTO;
import com.lodigital.model.Folio;
import com.lodigital.repo.IFolioRepo;
import com.lodigital.service.IFolioService;

@Service
public class FolioServiceImpl implements IFolioService{

	@Autowired
	private IFolioRepo folioRepo;
	
	@Override
	public Folio save(Folio obj) {
		// TODO Auto-generated method stub
		return folioRepo.save(obj);
	}

	@Override
	public Folio update(Folio obj) {
		// TODO Auto-generated method stub
		return folioRepo.save(obj);
	}

	@Override
	public List<Folio> listar() {
		// TODO Auto-generated method stub
		return folioRepo.findAll();
	}

	@Override
	public Folio findById(Integer id) {
		Optional<Folio> lib = folioRepo.findById(id);
		return lib.isPresent() ? lib.get() : new Folio();
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		folioRepo.deleteById(id);
		return true;
	}

	@Override
	public List<Folio> folioByLibro(Integer idLibro) {
		// TODO Auto-generated method stub
		return folioRepo.folioByLibro(idLibro);
	}

	@Override
	public List<Map<String, String>> correlativoFolio(Integer idLibro) {
		// TODO Auto-generated method stub
		return folioRepo.correlativoFolio(idLibro);
	}

	@Override
	public String generarCodigoVerificacion(GenerarCodigoVerificacionDTO generarCodigoVerificacionDTO)  {
		//Criterio para el calculo del codigo de verificacion es la fecha actual
		Date fechaHoy = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = formatter.format(fechaHoy); 
		String fechaSinGuion = format.replaceAll("-", "");
		String fechaSinDosPuntos = fechaSinGuion.replaceAll(":", "");
		String fechaSinEspacios = fechaSinDosPuntos.replaceAll(" ", "");
		String nombreContrato = generarCodigoVerificacionDTO.getNombreContrato();
		String nombreLibro = generarCodigoVerificacionDTO.getNombreLibro();
		
		char[] possibleCharacters = (new String(nombreContrato+nombreLibro+fechaSinEspacios)).toCharArray();
		String randomStr = RandomStringUtils.random(8,0, possibleCharacters.length-1, false, false, possibleCharacters, new SecureRandom());
		return randomStr;
	}
}
