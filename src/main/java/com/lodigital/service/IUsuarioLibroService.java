package com.lodigital.service;

import java.util.List;

import com.lodigital.model.UsuarioLibro;

public interface IUsuarioLibroService extends ICRUD<UsuarioLibro>{
	List<UsuarioLibro> buscarUsuarioLibrosByLibro(Integer idLibro);
	Integer guarda(Integer idEmpresa,Integer idUsuario, Integer idRol, Integer idLibro, String cargo, Integer idPerfilUsuarioLibro ,Integer idEstadoUsuarioLibro);
	Integer actualizar(Integer idEmpresa,Integer idUsuario, Integer idRol, Integer idLibro, String cargo, Integer idPerfilUsuarioLibro ,Integer idEstadoUsuarioLibro);

}
