package com.lodigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lodigital.model.TipoValorContrato;
import com.lodigital.repo.ITipoValorContratoRepo;
import com.lodigital.service.ITipoValorContratoService;

@Service
public class TipoValorContratoServiceImpl implements ITipoValorContratoService  {

	@Autowired
	private ITipoValorContratoRepo tipoValorContratoRepo;
	
	@Override
	public TipoValorContrato save(TipoValorContrato obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoValorContrato update(TipoValorContrato obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TipoValorContrato> listar() {
		// TODO Auto-generated method stub
		return tipoValorContratoRepo.findAll();
	}

	@Override
	public TipoValorContrato findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
