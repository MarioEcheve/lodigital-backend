package com.lodigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lodigital.model.TipoFirma;
import com.lodigital.repo.ITipoFirmaRepo;
import com.lodigital.service.ITipoFirmaService;

@Service
public class TipoFirmaServiceImpl implements ITipoFirmaService{

	@Autowired
	private ITipoFirmaRepo tipoFirmaRepo;
	
	@Override
	public TipoFirma save(TipoFirma obj) {
		// TODO Auto-generated method stub
		return tipoFirmaRepo.save(obj);
	}

	@Override
	public TipoFirma update(TipoFirma obj) {
		// TODO Auto-generated method stub
		return tipoFirmaRepo.save(obj);
	}

	@Override
	public List<TipoFirma> listar() {
		// TODO Auto-generated method stub
		return tipoFirmaRepo.findAll();
	}

	@Override
	public TipoFirma findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
