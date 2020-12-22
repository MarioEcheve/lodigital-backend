package com.lodigital.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lodigital.model.UsuarioEmpresa;

public interface IUsuarioEmpresaRepo extends JpaRepository<UsuarioEmpresa, Integer> {
		
	@Query("from UsuarioEmpresa ue where ue.usuario.idUsuario = :idUsuario")
	List<UsuarioEmpresa> usuariosEmpresasByUser(@Param("idUsuario") Integer idUsuario);
}