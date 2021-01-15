package com.lodigital.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lodigital.model.Usuario;
import com.lodigital.repo.ILoginRepo;
import com.lodigital.service.ILoginService;

@Service
public class LoginServiceImpl implements ILoginService{
	
	@Autowired
	private ILoginRepo loginRepo;

	@Override
	public Usuario verificarNombreUsuario(String usuario) throws Exception {
		Usuario us = null;
		try {
			us = loginRepo.verificarNombreUsuario(usuario);
			us = us != null ? us : new Usuario();
		} catch (Exception e) {
			us = new Usuario();
		}
		return us;
	}

	@Override
	public int cambiarClave(String clave, String nombre) throws Exception {
		int rpta = 0;
		try {
			loginRepo.cambiarClave(clave, nombre);
			rpta = 1;
		} catch (Exception e) {
			rpta = 0;
		}
		return rpta;
	}

	@Override
	public Usuario verificarNombreUsuarioByRut(String rut) throws Exception {
		Usuario us = null;
		try {
			us = loginRepo.verificarNombreUsuarioByRut(rut);
			us = us != null ? us : new Usuario();
		} catch (Exception e) {
			us = new Usuario();
		}
		return us;
	}
}
