package com.lodigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lodigital.model.FolioReferencia;
import com.lodigital.repo.IFolioReferenciaRepo;
import com.lodigital.service.IFolioReferenciaService;

@Service
public class FolioReferenciaServiceImpl implements IFolioReferenciaService{
	
	@Autowired
	private IFolioReferenciaRepo folioReferenciaRepo;
	
	@Override
	public FolioReferencia save(FolioReferencia obj) {
		// TODO Auto-generated method stub
		return folioReferenciaRepo.save(obj);
	}

	@Override
	public FolioReferencia update(FolioReferencia obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FolioReferencia> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FolioReferencia findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Integer id) {
		folioReferenciaRepo.deleteById(id);
		return true;
	}

	@Override
	public List<FolioReferencia> buscaFolioReferenciaByFolioOrigen(Integer idFolio) {
		// TODO Auto-generated method stub
		return folioReferenciaRepo.buscaFolioReferenciaByFolioOrigen(idFolio);
	}

}
