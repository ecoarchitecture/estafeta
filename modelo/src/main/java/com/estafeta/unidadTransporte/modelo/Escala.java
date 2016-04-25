package com.estafeta.unidadTransporte.modelo;

import com.estafeta.item.modelo.Edificio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * 
 */
@Entity
public class Escala implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public Escala() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue
	public Long idEscala;

	/**
	 * 
	 */
	public String descripcion;

	/**
	 * 
	 */
	public Long numeroKm;

	/**
	 * 
	 */
	@ManyToOne
	public Edificio origen;

	/**
	 * 
	 */
	@ManyToOne
	public Edificio destino;

	/**
	 * @return the idEscala
	 */
	public Long getIdEscala() {
		return idEscala;
	}

	/**
	 * @param idEscala the idEscala to set
	 */
	public void setIdEscala(Long idEscala) {
		this.idEscala = idEscala;
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
	 * @return the numeroKm
	 */
	public Long getNumeroKm() {
		return numeroKm;
	}

	/**
	 * @param numeroKm the numeroKm to set
	 */
	public void setNumeroKm(Long numeroKm) {
		this.numeroKm = numeroKm;
	}

	/**
	 * @return the origen
	 */
	public Edificio getOrigen() {
		return origen;
	}

	/**
	 * @param origen the origen to set
	 */
	public void setOrigen(Edificio origen) {
		this.origen = origen;
	}

	/**
	 * @return the destino
	 */
	public Edificio getDestino() {
		return destino;
	}

	/**
	 * @param destino the destino to set
	 */
	public void setDestino(Edificio destino) {
		this.destino = destino;
	}

}