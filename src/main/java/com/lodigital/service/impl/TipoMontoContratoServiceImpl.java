package com.lodigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lodigital.model.TipoMontoContrato;
import com.lodigital.repo.ITipoMontoContratoRepo;
import com.lodigital.service.ITipoMontoContratoService;

@Service
public class TipoMontoContratoServiceImpl implements ITipoMontoContratoService{

	@Autowired
	private ITipoMontoContratoRepo tipoMontoContratoRepo;
	
	@Override
	public TipoMontoContrato save(TipoMontoContrato obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoMontoContrato update(TipoMontoContrato obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TipoMontoContrato> listar() {
		// TODO Auto-generated method stub
		return tipoMontoContratoRepo.findAll();
	}

	@Override
	public TipoMontoContrato findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
