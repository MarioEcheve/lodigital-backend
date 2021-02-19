package com.lodigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lodigital.model.TipoContrato;
import com.lodigital.repo.ITipoContratoRepo;
import com.lodigital.service.ITipoContratoService;

@Service
public class TipoContratoServiceImpl implements ITipoContratoService{

	@Autowired
	private ITipoContratoRepo tipoContratoRepo;
	
	@Override
	public TipoContrato save(TipoContrato obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoContrato update(TipoContrato obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TipoContrato> listar() {
		// TODO Auto-generated method stub
		return tipoContratoRepo.findAll();
	}

	@Override
	public TipoContrato findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
