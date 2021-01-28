package com.lodigital.service;

import com.lodigital.model.Usuario;

public interface ILoginService {
	Usuario verificarNombreUsuario(String usuario) throws Exception;
	Usuario verificarNombreUsuarioByRut(String rut) throws Exception;
	int cambiarClave(String clave, String nombre) throws Exception;
	String generarClave() throws Exception;
}
