package com.lodigital.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="folio")
public class Folio {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idFolio;
	
	@Column(name="correlativo")
	private Integer correlativo;
	
	@Column(name = "id_usuario_creador")
    private Integer idUsuarioCreador;

    @Column(name = "id_usuario_firma")
    private Integer idUsuarioFirma;

    @Column(name = "id_usuario_lectura")
    private Integer idUsuarioLectura;
    
    @Column(name = "requiere_respuesta")
    private Boolean requiereRespuesta;

    @Column(name = "fecha_requerida")
    private Instant fechaRequerida;

    @Column(name = "estado_lectura")
    private Boolean estadoLectura;

    @Column(name = "estado_folio")
    private Boolean estadoFolio;

    @Column(name = "entidad_creacion")
    private Boolean entidadCreacion;

    @Column(name = "fecha_creacion")
    private Instant fechaCreacion;

    @Column(name = "idlibro_relacionado")
    private Integer idlibroRelacionado;

    @Column(name = "id_folio_relacionado")
    private Integer idFolioRelacionado;

    @Column(name = "id_folio_respuesta")
    private Integer idFolioRespuesta;

    @Column(name = "fecha_modificacion")
    private Instant fechaModificacion;

    @Column(name = "fecha_firma")
    private Instant fechaFirma;

    @Column(name = "fecha_lectura")
    private Instant fechaLectura;
    
    @Column(name = "asunto")
    private String asunto;

    @Size(max = 10485760)
    @Column(name = "anotacion", length = 10485760)
    private String anotacion;
    
    @Lob
    @Column(name = "pdf_firmado")
    private byte[] pdfFirmado;

    @Column(name = "pdf_firmado_content_type")
    private String pdfFirmadoContentType;

    @Lob
    @Column(name = "pdf_lectura")
    private byte[] pdfLectura;

    @Column(name = "pdf_lectura_content_type")
    private String pdfLecturaContentType;
    
    @Column(name = "id_receptor")
    private Integer idReceptor;

    @Column(name = "posee_folio_referencia")
    private Boolean poseeFolioReferencia;

    @Column(name = "posee_archivos")
    private Boolean poseeArchivos;
    
    @Column(name="id_tipo_folio")
    private Integer idTipoFolio;
    
    @ManyToOne
    @JsonIgnoreProperties(value = "folio", allowSetters = true)
    private Libro libro;

	public Integer getIdFolio() {
		return idFolio;
	}

	public void setIdFolio(Integer idFolio) {
		this.idFolio = idFolio;
	}

	public Integer getCorrelativo() {
		return correlativo;
	}

	public void setCorrelativo(Integer correlativo) {
		this.correlativo = correlativo;
	}

	public Integer getIdUsuarioCreador() {
		return idUsuarioCreador;
	}

	public void setIdUsuarioCreador(Integer idUsuarioCreador) {
		this.idUsuarioCreador = idUsuarioCreador;
	}

	public Integer getIdUsuarioFirma() {
		return idUsuarioFirma;
	}

	public void setIdUsuarioFirma(Integer idUsuarioFirma) {
		this.idUsuarioFirma = idUsuarioFirma;
	}

	public Integer getIdUsuarioLectura() {
		return idUsuarioLectura;
	}

	public void setIdUsuarioLectura(Integer idUsuarioLectura) {
		this.idUsuarioLectura = idUsuarioLectura;
	}

	public Boolean getRequiereRespuesta() {
		return requiereRespuesta;
	}

	public void setRequiereRespuesta(Boolean requiereRespuesta) {
		this.requiereRespuesta = requiereRespuesta;
	}

	public Instant getFechaRequerida() {
		return fechaRequerida;
	}

	public void setFechaRequerida(Instant fechaRequerida) {
		this.fechaRequerida = fechaRequerida;
	}

	public Boolean getEstadoLectura() {
		return estadoLectura;
	}

	public void setEstadoLectura(Boolean estadoLectura) {
		this.estadoLectura = estadoLectura;
	}

	public Boolean getEstadoFolio() {
		return estadoFolio;
	}

	public void setEstadoFolio(Boolean estadoFolio) {
		this.estadoFolio = estadoFolio;
	}

	public Boolean getEntidadCreacion() {
		return entidadCreacion;
	}

	public void setEntidadCreacion(Boolean entidadCreacion) {
		this.entidadCreacion = entidadCreacion;
	}

	public Instant getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Instant fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Integer getIdlibroRelacionado() {
		return idlibroRelacionado;
	}

	public void setIdlibroRelacionado(Integer idlibroRelacionado) {
		this.idlibroRelacionado = idlibroRelacionado;
	}

	public Integer getIdFolioRelacionado() {
		return idFolioRelacionado;
	}

	public void setIdFolioRelacionado(Integer idFolioRelacionado) {
		this.idFolioRelacionado = idFolioRelacionado;
	}

	public Integer getIdFolioRespuesta() {
		return idFolioRespuesta;
	}

	public void setIdFolioRespuesta(Integer idFolioRespuesta) {
		this.idFolioRespuesta = idFolioRespuesta;
	}

	public Instant getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Instant fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public Instant getFechaFirma() {
		return fechaFirma;
	}

	public void setFechaFirma(Instant fechaFirma) {
		this.fechaFirma = fechaFirma;
	}

	public Instant getFechaLectura() {
		return fechaLectura;
	}

	public void setFechaLectura(Instant fechaLectura) {
		this.fechaLectura = fechaLectura;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getAnotacion() {
		return anotacion;
	}

	public void setAnotacion(String anotacion) {
		this.anotacion = anotacion;
	}

	public byte[] getPdfFirmado() {
		return pdfFirmado;
	}

	public void setPdfFirmado(byte[] pdfFirmado) {
		this.pdfFirmado = pdfFirmado;
	}

	public String getPdfFirmadoContentType() {
		return pdfFirmadoContentType;
	}

	public void setPdfFirmadoContentType(String pdfFirmadoContentType) {
		this.pdfFirmadoContentType = pdfFirmadoContentType;
	}

	public byte[] getPdfLectura() {
		return pdfLectura;
	}

	public void setPdfLectura(byte[] pdfLectura) {
		this.pdfLectura = pdfLectura;
	}

	public String getPdfLecturaContentType() {
		return pdfLecturaContentType;
	}

	public void setPdfLecturaContentType(String pdfLecturaContentType) {
		this.pdfLecturaContentType = pdfLecturaContentType;
	}

	public Integer getIdReceptor() {
		return idReceptor;
	}

	public void setIdReceptor(Integer idReceptor) {
		this.idReceptor = idReceptor;
	}

	public Boolean getPoseeFolioReferencia() {
		return poseeFolioReferencia;
	}

	public void setPoseeFolioReferencia(Boolean poseeFolioReferencia) {
		this.poseeFolioReferencia = poseeFolioReferencia;
	}

	public Boolean getPoseeArchivos() {
		return poseeArchivos;
	}

	public void setPoseeArchivos(Boolean poseeArchivos) {
		this.poseeArchivos = poseeArchivos;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Integer getIdTipoFolio() {
		return idTipoFolio;
	}

	public void setIdTipoFolio(Integer idTipoFolio) {
		this.idTipoFolio = idTipoFolio;
	}	
}
