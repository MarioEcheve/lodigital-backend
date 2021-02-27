package com.lodigital.dto;

import com.lodigital.model.EstadoUsuarioLibro;
import com.lodigital.model.Libro;
import com.lodigital.model.PerfilUsuarioLibro;
import com.lodigital.model.UsuarioEmpresa;

public class UsuarioLibroDTO {
	private Libro libro;
	private UsuarioEmpresa usuarioEmpresa;
	private PerfilUsuarioLibro perfilUsuarioLibro;
	private EstadoUsuarioLibro estadoUsuarioLibro;
	private String cargo;
	private Boolean mandante;
	
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	public UsuarioEmpresa getUsuarioEmpresa() {
		return usuarioEmpresa;
	}
	public void setUsuarioEmpresa(UsuarioEmpresa usuarioEmpresa) {
		this.usuarioEmpresa = usuarioEmpresa;
	}
	public PerfilUsuarioLibro getPerfilUsuarioLibro() {
		return perfilUsuarioLibro;
	}
	public void setPerfilUsuarioLibro(PerfilUsuarioLibro perfilUsuarioLibro) {
		this.perfilUsuarioLibro = perfilUsuarioLibro;
	}
	public EstadoUsuarioLibro getEstadoUsuarioLibro() {
		return estadoUsuarioLibro;
	}
	public void setEstadoUsuarioLibro(EstadoUsuarioLibro estadoUsuarioLibro) {
		this.estadoUsuarioLibro = estadoUsuarioLibro;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Boolean getMandante() {
		return mandante;
	}
	public void setMandante(Boolean mandante) {
		this.mandante = mandante;
	}
}
