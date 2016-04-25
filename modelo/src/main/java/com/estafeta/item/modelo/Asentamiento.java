package com.estafeta.item.modelo;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * 
 */
@Entity
public class Asentamiento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public Asentamiento() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long idAsentamiento;

	/**
	 * 
	 */
	public String descripcion;

	/**
	 * 
	 */
	
	@OneToMany(cascade={CascadeType.ALL}, mappedBy = "asentamiento")
	public Set<Localidad> localidades;

	/**
	 * 
	 */
	 @ManyToOne
	 @JoinColumn(name = "idTipoAsentamiento")
	public TipoAsentamiento tipoAsentamiento;

	/**
	 * 
	 */
	@OneToMany(cascade={CascadeType.ALL}, mappedBy = "asentamiento")
	public Set<Plaza> plazas;

	/**
	 * @return the idLocalidad
	 */
	public Long getIdLocalidad() {
		return idAsentamiento;
	}

	/**
	 * @param idLocalidad the idLocalidad to set
	 */
	public void setIdLocalidad(Long idLocalidad) {
		this.idAsentamiento = idLocalidad;
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
	 * @return the localidades
	 */
	public Set<Localidad> getLocalidades() {
		return localidades;
	}

	/**
	 * @param localidades the localidades to set
	 */
	public void setLocalidades(Set<Localidad> localidades) {
		this.localidades = localidades;
	}

	/**
	 * @return the tipoAsentamiento
	 */
	public TipoAsentamiento getTipoAsentamiento() {
		return tipoAsentamiento;
	}

	/**
	 * @param tipoAsentamiento the tipoAsentamiento to set
	 */
	public void setTipoAsentamiento(TipoAsentamiento tipoAsentamiento) {
		this.tipoAsentamiento = tipoAsentamiento;
	}

	/**
	 * @return the plazas
	 */
	public Set<Plaza> getPlazas() {
		return plazas;
	}

	/**
	 * @param plazas the plazas to set
	 */
	public void setPlazas(Set<Plaza> plazas) {
		this.plazas = plazas;
	}


}