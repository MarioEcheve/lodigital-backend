package com.lodigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lodigital.model.PerfilUsuarioLibro;
import com.lodigital.repo.IPerfilUsuarioLibroRepo;
import com.lodigital.service.IPerfilUsuarioLibroService;

@Service
public class PerfilUsuarioLibroServiceImpl implements IPerfilUsuarioLibroService{

	@Autowired
	private IPerfilUsuarioLibroRepo perfilUsuarioLibroRepo;
	
	@Override
	public PerfilUsuarioLibro save(PerfilUsuarioLibro obj) {
		// TODO Auto-generated method stub
		return perfilUsuarioLibroRepo.save(obj);
	}

	@Override
	public PerfilUsuarioLibro update(PerfilUsuarioLibro obj) {
		// TODO Auto-generated method stub
		return perfilUsuarioLibroRepo.save(obj);
	}

	@Override
	public List<PerfilUsuarioLibro> listar() {
		// TODO Auto-generated method stub
		return perfilUsuarioLibroRepo.findAll();
	}

	@Override
	public PerfilUsuarioLibro findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
