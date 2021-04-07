package com.lodigital.service;

import java.util.List;
import java.util.Map;

import com.lodigital.dto.GenerarCodigoVerificacionDTO;
import com.lodigital.dto.GenerarCodigoVerificacionDTO;
import com.lodigital.model.Folio;

public interface IFolioService extends ICRUD<Folio>{
	
	List<Folio> folioByLibro(Integer idLibro);
	List<Map<String, String>> correlativoFolio(Integer idLibro);
	String generarCodigoVerificacion(GenerarCodigoVerificacionDTO generarCodigoVerificacionDTO);
}
