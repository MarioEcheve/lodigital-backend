package com.lodigital.dto;

public class ReestablecerPasswordDTO {

	private String rut;
	private String correo;
	private String claveProvisoria;
	private String claveNueva;
	private String clave;
	private String token;
	
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getClaveProvisoria() {
		return claveProvisoria;
	}
	public void setClaveProvisoria(String claveProvisoria) {
		this.claveProvisoria = claveProvisoria;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getClaveNueva() {
		return claveNueva;
	}
	public void setClaveNueva(String claveNueva) {
		this.claveNueva = claveNueva;
	}
}
