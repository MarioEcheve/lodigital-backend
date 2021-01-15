package com.lodigital.dto;

import java.time.Instant;
import com.lodigital.model.Empresa;
import com.lodigital.model.Rol;
import com.lodigital.model.Usuario;

public class UsuarioEmpresaDTO {
	
	private Usuario usuario;
	private Empresa empresa;
	private Rol rol;
	private Boolean enabled;
	private Instant fechaCreacion;
	private Instant fechaActivacion;
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
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
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
}
