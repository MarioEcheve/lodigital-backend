package com.lodigital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lodigital.model.TipoLibro;

public interface ITipoLibroRepo extends JpaRepository<TipoLibro, Integer>{

}
