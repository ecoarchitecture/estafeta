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
public class GarantiaTiempoEntrega implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public GarantiaTiempoEntrega() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long idGarantia;

	/**
	 * 
	 */
	public String descripcion;

	/**
	 * @return the idGarantia
	 */
	public Long getIdGarantia() {
		return idGarantia;
	}

	/**
	 * @param idGarantia the idGarantia to set
	 */
	public void setIdGarantia(Long idGarantia) {
		this.idGarantia = idGarantia;
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