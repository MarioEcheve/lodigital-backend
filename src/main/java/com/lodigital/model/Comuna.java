package com.lodigital.model;

import javax.persistence.*;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A Comuna.
 */
@Entity
@Table(name = "comuna")
public class Comuna implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull
    @Column(name = "nombre", nullable = false)
    private String nombre;
	
	@OneToMany(mappedBy = "comuna")
    private Set<Empresa> empresa = new HashSet<>();
	
	@OneToMany(mappedBy = "comuna")
    private Set<Contrato> contrato = new HashSet<>();
	
	@ManyToOne
    @JsonIgnoreProperties(value = "comuna", allowSetters = true)
    private Region region;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
