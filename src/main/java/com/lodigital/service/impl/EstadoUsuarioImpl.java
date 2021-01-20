package com.lodigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lodigital.model.EstadoUsuario;
import com.lodigital.repo.IEstadoUsuarioRepo;
import com.lodigital.service.IEstadoService;

@Service
public class EstadoUsuarioImpl implements IEstadoService{
	
	@Autowired
	private IEstadoUsuarioRepo estadoUsuarioRepo;

	@Override
	public EstadoUsuario save(EstadoUsuario obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoUsuario update(EstadoUsuario obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EstadoUsuario> listar() {
		// TODO Auto-generated method stub
		return estadoUsuarioRepo.findAll();
	}

	@Override
	public EstadoUsuario findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
