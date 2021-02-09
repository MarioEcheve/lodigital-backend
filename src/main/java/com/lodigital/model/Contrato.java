package com.lodigital.model;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "contrato")
public class Contrato  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="id_empresa_mandante")
	private Integer idEmpresaMandante;
	
	@Column(name="id_empresa_contratista")
	private Integer idEmpresaContratista;
	
	@Column(nullable = false, unique = true , length = 25)
	private String codigo;
	
	@Column(nullable = false, unique = true , length = 100)
	private String nombre;
	
	@Column(nullable = true)
	private String descripcion;
	
	@Column(nullable = true)
	private String direccion;
	
	@Column(nullable = true)
	private String monto;
	
	@Column(name="observacion")
	private String observaciones;
	
	@Column(name="observacion_servicio")
	private String observacionesServico;
	
	@Column(nullable = true)
	private String otraModalidad;
	
	@Column(nullable = true)
	private String otroTipo;
	
	@Column(name="fecha_inicio")
	private Instant fechaInicio;
	
	@Column(name="fecha_termino")
	private Instant fechaTermino;
	
	@Column(name="fecha_inicio_servicio")
	private Instant fechaInicioService;
	
	@Column(name="fecha_termino_servicio")
	private Instant fechaTerminoServicio;
	
	@Column(name="fecha_termino_acceso")
	private Instant fechaTerminoAcceso;
	
	@Column(name="nombre_contacto")
	private String nombreContacto;
	
	@Column(name="telefono_contacto")
	private Integer telefonoContacto;
	
	@Column(name="email_contacto")
	private String emailContacto;
	
	@ManyToOne
    @JsonIgnoreProperties(value = "contrato", allowSetters = true)
    private TipoContrato tipoContrato;
	
	@ManyToOne
    @JsonIgnoreProperties(value = "contrato", allowSetters = true)
    private TipoModalidad tipoModalidad;
	
	@ManyToOne
    @JsonIgnoreProperties(value = "contrato", allowSetters = true)
    private EstadoContrato estadoContrato;
	
	@ManyToOne
    @JsonIgnoreProperties(value = "contrato", allowSetters = true)
    private EstadoServicioContrato estadoServicioContrato;
	
	@ManyToOne
    @JsonIgnoreProperties(value = "contrato", allowSetters = true)
    private Region region;
	
	@ManyToOne
    @JsonIgnoreProperties(value = "contrato", allowSetters = true)
    private Comuna comuna;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdEmpresaMandante() {
		return idEmpresaMandante;
	}

	public void setIdEmpresaMandante(Integer idEmpresaMandante) {
		this.idEmpresaMandante = idEmpresaMandante;
	}

	public Integer getIdEmpresaContratista() {
		return idEmpresaContratista;
	}

	public void setIdEmpresaContratista(Integer idEmpresaContratista) {
		this.idEmpresaContratista = idEmpresaContratista;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getMonto() {
		return monto;
	}

	public void setMonto(String monto) {
		this.monto = monto;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getObservacionesServico() {
		return observacionesServico;
	}

	public void setObservacionesServico(String observacionesServico) {
		this.observacionesServico = observacionesServico;
	}

	public String getOtraModalidad() {
		return otraModalidad;
	}

	public void setOtraModalidad(String otraModalidad) {
		this.otraModalidad = otraModalidad;
	}

	public String getOtroTipo() {
		return otroTipo;
	}

	public void setOtroTipo(String otroTipo) {
		this.otroTipo = otroTipo;
	}

	public Instant getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Instant fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Instant getFechaTermino() {
		return fechaTermino;
	}

	public void setFechaTermino(Instant fechaTermino) {
		this.fechaTermino = fechaTermino;
	}

	public Instant getFechaInicioService() {
		return fechaInicioService;
	}

	public void setFechaInicioService(Instant fechaInicioService) {
		this.fechaInicioService = fechaInicioService;
	}

	public Instant getFechaTerminoServicio() {
		return fechaTerminoServicio;
	}

	public void setFechaTerminoServicio(Instant fechaTerminoServicio) {
		this.fechaTerminoServicio = fechaTerminoServicio;
	}

	public Instant getFechaTerminoAcceso() {
		return fechaTerminoAcceso;
	}

	public void setFechaTerminoAcceso(Instant fechaTerminoAcceso) {
		this.fechaTerminoAcceso = fechaTerminoAcceso;
	}

	public String getNombreContacto() {
		return nombreContacto;
	}

	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}

	public Integer getTelefonoContacto() {
		return telefonoContacto;
	}

	public void setTelefonoContacto(Integer telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}

	public String getEmailContacto() {
		return emailContacto;
	}

	public void setEmailContacto(String emailContacto) {
		this.emailContacto = emailContacto;
	}

	public TipoContrato getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(TipoContrato tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	public TipoModalidad getTipoModalidad() {
		return tipoModalidad;
	}

	public void setTipoModalidad(TipoModalidad tipoModalidad) {
		this.tipoModalidad = tipoModalidad;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public Comuna getComuna() {
		return comuna;
	}

	public void setComuna(Comuna comuna) {
		this.comuna = comuna;
	}

	public EstadoContrato getEstadoContrato() {
		return estadoContrato;
	}

	public void setEstadoContrato(EstadoContrato estadoContrato) {
		this.estadoContrato = estadoContrato;
	}

	public EstadoServicioContrato getEstadoServicioContrato() {
		return estadoServicioContrato;
	}

	public void setEstadoServicioContrato(EstadoServicioContrato estadoServicioContrato) {
		this.estadoServicioContrato = estadoServicioContrato;
	}
}
