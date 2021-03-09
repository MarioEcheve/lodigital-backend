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
    @Column(name = "visible_maestro", nullable = false)
    private Boolean visibleMaestro;

    @NotNull
    @Column(name = "visible_auxliar", nullable = false)
    private Boolean visibleAuxliar;

    @NotNull
    @Column(name = "visible_mandante", nullable = false)
    private Boolean visibleMandante;

    @NotNull
    @Column(name = "visible_contratista", nullable = false)
    private Boolean visibleContratista;
    
    @NotNull
    @Column(name = "visible_prevencion", nullable = false)
    private Boolean visiblePrevencion;
    
    @NotNull
    @Column(name = "visible_comunicaciones", nullable = false)
    private Boolean visibleComunicaciones;

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

	public Boolean getVisibleMaestro() {
		return visibleMaestro;
	}

	public void setVisibleMaestro(Boolean visibleMaestro) {
		this.visibleMaestro = visibleMaestro;
	}

	public Boolean getVisibleAuxliar() {
		return visibleAuxliar;
	}

	public void setVisibleAuxliar(Boolean visibleAuxliar) {
		this.visibleAuxliar = visibleAuxliar;
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

	public Boolean getVisiblePrevencion() {
		return visiblePrevencion;
	}

	public void setVisiblePrevencion(Boolean visiblePrevencion) {
		this.visiblePrevencion = visiblePrevencion;
	}

	public Boolean getVisibleComunicaciones() {
		return visibleComunicaciones;
	}

	public void setVisibleComunicaciones(Boolean visibleComunicaciones) {
		this.visibleComunicaciones = visibleComunicaciones;
	}
}
