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
public class EstatusSolicitudServicio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public EstatusSolicitudServicio() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long idEstatusSolicitudServicio;

	/**
	 * 
	 */
	public String descripcion;

	/**
	 * @return the idEstatusSolicitudServicio
	 */
	public Long getIdEstatusSolicitudServicio() {
		return idEstatusSolicitudServicio;
	}

	/**
	 * @param idEstatusSolicitudServicio the idEstatusSolicitudServicio to set
	 */
	public void setIdEstatusSolicitudServicio(Long idEstatusSolicitudServicio) {
		this.idEstatusSolicitudServicio = idEstatusSolicitudServicio;
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