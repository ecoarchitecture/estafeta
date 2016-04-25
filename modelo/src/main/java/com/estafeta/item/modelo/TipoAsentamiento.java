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
public class TipoAsentamiento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public TipoAsentamiento() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long idTipoAsentamiento;

	/**
	 * 
	 */
	public String descripcion;

	/**
	 * @return the idTipoAsentamiento
	 */
	public Long getIdTipoAsentamiento() {
		return idTipoAsentamiento;
	}

	/**
	 * @param idTipoAsentamiento the idTipoAsentamiento to set
	 */
	public void setIdTipoAsentamiento(Long idTipoAsentamiento) {
		this.idTipoAsentamiento = idTipoAsentamiento;
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