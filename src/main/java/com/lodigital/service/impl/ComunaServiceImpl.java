package com.lodigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lodigital.model.Comuna;
import com.lodigital.repo.IComunaRepo;
import com.lodigital.service.IComunaService;

@Service
public class ComunaServiceImpl implements IComunaService{

	@Autowired
	private IComunaRepo comunaRepo;
	
	@Override
	public Comuna save(Comuna obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comuna update(Comuna obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comuna> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comuna findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Comuna> comunas(Integer idRegion) {
		return comunaRepo.listaComunas(idRegion);
	}

	
}
