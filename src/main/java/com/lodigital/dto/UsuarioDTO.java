package com.lodigital.dto;

public class UsuarioDTO {
	
	private String rut;
	private String profesionOficio;
	private String emailPrincipal;
	private String emailSecundario;
	private String telefonoPrincipal;
	private String telefonoSecundario;
	
	public String getProfesionOficio() {
		return profesionOficio;
	}
	public void setProfesionOficio(String profesionOficio) {
		this.profesionOficio = profesionOficio;
	}
	public String getEmailPrincipal() {
		return emailPrincipal;
	}
	public void setEmailPrincipal(String emailPrincipal) {
		this.emailPrincipal = emailPrincipal;
	}
	public String getEmailSecundario() {
		return emailSecundario;
	}
	public void setEmailSecundario(String emailSecundario) {
		this.emailSecundario = emailSecundario;
	}
	public String getTelefonoPrincipal() {
		return telefonoPrincipal;
	}
	public void setTelefonoPrincipal(String telefonoPrincipal) {
		this.telefonoPrincipal = telefonoPrincipal;
	}
	public String getTelefonoSecundario() {
		return telefonoSecundario;
	}
	public void setTelefonoSecundario(String telefonoSecundario) {
		this.telefonoSecundario = telefonoSecundario;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
}
