package com.lodigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lodigital.model.Libro;
import com.lodigital.repo.ILibroRepo;
import com.lodigital.service.ILibroService;


@Service
public class LibroServiceImpl implements ILibroService{

	@Autowired
	private ILibroRepo libroRepo;
	
	
	@Override
	public Libro save(Libro obj) {
		// TODO Auto-generated method stub
		return libroRepo.save(obj);
	}

	@Override
	public Libro update(Libro obj) {
		// TODO Auto-generated method stub
		return libroRepo.save(obj);
	}

	@Override
	public List<Libro> listar() {
		// TODO Auto-generated method stub
		return libroRepo.findAll();
	}

	@Override
	public Libro findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Libro> libroByContrato(Integer idContrato) {
		// TODO Auto-generated method stub
		return libroRepo.libroByContrato(idContrato);
	}

}
