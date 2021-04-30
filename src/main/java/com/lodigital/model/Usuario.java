package com.lodigital.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idUsuario;
	
	@Column(name = "rut", nullable = false, unique = true)
	private String rut;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido_paterno")
	private String apellidoPaterno;
	
	@Column(name = "apellido_materno")
	private String apellidoMaterno;
	
	@Column(name = "profesion_Oficio")
	private String profesionOficio;
	
	@Column(name = "email_principal")
	private String emailPrincipal;
	
	@Column(name = "email_secundario")
	private String emailSecundario;
	
	@Column(name = "telefono_principal")
	private String telefonoPrincipal;
	
	@Column(name = "telefono_secundario")
	private String telefonoSecundario;
	
	@Column(name = "fecha_creacion")
	private Date fechaCreacion;
	
	@Column(name = "fecha_modificacion")
	private Date fechaModificacion;
	
	@Column(name = "username", nullable = false, unique = true)
	private String username;
	
	@Column(name = "clave")
	private String password;
	
	@Column(name = "clave_provisoria")
	private String passwordProvisorio;
	
	@Column(name = "estado", nullable = false)
	private boolean enabled;
	
	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

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

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getPasswordProvisorio() {
		return passwordProvisorio;
	}

	public void setPasswordProvisorio(String passwordProvisorio) {
		this.passwordProvisorio = passwordProvisorio;
	}
}
