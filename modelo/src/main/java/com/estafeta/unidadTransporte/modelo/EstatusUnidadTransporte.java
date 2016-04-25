package com.estafeta.unidadTransporte.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 */
@Entity
public class EstatusUnidadTransporte implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public EstatusUnidadTransporte() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long idEstatusUnidadTransporte;

	/**
	 * 
	 */
	public String descripcion;

	/**
	 * @return the idEstatusUnidadTransporte
	 */
	public Long getIdEstatusUnidadTransporte() {
		return idEstatusUnidadTransporte;
	}

	/**
	 * @param idEstatusUnidadTransporte the idEstatusUnidadTransporte to set
	 */
	public void setIdEstatusUnidadTransporte(Long idEstatusUnidadTransporte) {
		this.idEstatusUnidadTransporte = idEstatusUnidadTransporte;
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