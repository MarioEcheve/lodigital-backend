package com.lodigital.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tipo_folio")
public class TipoFolio {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Size(max = 50)
    @Column(name = "nombre", length = 50)
    private String nombre;
	
    @NotNull
    @Column(name = "visible_mandante", nullable = false)
    private Boolean visibleMandante;

    @NotNull
    @Column(name = "visible_contratista", nullable = false)
    private Boolean visibleContratista;
    
    @NotNull
    @Column(name = "apertura_libro", nullable = false)
    private Boolean aperturaLibro;
    
    @Column(name = "cierre_libro", nullable = false)
    private Boolean cierreLibro;
    
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getVisibleMandante() {
		return visibleMandante;
	}

	public void setVisibleMandante(Boolean visibleMandante) {
		this.visibleMandante = visibleMandante;
	}

	public Boolean getVisibleContratista() {
		return visibleContratista;
	}

	public void setVisibleContratista(Boolean visibleContratista) {
		this.visibleContratista = visibleContratista;
	}

	public Boolean getAperturaLibro() {
		return aperturaLibro;
	}

	public void setAperturaLibro(Boolean aperturaLibro) {
		this.aperturaLibro = aperturaLibro;
	}

	public Boolean getCierreLibro() {
		return cierreLibro;
	}

	public void setCierreLibro(Boolean cierreLibro) {
		this.cierreLibro = cierreLibro;
	}
}
