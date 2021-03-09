package com.lodigital.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lodigital.model.TipoFolio;
import com.lodigital.repo.ITipoFolioRepo;
import com.lodigital.service.ITipoFolioService;

@Service
public class TipoFolioServiceImpl implements ITipoFolioService{

	@Autowired
	private ITipoFolioRepo tipoFolioRepo;
	
	@Override
	public TipoFolio save(TipoFolio obj) {
		// TODO Auto-generated method stub
		return tipoFolioRepo.save(obj);
	}

	@Override
	public TipoFolio update(TipoFolio obj) {
		// TODO Auto-generated method stub
		return tipoFolioRepo.save(obj);
	}

	@Override
	public List<TipoFolio> listar() {
		// TODO Auto-generated method stub
		return tipoFolioRepo.findAll();
	}

	@Override
	public TipoFolio findById(Integer id) {
		Optional<TipoFolio> tipo = tipoFolioRepo.findById(id);
		return tipo.isPresent() ? tipo.get() : new TipoFolio();
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
