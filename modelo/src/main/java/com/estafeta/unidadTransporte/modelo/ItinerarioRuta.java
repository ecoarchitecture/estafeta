package com.estafeta.unidadTransporte.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 */
@Entity
public class ItinerarioRuta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public ItinerarioRuta() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue
	public Long idItinerarioRuta;

	/**
	 * 
	 */
	public String descripcion;

	/**
	 * 
	 */
	public Integer numDiaSemana;

	/**
	 * 
	 */
	public Date hora;

	/**
	 * @return the idItinerarioRuta
	 */
	public Long getIdItinerarioRuta() {
		return idItinerarioRuta;
	}

	/**
	 * @param idItinerarioRuta the idItinerarioRuta to set
	 */
	public void setIdItinerarioRuta(Long idItinerarioRuta) {
		this.idItinerarioRuta = idItinerarioRuta;
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
	 * @return the numDiaSemana
	 */
	public Integer getNumDiaSemana() {
		return numDiaSemana;
	}

	/**
	 * @param numDiaSemana the numDiaSemana to set
	 */
	public void setNumDiaSemana(Integer numDiaSemana) {
		this.numDiaSemana = numDiaSemana;
	}

	/**
	 * @return the hora
	 */
	public Date getHora() {
		return hora;
	}

	/**
	 * @param hora the hora to set
	 */
	public void setHora(Date hora) {
		this.hora = hora;
	}


}