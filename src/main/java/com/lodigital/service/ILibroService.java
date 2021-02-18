package com.lodigital.service;

import java.util.List;

import com.lodigital.model.Libro;

public interface ILibroService extends ICRUD<Libro>{
	List<Libro>libroByContrato(Integer idContrato);
}
