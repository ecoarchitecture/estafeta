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
public class TipoEnvoltura implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public TipoEnvoltura() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long idTipoEnvoltura;

	/**
	 * 
	 */
	public String descripcion;

	/**
	 * @return the idTipoEnvoltura
	 */
	public Long getIdTipoEnvoltura() {
		return idTipoEnvoltura;
	}

	/**
	 * @param idTipoEnvoltura the idTipoEnvoltura to set
	 */
	public void setIdTipoEnvoltura(Long idTipoEnvoltura) {
		this.idTipoEnvoltura = idTipoEnvoltura;
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