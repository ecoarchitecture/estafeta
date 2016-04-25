package com.estafeta.item.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * 
 */
@Entity
public class Anden implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public Anden() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long idTipoAnden;

	/**
	 * 
	 */
	public String descripcion;

	/**
	 * 
	 */
	@ManyToOne
	public TipoAnden tipoAnden;

	/**
	 * @return the idTipoAnden
	 */
	public Long getIdTipoAnden() {
		return idTipoAnden;
	}

	/**
	 * @param idTipoAnden the idTipoAnden to set
	 */
	public void setIdTipoAnden(Long idTipoAnden) {
		this.idTipoAnden = idTipoAnden;
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

	/**
	 * @return the tipoAnden
	 */
	public TipoAnden getTipoAnden() {
		return tipoAnden;
	}

	/**
	 * @param tipoAnden the tipoAnden to set
	 */
	public void setTipoAnden(TipoAnden tipoAnden) {
		this.tipoAnden = tipoAnden;
	}


}