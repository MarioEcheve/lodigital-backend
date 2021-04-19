package com.lodigital.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.Instant;

@Entity
@Table(name = "empresa")
public class Empresa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEmpresa;

	@NotNull
	@Size(max = 15)
	@Column(name = "rut", length = 15, nullable = false)
	private String rut;

	@NotNull
	@Size(max = 200)
	@Column(name = "razon_social", length = 200, nullable = false)
	private String razonSocial;
	
	@Size(max = 200)
	@Column(name = "nombre_fantasia", length = 200)
	private String nombreFantasia;

	@Size(max = 200)
	@Column(name = "direccion", length = 200)
	private String direccion;
	
	@Size(max = 200)
	@Column(name = "giro_principal", length = 200)
	private String giroPrincipal;

	@Size(max = 200)
	@Column(name = "nombre_contacto_comercial", length = 200)
	private String nombreContactoComercial;
	
	@Size(max = 200)
	@Column(name = "cargo_funcion_contacto_comercial", length = 200)
	private String cargoFuncionContactoComercial;
	
	@Size(max = 200)
	@Column(name = "email_contacto_comercial", length = 200)
	private String emailContactoComercial;
	
	@Size(max = 11)
	@Column(name = "telefono_principal_contacto_comercial", length = 11)
	private String telefonoPrincipalContactoComercial;
	
	@Size(max = 11)
	@Column(name = "telefono_secundario_contacto_comercial", length = 11)
	private String telefonoSecundarioContactoComercial;

	
	@Size(max = 200)
	@Column(name = "nombre_contacto_tecnico", length = 200)
	private String nombreContactoTecnico;
	
	@Size(max = 200)
	@Column(name = "cargo_funcion_contacto_tecnico", length = 200)
	private String cargoFuncionContactoTecnico;
	
	@Size(max = 200)
	@Column(name = "email_contacto_tecnico", length = 200)
	private String emailContactoTecnico;
	
	@Size(max = 11)
	@Column(name = "telefono_principal_contacto_tecnico", length = 11)
	private String telefonoPrincipalContactoTecnico;
	
	@Size(max = 11)
	@Column(name = "telefono_secundario_contacto_tecnico", length = 11)
	private String telefonoSecundarioContactoTecnico;
	
	@Column(name = "fecha_creacion")
	private Instant fechaCreacion;

	@Column(name = "fecha_modificacion")
	private Instant fechaModificacion;

	@ManyToOne
    @JsonIgnoreProperties(value = "empresa", allowSetters = true)
    private Region region;
	
	@ManyToOne
    @JsonIgnoreProperties(value = "empresa", allowSetters = true)
    private Comuna comuna;
	
	public Integer getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Instant getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Instant fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Instant getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Instant fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getNombreFantasia() {
		return nombreFantasia;
	}

	public void setNombreFantasia(String nombreFantasia) {
		this.nombreFantasia = nombreFantasia;
	}

	public String getGiroPrincipal() {
		return giroPrincipal;
	}

	public void setGiroPrincipal(String giroPrincipal) {
		this.giroPrincipal = giroPrincipal;
	}

	public String getNombreContactoComercial() {
		return nombreContactoComercial;
	}

	public void setNombreContactoComercial(String nombreContactoComercial) {
		this.nombreContactoComercial = nombreContactoComercial;
	}

	public String getCargoFuncionContactoComercial() {
		return cargoFuncionContactoComercial;
	}

	public void setCargoFuncionContactoComercial(String cargoFuncionContactoComercial) {
		this.cargoFuncionContactoComercial = cargoFuncionContactoComercial;
	}

	public String getEmailContactoComercial() {
		return emailContactoComercial;
	}

	public void setEmailContactoComercial(String emailContactoComercial) {
		this.emailContactoComercial = emailContactoComercial;
	}

	public String getTelefonoPrincipalContactoComercial() {
		return telefonoPrincipalContactoComercial;
	}

	public void setTelefonoPrincipalContactoComercial(String telefonoPrincipalContactoComercial) {
		this.telefonoPrincipalContactoComercial = telefonoPrincipalContactoComercial;
	}

	public String getTelefonoSecundarioContactoComercial() {
		return telefonoSecundarioContactoComercial;
	}

	public void setTelefonoSecundarioContactoComercial(String telefonoSecundarioContactoComercial) {
		this.telefonoSecundarioContactoComercial = telefonoSecundarioContactoComercial;
	}

	public String getNombreContactoTecnico() {
		return nombreContactoTecnico;
	}

	public void setNombreContactoTecnico(String nombreContactoTecnico) {
		this.nombreContactoTecnico = nombreContactoTecnico;
	}

	public String getCargoFuncionContactoTecnico() {
		return cargoFuncionContactoTecnico;
	}

	public void setCargoFuncionContactoTecnico(String cargoFuncionContactoTecnico) {
		this.cargoFuncionContactoTecnico = cargoFuncionContactoTecnico;
	}

	public String getEmailContactoTecnico() {
		return emailContactoTecnico;
	}

	public void setEmailContactoTecnico(String emailContactoTecnico) {
		this.emailContactoTecnico = emailContactoTecnico;
	}

	public String getTelefonoPrincipalContactoTecnico() {
		return telefonoPrincipalContactoTecnico;
	}

	public void setTelefonoPrincipalContactoTecnico(String telefonoPrincipalContactoTecnico) {
		this.telefonoPrincipalContactoTecnico = telefonoPrincipalContactoTecnico;
	}

	public String getTelefonoSecundarioContactoTecnico() {
		return telefonoSecundarioContactoTecnico;
	}

	public void setTelefonoSecundarioContactoTecnico(String telefonoSecundarioContactoTecnico) {
		this.telefonoSecundarioContactoTecnico = telefonoSecundarioContactoTecnico;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public Comuna getComuna() {
		return comuna;
	}

	public void setComuna(Comuna comuna) {
		this.comuna = comuna;
	}
}
