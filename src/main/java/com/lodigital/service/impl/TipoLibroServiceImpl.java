package com.lodigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lodigital.model.TipoLibro;
import com.lodigital.repo.ITipoLibroRepo;
import com.lodigital.service.ITipoLibroService;
@Service
public class TipoLibroServiceImpl implements ITipoLibroService{

	@Autowired
	private ITipoLibroRepo tipoLibroRepo;
	
	@Override
	public TipoLibro save(TipoLibro obj) {
		// TODO Auto-generated method stub
		return tipoLibroRepo.save(obj);
	}

	@Override
	public TipoLibro update(TipoLibro obj) {
		// TODO Auto-generated method stub
		return tipoLibroRepo.save(obj);
	}

	@Override
	public List<TipoLibro> listar() {
		// TODO Auto-generated method stub
		return tipoLibroRepo.findAll();
	}

	@Override
	public TipoLibro findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
