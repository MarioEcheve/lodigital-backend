package com.lodigital.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.User;

import com.lodigital.dto.UsuarioDTO;
import com.lodigital.model.Contrato;
import com.lodigital.model.Usuario;
import com.lodigital.repo.IUsuarioRepo;
import com.lodigital.service.IUsuarioService;

@Service
public class UsuarioServiceImpl implements UserDetailsService,IUsuarioService{
	@Autowired
	private IUsuarioRepo usuarioRepo;
	
	@Autowired
	private BCryptPasswordEncoder bcrypt;
	
	
	// se implementa de esta forma el loadbyusername ya que no se puede modificr el nombre
	@Override
	public UserDetails loadUserByUsername(String rut) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepo.findByRut(rut);
		
		System.out.print(usuario);
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
		return usuarioRepo.save(obj);
	}
	@Override
	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Usuario findById(Integer id) {
		Optional<Usuario> cn = usuarioRepo.findById(id);
		return cn.isPresent() ? cn.get() : new Usuario();
	}
	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Usuario usuariosByRut(String rut) {
		// TODO Auto-generated method stub
		return usuarioRepo.findByRut(rut);
	}
	@Override
	public int cambiarClaveUsuario(String clave, String rut) {
		int rpta = 0;
		try {
			usuarioRepo.cambiarClaveUsuario(clave, rut);
			rpta = 1;
		} catch (Exception e) {
			rpta = 0;
		}
		return rpta;
	}
	@Override
	public int updateUsuario(UsuarioDTO usuarioDto) {
		int rpta = 0;
		try {
			 usuarioRepo.updateUsuario(usuarioDto.getEmailPrincipal(), usuarioDto.getEmailSecundario(), usuarioDto.getTelefonoPrincipal(), usuarioDto.getTelefonoSecundario(),usuarioDto.getProfesionOficio(), usuarioDto.getRut());
			 rpta = 1;
			 return rpta;
		}catch (Exception e) {
			rpta = 0;
			return rpta;
		}
		
	}
	
}
