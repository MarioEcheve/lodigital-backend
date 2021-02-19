package com.lodigital.service;

import java.util.List;

import com.lodigital.model.Contrato;

public interface IContratoService extends ICRUD<Contrato>{
	List<Contrato> contratoByCompany(Integer idEmpresa);
}
