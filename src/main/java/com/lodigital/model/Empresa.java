package com.lodigital.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.Instant;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

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
	@Size(max = 100)
	@Column(name = "nombre", length = 100, nullable = false)
	private String nombre;

	@Size(max = 100)
	@Column(name = "direccion", length = 100)
	private String direccion;

	@Column(name = "fecha_creacion")
	private Instant fechaCreacion;

	@Column(name = "fecha_modificacion")
	private Instant fechaModificacion;
	
	
	@OneToMany(mappedBy = "empresa")
    private Set<Dependencia> dependencias = new HashSet<>();

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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
}
