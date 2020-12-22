package com.lodigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lodigital.model.UsuarioEmpresa;
import com.lodigital.repo.IUsuarioEmpresaRepo;
import com.lodigital.service.IUsuarioEmpresaService;

@Service
public class UsuarioEmpresaImpl implements IUsuarioEmpresaService{

	@Autowired
	private IUsuarioEmpresaRepo usuarioEmpresaRepo;
	
	@Override
	public List<UsuarioEmpresa> usuariosEmpresasByUser(Integer idUsuario) {
		// TODO Auto-generated method stub
		return usuarioEmpresaRepo.usuariosEmpresasByUser(idUsuario);
	}
	
	
}
