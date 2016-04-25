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
public class Localidad implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public Localidad() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long idLocalidad;

	/**
	 * 
	 */
	public String descripcion;

	/**
	 * 
	 */
    @OneToMany(cascade={CascadeType.ALL}, mappedBy = "localidad")
	public Set<Municipio> municipios;
    
    
    
    @ManyToOne
	 @JoinColumn(name = "idAsentamiento")
	 private Asentamiento asentamiento;
    

	/**
	 * @return the idLocalidad
	 */
	public Long getIdLocalidad() {
		return idLocalidad;
	}

	/**
	 * @param idLocalidad the idLocalidad to set
	 */
	public void setIdLocalidad(Long idLocalidad) {
		this.idLocalidad = idLocalidad;
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
	 * @return the municipios
	 */
	public Set<Municipio> getMunicipios() {
		return municipios;
	}

	/**
	 * @param municipios the municipios to set
	 */
	public void setMunicipios(Set<Municipio> municipios) {
		this.municipios = municipios;
	}

}