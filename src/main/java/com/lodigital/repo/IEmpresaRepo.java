package com.lodigital.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

import com.lodigital.model.Empresa;

public interface IEmpresaRepo extends  JpaRepository<Empresa, Integer>{
	
	Empresa findOneByRut(@PathVariable("rut") String rut);
}
