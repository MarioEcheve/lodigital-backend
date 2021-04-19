package com.lodigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lodigital.model.EstadoContrato;
import com.lodigital.repo.IEstadoContratoRepo;
import com.lodigital.service.IEstadoContratoService;

@Service
public class EstadoContratoServiceImpl implements IEstadoContratoService{

	@Autowired
	private IEstadoContratoRepo estadoContratoRepo;
	
	@Override
	public EstadoContrato save(EstadoContrato obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoContrato update(EstadoContrato obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EstadoContrato> listar() {
		// TODO Auto-generated method stub
		return estadoContratoRepo.findAll();
	}

	@Override
	public EstadoContrato findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
