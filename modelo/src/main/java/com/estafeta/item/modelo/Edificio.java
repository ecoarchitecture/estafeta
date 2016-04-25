package com.estafeta.item.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * 
 */
@Entity
public class Edificio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public Edificio() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long idEdificio;

	/**
	 * 
	 */
	public String descripcion;

	/**
	 * 
	 */
	@ManyToOne
	@JoinColumn(name = "idTipoEdificio")
	public TipoEdificio tipoEdificion;

	/**
	 * 
	 */
	@ManyToOne
	@JoinColumn(name = "idAnden")
	public Anden anden;

	/**
	 * 
	 */
	@ManyToOne
	@JoinColumn(name = "idDireccion")
	public Direccion direccion;

	/**
	 * @return the idEdificio
	 */
	public Long getIdEdificio() {
		return idEdificio;
	}

	/**
	 * @param idEdificio the idEdificio to set
	 */
	public void setIdEdificio(Long idEdificio) {
		this.idEdificio = idEdificio;
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
	 * @return the tipoEdificion
	 */
	public TipoEdificio getTipoEdificion() {
		return tipoEdificion;
	}

	/**
	 * @param tipoEdificion the tipoEdificion to set
	 */
	public void setTipoEdificion(TipoEdificio tipoEdificion) {
		this.tipoEdificion = tipoEdificion;
	}

	/**
	 * @return the anden
	 */
	public Anden getAnden() {
		return anden;
	}

	/**
	 * @param anden the anden to set
	 */
	public void setAnden(Anden anden) {
		this.anden = anden;
	}

	/**
	 * @return the direccion
	 */
	public Direccion getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}














}