package com.lodigital.service;

import com.lodigital.model.Usuario;

public interface ILoginService {
	Usuario verificarNombreUsuario(String usuario) throws Exception;
	int cambiarClave(String clave, String nombre) throws Exception;
}
