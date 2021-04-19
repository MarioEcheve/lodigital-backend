package com.lodigital.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "usuario_empresa")
@IdClass(UsuarioEmpresaPK.class)
public class UsuarioEmpresa {
	
	@Id
	private Usuario usuario;
	
	@Id
	private Empresa empresa;
	
	@ManyToOne
    @JsonIgnoreProperties(value = "usuario_empresa", allowSetters = true)
	private Rol rol;

	@ManyToOne
    @JsonIgnoreProperties(value = "usuario_empresa", allowSetters = true)
    private EstadoUsuario estadoUsuario;
	
	@Column(name = "fecha_creacion")
	private Instant fechaCreacion; 
	
	@Column(name = "fecha_activacion")
	private Instant fechaActivacion;
	
	@Column(name = "fecha_desactivacion")
	private Instant fechaDesactivacion;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Instant getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Instant fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Instant getFechaActivacion() {
		return fechaActivacion;
	}

	public void setFechaActivacion(Instant fechaActivacion) {
		this.fechaActivacion = fechaActivacion;
	}

	public Instant getFechaDesactivacion() {
		return fechaDesactivacion;
	}

	public void setFechaDesactivacion(Instant fechaDesactivacion) {
		this.fechaDesactivacion = fechaDesactivacion;
	}

	public EstadoUsuario getEstadoUsuario() {
		return estadoUsuario;
	}

	public void setEstadoUsuario(EstadoUsuario estadoUsuario) {
		this.estadoUsuario = estadoUsuario;
	}
}
