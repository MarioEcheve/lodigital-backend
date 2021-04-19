package com.lodigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lodigital.model.EstadoUsuarioLibro;
import com.lodigital.repo.IEstadoUsuarioLibroRepo;
import com.lodigital.service.IEstadoUsuarioLibroService;

@Service
public class EstadoUsuarioLibroServiceImpl implements IEstadoUsuarioLibroService{

	@Autowired
	private IEstadoUsuarioLibroRepo estadoUsuarioLibroRepo;
	
	@Override
	public EstadoUsuarioLibro save(EstadoUsuarioLibro obj) {
		// TODO Auto-generated method stub
		return estadoUsuarioLibroRepo.save(obj);
	}

	@Override
	public EstadoUsuarioLibro update(EstadoUsuarioLibro obj) {
		// TODO Auto-generated method stub
		return estadoUsuarioLibroRepo.save(obj);
	}

	@Override
	public List<EstadoUsuarioLibro> listar() {
		// TODO Auto-generated method stub
		return estadoUsuarioLibroRepo.findAll();
	}

	@Override
	public EstadoUsuarioLibro findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
