package com.estafeta.contenedor.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 */
@Entity
public class EstatusContenedor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; 

	/**
	 * Default constructor
	 */
	public EstatusContenedor() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue
	public Long idEstatusContenedor;

	/**
	 * 
	 */
	public String descripcion;

	/**
	 * @return the idEstatusContenedor
	 */
	public Long getIdEstatusContenedor() {
		return idEstatusContenedor;
	}

	/**
	 * @param idEstatusContenedor the idEstatusContenedor to set
	 */
	public void setIdEstatusContenedor(Long idEstatusContenedor) {
		this.idEstatusContenedor = idEstatusContenedor;
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