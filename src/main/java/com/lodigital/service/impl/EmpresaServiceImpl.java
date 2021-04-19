package com.lodigital.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lodigital.model.Empresa;
import com.lodigital.model.Usuario;
import com.lodigital.repo.IEmpresaRepo;
import com.lodigital.repo.IUsuarioRepo;
import com.lodigital.service.IEmpresaService;

@Service
public class EmpresaServiceImpl implements IEmpresaService{

	@Autowired
	private IUsuarioRepo usuarioRepo;
	
	@Autowired
	private IEmpresaRepo empresaRepo;
	
	@Override
	public Empresa save(Empresa obj) {
		// TODO Auto-generated method stub
		return empresaRepo.save(obj);
	}

	@Override
	public Empresa update(Empresa obj) {
		// TODO Auto-generated method stub
		return empresaRepo.save(obj);
	}

	@Override
	public List<Empresa> listar() {
		// TODO Auto-generated method stub
		return empresaRepo.findAll();
	}

	@Override
	public Empresa findById(Integer id) {
		Optional<Empresa> op = empresaRepo.findById(id);
		return op.isPresent() ? op.get() : new Empresa();
	}

	@Override
	public boolean delete(Integer id) {
		empresaRepo.deleteById(id);
		return true;
	}
	@Override
	public Usuario buscarPorRut(String rut) {
		return  usuarioRepo.findByRut(rut);
		
	}

	@Override
	public Empresa empresaByRutEmpresa(String rut) {
		// TODO Auto-generated method stub
		return empresaRepo.findOneByRut(rut);
	}
}
