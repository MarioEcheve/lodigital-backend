package com.lodigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lodigital.model.ConfiguracionTipoFolioTipoLibro;
import com.lodigital.repo.IConfiguracionTipoFolioTipoLibroRepo;
import com.lodigital.service.IConfiguracionTipoFolioTipoLibroService;
@Service
public class ConfiguracionTipoFolioTipoLibrosServiceImpl implements IConfiguracionTipoFolioTipoLibroService{

	@Autowired
	private IConfiguracionTipoFolioTipoLibroRepo configuracionTipoFolioTipoLibroRepo;
	
	@Override
	public ConfiguracionTipoFolioTipoLibro save(ConfiguracionTipoFolioTipoLibro obj) {
		// TODO Auto-generated method stub
		return configuracionTipoFolioTipoLibroRepo.save(obj);
	}

	@Override
	public ConfiguracionTipoFolioTipoLibro update(ConfiguracionTipoFolioTipoLibro obj) {
		// TODO Auto-generated method stub
		return configuracionTipoFolioTipoLibroRepo.save(obj);
	}

	@Override
	public List<ConfiguracionTipoFolioTipoLibro> listar() {
		// TODO Auto-generated method stub
		return configuracionTipoFolioTipoLibroRepo.findAll();
	}

	@Override
	public ConfiguracionTipoFolioTipoLibro findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
