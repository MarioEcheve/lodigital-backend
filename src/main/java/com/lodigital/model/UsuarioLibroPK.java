package com.lodigital.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class UsuarioLibroPK implements Serializable{
	
	@ManyToOne
	@JoinColumn(name = "id_libro", nullable = false)
	private Libro libro;

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	
	
}
