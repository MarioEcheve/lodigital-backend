package com.lodigital.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lodigital.model.Empresa;

public interface IEmpresaRepo extends  JpaRepository<Empresa, Integer>{

}
