package com.lodigital.service;

import java.util.List;

import com.lodigital.model.Empresa;
import com.lodigital.model.Usuario;

public interface IEmpresaService extends ICRUD<Empresa>{
	 Usuario buscarPorRut(String rut);
}
