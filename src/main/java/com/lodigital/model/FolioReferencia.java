package com.lodigital.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "folio_referencia")
public class FolioReferencia implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "asunto")
    private String asunto;
	
	@Column(name = "id_folio_origen")
    private Integer idFolioOrigen;

    @Column(name = "id_folio_referencia")
    private Integer idFolioReferencia;
    
    @Column(name = "id_libro_folio_origen")
    private Integer idLibroFolioOrigen;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public Integer getIdFolioOrigen() {
		return idFolioOrigen;
	}

	public void setIdFolioOrigen(Integer idFolioOrigen) {
		this.idFolioOrigen = idFolioOrigen;
	}

	public Integer getIdFolioReferencia() {
		return idFolioReferencia;
	}

	public void setIdFolioReferencia(Integer idFolioReferencia) {
		this.idFolioReferencia = idFolioReferencia;
	}

	public Integer getIdLibroFolioOrigen() {
		return idLibroFolioOrigen;
	}

	public void setIdLibroFolioOrigen(Integer idLibroFolioOrigen) {
		this.idLibroFolioOrigen = idLibroFolioOrigen;
	}
}
