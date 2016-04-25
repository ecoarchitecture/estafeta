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
public class EstatusItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public EstatusItem() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long idEstatusItem;

	/**
	 * 
	 */
	public String descripcion;

	/**
	 * @return the idEstatusItem
	 */
	public Long getIdEstatusItem() {
		return idEstatusItem;
	}

	/**
	 * @param idEstatusItem the idEstatusItem to set
	 */
	public void setIdEstatusItem(Long idEstatusItem) {
		this.idEstatusItem = idEstatusItem;
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