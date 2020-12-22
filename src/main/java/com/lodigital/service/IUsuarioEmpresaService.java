package com.lodigital.service;

import java.util.List;

import com.lodigital.model.UsuarioEmpresa;

public interface IUsuarioEmpresaService {
	List<UsuarioEmpresa> usuariosEmpresasByUser(Integer idUsuario);
}
