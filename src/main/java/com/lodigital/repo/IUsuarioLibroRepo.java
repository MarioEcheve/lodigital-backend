package com.lodigital.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lodigital.model.UsuarioLibro;

public interface IUsuarioLibroRepo extends JpaRepository<UsuarioLibro, Integer>{

	@Query("FROM UsuarioLibro ul WHERE ul.libro.idLibro = :idLibro")
	List<UsuarioLibro> buscarUsuarioLibrosByLibro(@Param("idLibro") Integer idLibro);
	
	@Transactional
	@Modifying
	@Query(value = "INSERT INTO usuario_libro(usuario_empresa_id_empresa,usuario_empresa_id_usuario,usuario_empresa_id_rol,id_libro,cargo,perfil_usuario_libro_id,estado_usuario_libro_id"
			+ ") VALUES (:idEmpresa, :idUsuario, :idRol, :idLibro, :cargo, :idPerfilUsuarioLibro,:idEstadoUsuarioLibro  )", nativeQuery = true)
	Integer registrar(@Param("idEmpresa") Integer idEmpresa, @Param("idUsuario") Integer idUsuario, 
					  @Param("idRol") Integer idRol,@Param("idLibro") Integer idLibro, 
					  @Param("cargo") String cargo, @Param("idPerfilUsuarioLibro") Integer idPerfilUsuarioLibro,
					  @Param("idEstadoUsuarioLibro") Integer idEstadoUsuarioLibro);
	
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE usuario_libro SET estado_usuario_libro_id= :idEstadoUsuarioLibro, "
			+ "perfil_usuario_libro_id= :idPerfilUsuarioLibro, "
			+ "cargo= :cargo "
			+ "WHERE usuario_empresa_id_empresa = :idEmpresa "
			+ "AND usuario_empresa_id_usuario = :idUsuario "
			+ "AND id_libro = :idLibro "
			+ "AND usuario_empresa_id_rol = :idRol", nativeQuery = true)
	Integer actualizar(@Param("idEmpresa") Integer idEmpresa, @Param("idUsuario") Integer idUsuario, 
					   @Param("idRol") Integer idRol,@Param("idLibro") Integer idLibro, 
					   @Param("cargo") String cargo, @Param("idPerfilUsuarioLibro") Integer idPerfilUsuarioLibro,
					   @Param("idEstadoUsuarioLibro") Integer idEstadoUsuarioLibro);
	
	
	@Query("FROM UsuarioLibro ul WHERE ul.usuarioEmpresa.usuario.idUsuario = :idUsuario and ul.libro.idLibro = :idLibro")
	UsuarioLibro buscarUsuarioLibrosByLibroAndUsuario(@Param("idLibro") Integer idLibro, @Param("idUsuario") Integer idUsuario);
	
	@Query("FROM UsuarioLibro ul WHERE ul.usuarioEmpresa.usuario.idUsuario = :idUsuario and ul.libro.contrato.id = :idContrato")
	List<UsuarioLibro> buscarUsuarioLibrosByUsuario(@Param("idUsuario") Integer idUsuario, @Param("idContrato") Integer idContrato);
	
	@Query("FROM UsuarioLibro ul WHERE ul.usuarioEmpresa.usuario.idUsuario = :idUsuario and ul.usuarioEmpresa.empresa.idEmpresa= :idEmpresa  and ul.estadoUsuarioLibro = 1")
	List<UsuarioLibro> buscarMisLibros(@Param("idUsuario") Integer idUsuario,@Param("idEmpresa") Integer idEmpresa);
	
	
}
