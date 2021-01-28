package com.lodigital.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.lodigital.model.Usuario;

public interface ILoginRepo extends JpaRepository<Usuario, Integer>{
	

	@Query("FROM Usuario us WHERE us.username = :usuario")
	Usuario verificarNombreUsuario(@Param("usuario") String usuario) throws Exception;
	
	@Transactional
	@Modifying
	@Query("UPDATE Usuario us SET us.password = :clave WHERE us.username = :nombre ")
	void cambiarClave(@Param("clave") String clave, @Param("nombre") String nombre) throws Exception;
	
	@Query("FROM Usuario us WHERE us.rut = :rut")
	Usuario verificarNombreUsuarioByRut(@Param("rut") String rut) throws Exception;
}
