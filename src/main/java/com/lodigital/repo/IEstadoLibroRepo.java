package com.lodigital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lodigital.model.EstadoLibro;

public interface IEstadoLibroRepo extends JpaRepository<EstadoLibro, Integer>{

}
