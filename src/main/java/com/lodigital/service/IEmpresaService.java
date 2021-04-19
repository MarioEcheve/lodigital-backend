package com.lodigital.service;


import com.lodigital.model.Empresa;
import com.lodigital.model.Usuario;

public interface IEmpresaService extends ICRUD<Empresa>{
	 Usuario buscarPorRut(String rut);
	 Empresa empresaByRutEmpresa(String rut);
}
