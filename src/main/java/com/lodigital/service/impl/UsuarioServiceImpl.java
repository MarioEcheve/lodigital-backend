package com.lodigital.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.User;
import com.lodigital.model.Usuario;
import com.lodigital.repo.IUsuarioRepo;
import com.lodigital.service.IUsuarioService;

@Service
public class UsuarioServiceImpl implements UserDetailsService,IUsuarioService{
	@Autowired
	private IUsuarioRepo usuarioRepo;
	
	// se implementa de esta forma el loadbyusername ya que no se puede modificr el nombre
	@Override
	public UserDetails loadUserByUsername(String rut) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepo.findOneByRut(rut);
		
		if(usuario == null) {
			throw new UsernameNotFoundException(String.format("Usuario no existe", rut));
		}
		
		List<GrantedAuthority> roles = new ArrayList<>();
		
		
		
		UserDetails ud = new User(usuario.getUsername(), usuario.getPassword(), roles);
		return ud;
	}
	public Usuario buscarPorRut(String rut) {
		Usuario usuario = usuarioRepo.findOneByRut(rut);
		return usuario;
	}
	@Override
	public Usuario save(Usuario obj) {
		// TODO Auto-generated method stub
		return usuarioRepo.save(obj);
	}
	@Override
	public Usuario update(Usuario obj) {
		// TODO Auto-generated method stub
		return usuarioRepo.save(obj);
	}
	@Override
	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Usuario findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
