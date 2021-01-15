package com.lodigital.repo;

import java.time.Instant;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.*;
import com.lodigital.model.UsuarioEmpresa;

public interface IUsuarioEmpresaRepo extends JpaRepository<UsuarioEmpresa, Integer> {
		
	@Query("from UsuarioEmpresa ue where ue.usuario.idUsuario = :idUsuario and ue.enabled = true")
	List<UsuarioEmpresa> usuariosEmpresasByUser(@Param("idUsuario") Integer idUsuario);
	
	
	@Query("from UsuarioEmpresa ue where ue.empresa.idEmpresa = :idEmpresa")
	List<UsuarioEmpresa> usuariosEmpresasByCompany(@Param("idEmpresa") Integer idEmpresa);
	
	@Transactional
	@Modifying
	@Query(value = "INSERT INTO usuario_empresa(id_empresa,id_usuario,id_rol,fecha_creacion,enabled) VALUES (:idEmpresa, :idUsuario, :idRol, :fechaCreacion, :enabled)", nativeQuery = true)
	Integer registrar(@Param("idEmpresa") Integer idEmpresa, @Param("idUsuario") Integer idUsuario, 
					  @Param("idRol") Integer idRol,@Param("fechaCreacion") Instant fechaCreacion,@Param("enabled") Boolean enabled);
	
	@Query("from UsuarioEmpresa ue where ue.usuario.idUsuario = :idUsuario and ue.empresa.idEmpresa = :idEmpresa")
	List<UsuarioEmpresa> usuariosEmpresasByCompanyAndUser(@Param("idEmpresa") Integer idUsuario,@Param("idUsuario") Integer idEmpresa);
	
}
