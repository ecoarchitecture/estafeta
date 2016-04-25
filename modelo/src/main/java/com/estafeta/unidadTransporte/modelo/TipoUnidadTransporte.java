package com.estafeta.unidadTransporte.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * 
 */
@Entity
public class TipoUnidadTransporte implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public TipoUnidadTransporte() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue
	public Long idTipoUnidadTransporte;

	/**
	 * 
	 */
	public String descripcion;

	/**
	 * 
	 */
	@ManyToOne
	public SubtipoUnidadTransporte tipoUnidadTransporte;

	/**
	 * @return the idTipoUnidadTransporte
	 */
	public Long getIdTipoUnidadTransporte() {
		return idTipoUnidadTransporte;
	}

	/**
	 * @param idTipoUnidadTransporte the idTipoUnidadTransporte to set
	 */
	public void setIdTipoUnidadTransporte(Long idTipoUnidadTransporte) {
		this.idTipoUnidadTransporte = idTipoUnidadTransporte;
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
	 * @return the tipoUnidadTransporte
	 */
	public SubtipoUnidadTransporte getTipoUnidadTransporte() {
		return tipoUnidadTransporte;
	}

	/**
	 * @param tipoUnidadTransporte the tipoUnidadTransporte to set
	 */
	public void setTipoUnidadTransporte(SubtipoUnidadTransporte tipoUnidadTransporte) {
		this.tipoUnidadTransporte = tipoUnidadTransporte;
	}

}