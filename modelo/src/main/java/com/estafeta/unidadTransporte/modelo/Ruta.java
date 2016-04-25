package com.estafeta.unidadTransporte.modelo;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * 
 */
@Entity
public class Ruta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public Ruta() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long idRuta;

	/**
	 * 
	 */
	public String descripcion;

	/**
	 * 
	 */
	@OneToMany
	public Set<Camino> camino;

	/**
	 * 
	 */
	@ManyToOne
	public ItinerarioRuta ruta;

	/**
	 * @return the idRuta
	 */
	public Long getIdRuta() {
		return idRuta;
	}

	/**
	 * @param idRuta the idRuta to set
	 */
	public void setIdRuta(Long idRuta) {
		this.idRuta = idRuta;
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
	 * @return the camino
	 */
	public Set<Camino> getCamino() {
		return camino;
	}

	/**
	 * @param camino the camino to set
	 */
	public void setCamino(Set<Camino> camino) {
		this.camino = camino;
	}

	/**
	 * @return the ruta
	 */
	public ItinerarioRuta getRuta() {
		return ruta;
	}

	/**
	 * @param ruta the ruta to set
	 */
	public void setRuta(ItinerarioRuta ruta) {
		this.ruta = ruta;
	}

}