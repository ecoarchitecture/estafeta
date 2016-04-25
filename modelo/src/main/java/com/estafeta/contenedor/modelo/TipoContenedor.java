package com.estafeta.contenedor.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 */
@Entity
public class TipoContenedor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public TipoContenedor() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long idTipoContenedor;

	/**
	 * 
	 */
	public String descripcion;

	/**
	 * @return the idTipoContenedor
	 */
	public Long getIdTipoContenedor() {
		return idTipoContenedor;
	}

	/**
	 * @param idTipoContenedor the idTipoContenedor to set
	 */
	public void setIdTipoContenedor(Long idTipoContenedor) {
		this.idTipoContenedor = idTipoContenedor;
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