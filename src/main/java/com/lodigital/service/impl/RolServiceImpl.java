package com.lodigital.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lodigital.model.Rol;
import com.lodigital.repo.IRolRepo;
import com.lodigital.service.IRolService;
@Service
public class RolServiceImpl implements IRolService{

	@Autowired
	private IRolRepo rolRepo;
	
	@Override
	public Rol save(Rol obj) {
		// TODO Auto-generated method stub
		return rolRepo.save(obj);
	}

	@Override
	public Rol update(Rol obj) {
		// TODO Auto-generated method stub
		return rolRepo.save(obj);
	}

	@Override
	public List<Rol> listar() {
		// TODO Auto-generated method stub
		return rolRepo.findAll();
	}

	@Override
	public Rol findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Integer id) {
		rolRepo.deleteById(id);
		return true;
	}

	
	
	

}
