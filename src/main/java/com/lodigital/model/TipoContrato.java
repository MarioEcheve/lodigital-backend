package com.lodigital.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tipo_contrato")
public class TipoContrato {

	@Id
	private Integer id;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@OneToMany(mappedBy = "tipoContrato")
    private Set<Contrato> contrato = new HashSet<>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
