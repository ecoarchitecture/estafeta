package com.estafeta.unidadTransporte.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 */
@Entity
public class SubEstatusUnidadTransporte implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public SubEstatusUnidadTransporte() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue
	public Long idSubEstatusUnidadTransporte;

	/**
	 * 
	 */
	public String descripcion;

	/**
	 * @return the idSubEstatusUnidadTransporte
	 */
	public Long getIdSubEstatusUnidadTransporte() {
		return idSubEstatusUnidadTransporte;
	}

	/**
	 * @param idSubEstatusUnidadTransporte the idSubEstatusUnidadTransporte to set
	 */
	public void setIdSubEstatusUnidadTransporte(Long idSubEstatusUnidadTransporte) {
		this.idSubEstatusUnidadTransporte = idSubEstatusUnidadTransporte;
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