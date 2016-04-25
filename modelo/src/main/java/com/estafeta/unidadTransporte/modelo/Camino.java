package com.estafeta.unidadTransporte.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.estafeta.item.modelo.Edificio;

/**
 * 
 */
@Entity
public class Camino implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public Camino() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue
	public Long idCamino;

	/**
	 * 
	 */
	public String descripcion;


	/**
	 * 
	 */
	
	 @ManyToOne
	 @JoinColumn(name = "idEdificioOrigen")
	public Edificio origen;

	/**
	 * 
	 */
	 @ManyToOne
	 @JoinColumn(name = "idEdificioDestino")
	public Edificio destino;

	/**
	 * @return the idCamino
	 */
	public Long getIdCamino() {
		return idCamino;
	}

	/**
	 * @param idCamino the idCamino to set
	 */
	public void setIdCamino(Long idCamino) {
		this.idCamino = idCamino;
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