package com.lodigital.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="configuracion_tipo_folio_tipo_libro")
public class ConfiguracionTipoFolioTipoLibro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
    @JsonIgnoreProperties(value = "configuracion_tipo_folio_tipo_libro", allowSetters = true)
    private TipoFolio tipoFolio;
	
	@ManyToOne
    @JsonIgnoreProperties(value = "configuracion_tipo_folio_tipo_libro", allowSetters = true)
    private TipoLibro tipoLibro;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TipoFolio getTipoFolio() {
		return tipoFolio;
	}

	public void setTipoFolio(TipoFolio tipoFolio) {
		this.tipoFolio = tipoFolio;
	}

	public TipoLibro getTipoLibro() {
		return tipoLibro;
	}

	public void setTipoLibro(TipoLibro tipoLibro) {
		this.tipoLibro = tipoLibro;
	}
}
