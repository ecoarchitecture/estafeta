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
public class Seguro implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public Seguro() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long idSeguro;

	/**
	 * 
	 */
	public String descripcion;

	/**
	 * @return the idSeguro
	 */
	public Long getIdSeguro() {
		return idSeguro;
	}

	/**
	 * @param idSeguro the idSeguro to set
	 */
	public void setIdSeguro(Long idSeguro) {
		this.idSeguro = idSeguro;
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