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
public class TipoEdificio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public TipoEdificio() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long idTipoEdificio;

	/**
	 * 
	 */
	public String descripcion;

	/**
	 * @return the idTipoEdificio
	 */
	public Long getIdTipoEdificio() {
		return idTipoEdificio;
	}

	/**
	 * @param idTipoEdificio the idTipoEdificio to set
	 */
	public void setIdTipoEdificio(Long idTipoEdificio) {
		this.idTipoEdificio = idTipoEdificio;
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