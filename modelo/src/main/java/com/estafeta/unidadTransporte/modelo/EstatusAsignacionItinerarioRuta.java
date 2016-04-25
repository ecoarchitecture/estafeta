package com.estafeta.unidadTransporte.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 */
@Entity
public class EstatusAsignacionItinerarioRuta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public EstatusAsignacionItinerarioRuta() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue
	public Long idEstatusAsignacionItinerarioRuta;

	/**
	 * 
	 */
	public String descripcion;

	/**
	 * @return the idEstatusAsignacionItinerarioRuta
	 */
	public Long getIdEstatusAsignacionItinerarioRuta() {
		return idEstatusAsignacionItinerarioRuta;
	}

	/**
	 * @param idEstatusAsignacionItinerarioRuta the idEstatusAsignacionItinerarioRuta to set
	 */
	public void setIdEstatusAsignacionItinerarioRuta(Long idEstatusAsignacionItinerarioRuta) {
		this.idEstatusAsignacionItinerarioRuta = idEstatusAsignacionItinerarioRuta;
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