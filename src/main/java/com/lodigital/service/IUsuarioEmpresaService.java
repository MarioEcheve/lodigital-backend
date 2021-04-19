package com.lodigital.service;

import java.time.Instant;
import java.util.List;

import com.lodigital.model.UsuarioEmpresa;

public interface IUsuarioEmpresaService extends ICRUD<UsuarioEmpresa> {
	List<UsuarioEmpresa> usuariosEmpresasByUser(Integer idUsuario);
	List<UsuarioEmpresa> usuariosEmpresasByCompany(Integer idEmpresa);
	Integer guarda(Integer idEmpresa,Integer idUsuario, Integer idRol, Instant fechaCreacion, Integer idEstadoUsuario);
	Integer update(Integer idEmpresa, Integer idUsuario, Instant fechaActivacion, Integer idEstadoUsuario);
	List<UsuarioEmpresa> usuariosEmpresasByCompanyAndUser(Integer idEmpresa,Integer idUsuario);
	Integer editar(Integer idEmpresa, Integer idUsuario, Integer idRol);
	
}
