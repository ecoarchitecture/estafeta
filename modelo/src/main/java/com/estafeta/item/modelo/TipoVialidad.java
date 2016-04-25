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
public class TipoVialidad implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public TipoVialidad() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long idTipoVialidad;

	/**
	 * 
	 */
	public String descripcion;

	/**
	 * @return the idTipoVialidad
	 */
	public Long getIdTipoVialidad() {
		return idTipoVialidad;
	}

	/**
	 * @param idTipoVialidad the idTipoVialidad to set
	 */
	public void setIdTipoVialidad(Long idTipoVialidad) {
		this.idTipoVialidad = idTipoVialidad;
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