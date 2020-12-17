package com.lodigital.model;

import javax.persistence.*;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

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
	
	@ManyToOne
    @JsonIgnoreProperties("comunas")
    private Region region;
}
