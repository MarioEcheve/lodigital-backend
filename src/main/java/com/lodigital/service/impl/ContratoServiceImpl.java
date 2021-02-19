package com.lodigital.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lodigital.model.Contrato;
import com.lodigital.repo.IContratoRepo;
import com.lodigital.service.IContratoService;

@Service
public class ContratoServiceImpl implements IContratoService{

	@Autowired
	private IContratoRepo contratoRepo;
	
	@Override
	public Contrato save(Contrato obj) {
		// TODO Auto-generated method stub
		return contratoRepo.save(obj);
	}

	@Override
	public Contrato update(Contrato obj) {
		// TODO Auto-generated method stub
		return contratoRepo.save(obj);
	}

	@Override
	public List<Contrato> listar() {
		// TODO Auto-generated method stub
		return contratoRepo.findAll();
	}

	@Override
	public Contrato findById(Integer id) {
		Optional<Contrato> cn = contratoRepo.findById(id);
		return cn.isPresent() ? cn.get() : new Contrato();
	}

	@Override
	public boolean delete(Integer id) {
		contratoRepo.deleteById(id);
		return true;
	}

	@Override
	public List<Contrato> contratoByCompany(Integer idEmpresa) {
		// TODO Auto-generated method stub
		return contratoRepo.contratoByCompany(idEmpresa);
	}

}
