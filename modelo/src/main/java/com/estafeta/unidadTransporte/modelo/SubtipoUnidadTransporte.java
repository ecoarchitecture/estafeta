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
public class SubtipoUnidadTransporte implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public SubtipoUnidadTransporte() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue
	public Long idSubtipoUnidadTransporte;

	/**
	 * 
	 */
	public String descripcion;

	/**
	 * 
	 */
	@ManyToOne
	public Ruta subTipoUnidadTransporte;

	/**
	 * @return the idSubtipoUnidadTransporte
	 */
	public Long getIdSubtipoUnidadTransporte() {
		return idSubtipoUnidadTransporte;
	}

	/**
	 * @param idSubtipoUnidadTransporte the idSubtipoUnidadTransporte to set
	 */
	public void setIdSubtipoUnidadTransporte(Long idSubtipoUnidadTransporte) {
		this.idSubtipoUnidadTransporte = idSubtipoUnidadTransporte;
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
	 * @return the subTipoUnidadTransporte
	 */
	public Ruta getSubTipoUnidadTransporte() {
		return subTipoUnidadTransporte;
	}

	/**
	 * @param subTipoUnidadTransporte the subTipoUnidadTransporte to set
	 */
	public void setSubTipoUnidadTransporte(Ruta subTipoUnidadTransporte) {
		this.subTipoUnidadTransporte = subTipoUnidadTransporte;
	}

}