package com.lodigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lodigital.model.UsuarioLibro;
import com.lodigital.repo.IUsuarioLibroRepo;
import com.lodigital.service.IUsuarioLibroService;

@Service
public class UsuarioLibroServiceImpl implements IUsuarioLibroService{

	@Autowired
	private IUsuarioLibroRepo usuarioLibroRepo;

	@Override
	public UsuarioLibro save(UsuarioLibro obj) {
		// TODO Auto-generated method stub
		return usuarioLibroRepo.save(obj);
	}

	@Override
	public UsuarioLibro update(UsuarioLibro obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsuarioLibro> listar() {
		// TODO Auto-generated method stub
		return usuarioLibroRepo.findAll();
	}

	@Override
	public UsuarioLibro findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<UsuarioLibro> buscarUsuarioLibrosByLibro(Integer idLibro) {
		// TODO Auto-generated method stub
		return usuarioLibroRepo.buscarUsuarioLibrosByLibro(idLibro);
	}

	@Override
	public Integer guarda(Integer idEmpresa, Integer idUsuario, Integer idRol, Integer idLibro, String cargo,
			Integer idPerfilUsuarioLibro, Integer idEstadoUsuarioLibro) {
		// TODO Auto-generated method stub
		return usuarioLibroRepo.registrar(idEmpresa, idUsuario, idRol, idLibro, cargo, idPerfilUsuarioLibro, idEstadoUsuarioLibro);
	}

	@Override
	public Integer actualizar(Integer idEmpresa, Integer idUsuario, Integer idRol, Integer idLibro, String cargo,
			Integer idPerfilUsuarioLibro, Integer idEstadoUsuarioLibro) {
		// TODO Auto-generated method stub
		return usuarioLibroRepo.actualizar(idEmpresa, idUsuario, idRol, idLibro, cargo, idPerfilUsuarioLibro, idEstadoUsuarioLibro);
	}
}
