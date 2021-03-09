package com.lodigital.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lodigital.model.Folio;

public interface IFolioRepo extends JpaRepository<Folio, Integer>{

	@Query("from Folio f where f.libro.idLibro = :idLibro")
	List<Folio> folioByLibro(@Param("idLibro") Integer idLibro);
}
