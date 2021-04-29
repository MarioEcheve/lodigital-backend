package com.lodigital.model;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="libro")
public class Libro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idLibro;
	
	@Column(name="codigo" , nullable = false , length = 10)
	private String codigo;
	
	@Column(name="nombre" , length = 100)
	private String nombre;
	
	@Column(name="descripcion" , length = 100)
	private String descripcion;
	
	
	@Column(name="fecha_creacion")
	private Instant fechaCreacion;
	
	@Column(name="fecha_cierre")
	private Instant fechaCierre;
	
	@ManyToOne
    @JsonIgnoreProperties(value = "libro", allowSetters = true)
    private Contrato contrato;
	
	@ManyToOne
    @JsonIgnoreProperties(value = "libro", allowSetters = true)
    private TipoLibro tipoLibro;
	
	@ManyToOne
    @JsonIgnoreProperties(value = "libro", allowSetters = true)
    private TipoFirma tipoFirma;
	
	@ManyToOne
    @JsonIgnoreProperties(value = "libro", allowSetters = true)
    private EstadoLibro estadoLibro;
	
	@OneToMany(mappedBy = "libro")
    private Set<Folio> folios = new HashSet<>();
	
	@NotNull
    @Column(name = "libro_abierto", nullable = true)
    private Boolean libroAbierto;
	
	@Size(max = 200)
	@Column(name = "nombre_carpeta_aws", length = 200)
	private String nombreCarpetaAws;

	public Integer getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(Integer idLibro) {
		this.idLibro = idLibro;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoLibro getTipoLibro() {
		return tipoLibro;
	}

	public void setTipoLibro(TipoLibro tipoLibro) {
		this.tipoLibro = tipoLibro;
	}

	public EstadoLibro getEstadoLibro() {
		return estadoLibro;
	}

	public void setEstadoLibro(EstadoLibro estadoLibro) {
		this.estadoLibro = estadoLibro;
	}

	public Instant getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Instant fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Instant getFechaCierre() {
		return fechaCierre;
	}

	public void setFechaCierre(Instant fechaCierre) {
		this.fechaCierre = fechaCierre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public TipoFirma getTipoFirma() {
		return tipoFirma;
	}

	public void setTipoFirma(TipoFirma tipoFirma) {
		this.tipoFirma = tipoFirma;
	}

	public Boolean getLibroAbierto() {
		return libroAbierto;
	}

	public void setLibroAbierto(Boolean libroAbierto) {
		this.libroAbierto = libroAbierto;
	}

	public String getNombreCarpetaAws() {
		return nombreCarpetaAws;
	}

	public void setNombreCarpetaAws(String nombreCarpetaAws) {
		this.nombreCarpetaAws = nombreCarpetaAws;
	}
}
