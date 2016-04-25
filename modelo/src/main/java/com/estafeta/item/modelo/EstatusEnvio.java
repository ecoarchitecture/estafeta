package com.estafeta.item.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 */
@Entity
public class EstatusEnvio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public EstatusEnvio() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long idEstatusEnvio;

	/**
	 * 
	 */
	public String descripcion;

	/**
	 * @return the idEstatusEnvio
	 */
	public Long getIdEstatusEnvio() {
		return idEstatusEnvio;
	}

	/**
	 * @param idEstatusEnvio the idEstatusEnvio to set
	 */
	public void setIdEstatusEnvio(Long idEstatusEnvio) {
		this.idEstatusEnvio = idEstatusEnvio;
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