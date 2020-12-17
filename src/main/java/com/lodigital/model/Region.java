package com.lodigital.model;


import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "region")
public class Region implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull
    @Column(name = "nombre", nullable = false)
    private String nombre;
	
	@OneToMany(mappedBy = "region")
	private Set<Dependencia> dependencias = new HashSet<>();
	
	@OneToMany(mappedBy = "region")
    private Set<Comuna> comunas = new HashSet<>();
}
