package com.lodigital.service;

import java.time.Instant;
import java.util.List;

import com.lodigital.model.UsuarioEmpresa;

public interface IUsuarioEmpresaService extends ICRUD<UsuarioEmpresa> {
	List<UsuarioEmpresa> usuariosEmpresasByUser(Integer idUsuario);
	List<UsuarioEmpresa> usuariosEmpresasByCompany(Integer idEmpresa);
	Integer guarda(Integer idEmpresa,Integer idRol, Integer idUsuario, Instant fechaCreacion, Boolean enabled);
	List<UsuarioEmpresa> usuariosEmpresasByCompanyAndUser(Integer idEmpresa,Integer idUsuario);
	
}
