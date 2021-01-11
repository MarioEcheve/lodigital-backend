package com.lodigital.service;

import java.util.List;

import com.lodigital.model.UsuarioEmpresa;

public interface IUsuarioEmpresaService extends ICRUD<UsuarioEmpresa> {
	List<UsuarioEmpresa> usuariosEmpresasByUser(Integer idUsuario);
	List<UsuarioEmpresa> usuariosEmpresasByCompany(Integer idEmpresa);
}
