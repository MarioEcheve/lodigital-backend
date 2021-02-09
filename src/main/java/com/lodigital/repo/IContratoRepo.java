package com.lodigital.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lodigital.model.Contrato;
import java.util.List;

public interface IContratoRepo extends JpaRepository<Contrato, Integer>{

	@Query("from Contrato c where c.idEmpresaMandante= :idEmpresa or c.idEmpresaContratista= :idEmpresa order by 1 desc")
	List<Contrato> contratoByCompany(@Param("idEmpresa") Integer idEmpresa);
}
