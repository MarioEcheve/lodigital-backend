package com.lodigital.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

import com.lodigital.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer>{
	
	//select * from usuario where username = ?
	Usuario findOneByRut(String rut);
	
	@Query(name="select u from u u where UPPER(u.rut) = UPPER(:rut)", nativeQuery=true)
	Usuario findByRut(@PathVariable("rut") String rut);
}
