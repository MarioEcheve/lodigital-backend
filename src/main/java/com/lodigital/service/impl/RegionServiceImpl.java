package com.lodigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lodigital.model.Region;
import com.lodigital.repo.IRegionRepo;
import com.lodigital.service.IRegionService;

@Service
public class RegionServiceImpl implements IRegionService{

	@Autowired
	private IRegionRepo regionRepo;
	
	@Override
	public Region save(Region obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Region update(Region obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Region> listar() {
		// TODO Auto-generated method stub
		return regionRepo.findAll();
	}

	@Override
	public Region findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
