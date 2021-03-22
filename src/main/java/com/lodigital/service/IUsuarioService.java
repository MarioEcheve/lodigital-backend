package com.lodigital.service;

import com.lodigital.dto.UsuarioDTO;
import com.lodigital.model.Usuario;

public interface IUsuarioService extends ICRUD<Usuario>{
	Usuario usuariosByRut(String rut);
	int cambiarClaveUsuario(String clave, String rut) throws Exception;
	int updateUsuario(UsuarioDTO usuarioDto);
}
