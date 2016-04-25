package com.estafeta.item.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * 
 */
@Entity
public class Direccion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public Direccion() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long idDireccion;

	/**
	 * 
	 */
	public String nombreVialidad;

	/**
	 * 
	 */
	public String numeroExterior;

	/**
	 * 
	 */
	public String numeroInterior;

	/**
	 * 
	 */
	public String nombreAsentamiento;

	/**
	 * 
	 */
	public String referencias;

	/**
	 * 
	 */
	public String notasAdicionales;

	/**
	 * 
	 */
	public BigDecimal longitud;

	/**
	 * 
	 */
	public BigDecimal latitud;

	/**
	 * 
	 */
	
	@ManyToOne
	@JoinColumn(name = "idAsentamiento")
	public Asentamiento asentamiento;

	/**
	 * 
	 */
	@ManyToOne
	public TipoVialidad tipoVialidad;

	/**
	 * @return the idDireccion
	 */
	public Long getIdDireccion() {
		return idDireccion;
	}

	/**
	 * @param idDireccion the idDireccion to set
	 */
	public void setIdDireccion(Long idDireccion) {
		this.idDireccion = idDireccion;
	}

	/**
	 * @return the nombreVialidad
	 */
	public String getNombreVialidad() {
		return nombreVialidad;
	}

	/**
	 * @param nombreVialidad the nombreVialidad to set
	 */
	public void setNombreVialidad(String nombreVialidad) {
		this.nombreVialidad = nombreVialidad;
	}

	/**
	 * @return the numeroExterior
	 */
	public String getNumeroExterior() {
		return numeroExterior;
	}

	/**
	 * @param numeroExterior the numeroExterior to set
	 */
	public void setNumeroExterior(String numeroExterior) {
		this.numeroExterior = numeroExterior;
	}

	/**
	 * @return the numeroInterior
	 */
	public String getNumeroInterior() {
		return numeroInterior;
	}

	/**
	 * @param numeroInterior the numeroInterior to set
	 */
	public void setNumeroInterior(String numeroInterior) {
		this.numeroInterior = numeroInterior;
	}

	/**
	 * @return the nombreAsentamiento
	 */
	public String getNombreAsentamiento() {
		return nombreAsentamiento;
	}

	/**
	 * @param nombreAsentamiento the nombreAsentamiento to set
	 */
	public void setNombreAsentamiento(String nombreAsentamiento) {
		this.nombreAsentamiento = nombreAsentamiento;
	}

	/**
	 * @return the referencias
	 */
	public String getReferencias() {
		return referencias;
	}

	/**
	 * @param referencias the referencias to set
	 */
	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}

	/**
	 * @return the notasAdicionales
	 */
	public String getNotasAdicionales() {
		return notasAdicionales;
	}

	/**
	 * @param notasAdicionales the notasAdicionales to set
	 */
	public void setNotasAdicionales(String notasAdicionales) {
		this.notasAdicionales = notasAdicionales;
	}

	/**
	 * @return the longitud
	 */
	public BigDecimal getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(BigDecimal longitud) {
		this.longitud = longitud;
	}

	/**
	 * @return the latitud
	 */
	public BigDecimal getLatitud() {
		return latitud;
	}

	/**
	 * @param latitud the latitud to set
	 */
	public void setLatitud(BigDecimal latitud) {
		this.latitud = latitud;
	}

	/**
	 * @return the asentamiento
	 */
	public Asentamiento getAsentamiento() {
		return asentamiento;
	}

	/**
	 * @param asentamiento the asentamiento to set
	 */
	public void setAsentamiento(Asentamiento asentamiento) {
		this.asentamiento = asentamiento;
	}

	/**
	 * @return the tipoVialidad
	 */
	public TipoVialidad getTipoVialidad() {
		return tipoVialidad;
	}

	/**
	 * @param tipoVialidad the tipoVialidad to set
	 */
	public void setTipoVialidad(TipoVialidad tipoVialidad) {
		this.tipoVialidad = tipoVialidad;
	}


}