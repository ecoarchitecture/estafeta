package com.estafeta.item.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

/**
 * 
 */

public class ItenerarioEnvio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public ItenerarioEnvio() {
	}

	/**
	 * 
	 */
	
	public Long idItenerarioEnvio;

	/**
	 * 
	 */
	public Integer orden;

	/**
	 * 
	 */
	
	public Envio envio;



	/**
	 * @return the orden
	 */
	public Integer getOrden() {
		return orden;
	}

	/**
	 * @param orden the orden to set
	 */
	public void setOrden(Integer orden) {
		this.orden = orden;
	}

	

	/**
	 * @param envio the envio to set
	 */
	public void setEnvio(Envio envio) {
		this.envio = envio;
	}

}