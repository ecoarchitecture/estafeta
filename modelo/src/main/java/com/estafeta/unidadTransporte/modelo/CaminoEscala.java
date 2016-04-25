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
public class CaminoEscala implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public CaminoEscala() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue
	public Long idCaminoEscala;

	/**
	 * 
	 */
	public Integer ordenEscala;

	/**
	 * 
	 */
	@ManyToOne
	public Escala escala;

	/**
	 * 
	 */
	@ManyToOne
	public Camino camino;

	/**
	 * @return the idCaminoEscala
	 */
	public Long getIdCaminoEscala() {
		return idCaminoEscala;
	}

	/**
	 * @param idCaminoEscala the idCaminoEscala to set
	 */
	public void setIdCaminoEscala(Long idCaminoEscala) {
		this.idCaminoEscala = idCaminoEscala;
	}

	/**
	 * @return the ordenEscala
	 */
	public Integer getOrdenEscala() {
		return ordenEscala;
	}

	/**
	 * @param ordenEscala the ordenEscala to set
	 */
	public void setOrdenEscala(Integer ordenEscala) {
		this.ordenEscala = ordenEscala;
	}

	/**
	 * @return the escala
	 */
	public Escala getEscala() {
		return escala;
	}

	/**
	 * @param escala the escala to set
	 */
	public void setEscala(Escala escala) {
		this.escala = escala;
	}

	/**
	 * @return the camino
	 */
	public Camino getCamino() {
		return camino;
	}

	/**
	 * @param camino the camino to set
	 */
	public void setCamino(Camino camino) {
		this.camino = camino;
	}

}