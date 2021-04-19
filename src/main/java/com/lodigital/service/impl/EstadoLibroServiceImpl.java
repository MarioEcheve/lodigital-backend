package com.lodigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lodigital.model.EstadoLibro;
import com.lodigital.repo.IEstadoLibroRepo;
import com.lodigital.service.IEstadoLibroService;

@Service
public class EstadoLibroServiceImpl implements IEstadoLibroService{

	@Autowired
	private IEstadoLibroRepo estadoLibroRepo;
	
	@Override
	public EstadoLibro save(EstadoLibro obj) {
		// TODO Auto-generated method stub
		return estadoLibroRepo.save(obj);
	}

	@Override
	public EstadoLibro update(EstadoLibro obj) {
		// TODO Auto-generated method stub
		return estadoLibroRepo.save(obj);
	}

	@Override
	public List<EstadoLibro> listar() {
		// TODO Auto-generated method stub
		return estadoLibroRepo.findAll();
	}

	@Override
	public EstadoLibro findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
