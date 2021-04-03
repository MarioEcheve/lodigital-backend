package com.lodigital.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
