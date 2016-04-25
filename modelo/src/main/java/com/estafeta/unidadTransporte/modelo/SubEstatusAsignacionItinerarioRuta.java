package com.estafeta.unidadTransporte.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 */
@Entity
public class SubEstatusAsignacionItinerarioRuta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public SubEstatusAsignacionItinerarioRuta() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue
	public Long idSubEstatusAsignacionItinerarioRuta;

	/**
	 * 
	 */
	public String descripcion;

	/**
	 * @return the idSubEstatusAsignacionItinerarioRuta
	 */
	public Long getIdSubEstatusAsignacionItinerarioRuta() {
		return idSubEstatusAsignacionItinerarioRuta;
	}

	/**
	 * @param idSubEstatusAsignacionItinerarioRuta the idSubEstatusAsignacionItinerarioRuta to set
	 */
	public void setIdSubEstatusAsignacionItinerarioRuta(Long idSubEstatusAsignacionItinerarioRuta) {
		this.idSubEstatusAsignacionItinerarioRuta = idSubEstatusAsignacionItinerarioRuta;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}