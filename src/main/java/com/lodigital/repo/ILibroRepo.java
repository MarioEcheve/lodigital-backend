package com.lodigital.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lodigital.model.Libro;

public interface ILibroRepo extends JpaRepository<Libro, Integer>{
	
	@Query("from Libro l where l.contrato.id= :idContrato")
	List<Libro> libroByContrato(@Param("idContrato") Integer idContrato);
	
	@Query(value = "select * from libro l inner join usuario_libro ul on ul.id_libro = l.id_libro where usuario_empresa_id_usuario = :idUsuario ", nativeQuery=true)
	List<Libro> libroByUsuarioLibro(@Param("idUsuario") Integer idUsuario);
}
