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
public class Plaza implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public Plaza() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long idPlaza;

	/**
	 * 
	 */
	public String descripcion;
	
	
	@ManyToOne
	 @JoinColumn(name = "idAsentamiento")
	 private Asentamiento asentamiento;

	/**
	 * @return the idPlaza
	 */
	public Long getIdPlaza() {
		return idPlaza;
	}

	/**
	 * @param idPlaza the idPlaza to set
	 */
	public void setIdPlaza(Long idPlaza) {
		this.idPlaza = idPlaza;
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