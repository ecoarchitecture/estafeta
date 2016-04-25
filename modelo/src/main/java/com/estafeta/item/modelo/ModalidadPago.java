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
public class ModalidadPago implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public ModalidadPago() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long idModalidadPago;

	/**
	 * 
	 */
	public String descripcion;

	/**
	 * @return the idModalidadPago
	 */
	public Long getIdModalidadPago() {
		return idModalidadPago;
	}

	/**
	 * @param idModalidadPago the idModalidadPago to set
	 */
	public void setIdModalidadPago(Long idModalidadPago) {
		this.idModalidadPago = idModalidadPago;
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