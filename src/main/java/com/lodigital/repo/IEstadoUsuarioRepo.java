package com.lodigital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lodigital.model.EstadoUsuario;

public interface IEstadoUsuarioRepo extends JpaRepository<EstadoUsuario, Integer>{

}
