package com.lodigital.service;

import java.util.List;

import com.lodigital.model.Folio;

public interface IFolioService extends ICRUD<Folio>{
	
	List<Folio> folioByLibro(Integer idLibro);
}
