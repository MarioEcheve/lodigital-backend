package com.lodigital.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.lodigital.model.Folio;

public interface IFolioRepo extends JpaRepository<Folio, Integer>{
	@Transactional
	@Query("from Folio f where f.libro.idLibro = :idLibro")
	List<Folio> folioByLibro(@Param("idLibro") Integer idLibro);
	
	@Query( value = "select count(libro_id_libro) + 1 as correlativo from folio where id_usuario_firma  notnull and libro_id_libro = :idLibro" ,nativeQuery = true)
    List<Map<String, String>> correlativoFolio(@Param("idLibro") Integer idLibro);
}
