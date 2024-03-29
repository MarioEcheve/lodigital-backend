package com.lodigital.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="usuario_libro")
@IdClass(UsuarioLibroPK.class)
public class UsuarioLibro {
	
	@Id
	private Libro libro; 
	
	@Id
	private UsuarioEmpresa usuarioEmpresa;
	
	@ManyToOne
    @JsonIgnoreProperties(value = "usuario_libro", allowSetters = true)
    private PerfilUsuarioLibro perfilUsuarioLibro;
	
	@ManyToOne
    @JsonIgnoreProperties(value = "usuario_libro", allowSetters = true)
    private EstadoUsuarioLibro estadoUsuarioLibro;

	@Column(name="cargo")
	private String cargo;
	
	@Column(name="nombre")
	private String nombre;

	public String getNombre() { 
		return nombre;
	} 

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public UsuarioEmpresa getUsuarioEmpresa() {
		return usuarioEmpresa;
	}

	public void setUsuarioEmpresa(UsuarioEmpresa usuarioEmpresa) {
		this.usuarioEmpresa = usuarioEmpresa;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	
	
}	
