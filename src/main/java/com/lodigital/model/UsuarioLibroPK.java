package com.lodigital.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Embeddable
public class UsuarioLibroPK implements Serializable{
	
	@ManyToOne
	@JoinColumn(name = "id_libro", nullable = false)
	private Libro libro;
	
	@ManyToOne
    @JsonIgnoreProperties(value = "usuario_empresa", allowSetters = true)
    private UsuarioEmpresa usuarioEmpresa;

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}	
}
