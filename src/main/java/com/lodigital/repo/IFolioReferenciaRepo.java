package com.lodigital.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.lodigital.model.FolioReferencia;

public interface IFolioReferenciaRepo extends JpaRepository<FolioReferencia, Integer>{
	
	@Transactional
	@Query(value="select * from folio_referencia where id_folio_origen = :idFolio", nativeQuery = true)
	List<FolioReferencia> buscaFolioReferenciaByFolioOrigen(@Param("idFolio") Integer idFolio);
}
