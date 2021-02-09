package com.lodigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lodigital.model.EstadoServicioContrato;
import com.lodigital.repo.IEstadoServicioContratoRepo;
import com.lodigital.service.IEstadoServicioContratoService;


@Service
public class EstadoServicioContratoServiceImpl implements IEstadoServicioContratoService{

	@Autowired
	private IEstadoServicioContratoRepo estadoServicioContratoRepo;
	
	@Override
	public EstadoServicioContrato save(EstadoServicioContrato obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoServicioContrato update(EstadoServicioContrato obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EstadoServicioContrato> listar() {
		// TODO Auto-generated method stub
		return estadoServicioContratoRepo.findAll();
	}

	@Override
	public EstadoServicioContrato findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
