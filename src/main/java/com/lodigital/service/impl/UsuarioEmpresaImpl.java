package com.lodigital.service.impl;

import java.time.Instant;
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
	
	@Override
	public List<UsuarioEmpresa> usuariosEmpresasByCompany(Integer idEmpresa) {
		// TODO Auto-generated method stub
		return usuarioEmpresaRepo.usuariosEmpresasByCompany(idEmpresa);
	}

	@Override
	public UsuarioEmpresa save(UsuarioEmpresa obj) {
		// TODO Auto-generated method stub
		return usuarioEmpresaRepo.save(obj);
	}

	@Override
	public UsuarioEmpresa update(UsuarioEmpresa obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsuarioEmpresa> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuarioEmpresa findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Integer guarda(Integer idEmpresa, Integer idUsuario, Integer idRol, Instant fechaCreacion, Integer idEstadoUsuario) {
		// TODO Auto-generated method stub
		return usuarioEmpresaRepo.registrar(idEmpresa, idUsuario, idRol, fechaCreacion, idEstadoUsuario);
	}

	@Override
	public List<UsuarioEmpresa> usuariosEmpresasByCompanyAndUser(Integer idEmpresa, Integer idUsuario) {
		// TODO Auto-generated method stub
		return usuarioEmpresaRepo.usuariosEmpresasByCompanyAndUser(idEmpresa,idUsuario);
	}

	@Override
	public Integer update(Integer idEmpresa, Integer idUsuario, Instant fechaActivacion, Integer idEstadoUsuario) {
		// TODO Auto-generated method stub
		return usuarioEmpresaRepo.actualizar(idEmpresa, idUsuario, fechaActivacion,idEstadoUsuario);
	}

	@Override
	public Integer editar(Integer idEmpresa, Integer idUsuario,Integer idRol) {
		// TODO Auto-generated method stub
		return usuarioEmpresaRepo.editar(idEmpresa, idUsuario, idRol);
	}
	
	
}
