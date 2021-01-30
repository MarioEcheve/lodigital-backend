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
		
	@Query("from UsuarioEmpresa ue where ue.usuario.idUsuario = :idUsuario and ue.estadoUsuario.idEstadoUsuario = 1")
	List<UsuarioEmpresa> usuariosEmpresasByUser(@Param("idUsuario") Integer idUsuario);
	
	
	@Query("from UsuarioEmpresa ue where ue.empresa.idEmpresa = :idEmpresa")
	List<UsuarioEmpresa> usuariosEmpresasByCompany(@Param("idEmpresa") Integer idEmpresa);
	
	@Transactional
	@Modifying
	@Query(value = "INSERT INTO usuario_empresa(id_empresa,id_usuario,id_rol,fecha_creacion,id_estado_usuario) VALUES (:idEmpresa, :idUsuario, :idRol, :fechaCreacion, :idEstadoUsuario )", nativeQuery = true)
	Integer registrar(@Param("idEmpresa") Integer idEmpresa, @Param("idUsuario") Integer idUsuario, 
					  @Param("idRol") Integer idRol,@Param("fechaCreacion") Instant fechaCreacion, @Param("idEstadoUsuario") Integer idEstadoUsuario);
	
	@Query("from UsuarioEmpresa ue where ue.usuario.idUsuario = :idUsuario and ue.empresa.idEmpresa = :idEmpresa")
	List<UsuarioEmpresa> usuariosEmpresasByCompanyAndUser(@Param("idEmpresa") Integer idUsuario,@Param("idUsuario") Integer idEmpresa);
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE usuario_empresa SET id_estado_usuario = :idEstadoUsuario, fecha_activacion= :fechaActivacion WHERE id_empresa= :idEmpresa and id_usuario= :idUsuario", nativeQuery = true)
	Integer actualizar(@Param("idEmpresa") Integer idEmpresa, @Param("idUsuario") Integer idUsuario,
					   @Param("fechaActivacion") Instant fechaActivacion,@Param("idEstadoUsuario") Integer idEstadoUsuario );
	
}
