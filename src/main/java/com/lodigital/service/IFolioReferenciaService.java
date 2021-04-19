package com.lodigital.service;

import java.util.List;

import com.lodigital.model.FolioReferencia;

public interface IFolioReferenciaService extends ICRUD<FolioReferencia>{
	List<FolioReferencia> buscaFolioReferenciaByFolioOrigen(Integer idFolio);
}
