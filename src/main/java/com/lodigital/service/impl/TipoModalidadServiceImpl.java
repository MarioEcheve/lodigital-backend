package com.lodigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lodigital.model.TipoModalidad;
import com.lodigital.repo.ITipoModalidadRepo;
import com.lodigital.service.ITipoModalidadService;

@Service
public class TipoModalidadServiceImpl implements ITipoModalidadService{
	
	@Autowired
	private ITipoModalidadRepo tipoModalidadRepo;
	
	
	@Override
	public TipoModalidad save(TipoModalidad obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoModalidad update(TipoModalidad obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TipoModalidad> listar() {
		// TODO Auto-generated method stub
		return tipoModalidadRepo.findAll();
	}

	@Override
	public TipoModalidad findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
