package com.lodigital.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lodigital.model.Comuna;

public interface IComunaRepo extends JpaRepository<Comuna, Integer>{
	
	@Query("FROM Comuna c WHERE c.region.id = :idRegion")
	List<Comuna> listaComunas(@Param("idRegion") Integer idRegion);
}
