package com.estafeta.item.modelo;

import javax.persistence.Entity;

/**
 * 
 */
@Entity
public class Recoleccion extends SolicitudServicio {

	/**
	 * Default constructor
	 */
	public Recoleccion() {
	}

	/**
	 * 
	 */
	public Long numeroReporte;

	/**
	 * 
	 */
	public Long fechaProgramada;

	/**
	 * @return the numeroReporte
	 */
	public Long getNumeroReporte() {
		return numeroReporte;
	}

	/**
	 * @param numeroReporte the numeroReporte to set
	 */
	public void setNumeroReporte(Long numeroReporte) {
		this.numeroReporte = numeroReporte;
	}

	/**
	 * @return the fechaProgramada
	 */
	public Long getFechaProgramada() {
		return fechaProgramada;
	}

	/**
	 * @param fechaProgramada the fechaProgramada to set
	 */
	public void setFechaProgramada(Long fechaProgramada) {
		this.fechaProgramada = fechaProgramada;
	}

}