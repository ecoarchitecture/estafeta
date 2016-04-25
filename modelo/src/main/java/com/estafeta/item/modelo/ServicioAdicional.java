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
public class ServicioAdicional implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public ServicioAdicional() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long idServicioAdicional;

	/**
	 * 
	 */
	public String descripcion;

	/**
	 * @return the idServicioAdicional
	 */
	public Long getIdServicioAdicional() {
		return idServicioAdicional;
	}

	/**
	 * @param idServicioAdicional the idServicioAdicional to set
	 */
	public void setIdServicioAdicional(Long idServicioAdicional) {
		this.idServicioAdicional = idServicioAdicional;
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