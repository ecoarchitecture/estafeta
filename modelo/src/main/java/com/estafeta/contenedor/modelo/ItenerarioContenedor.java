package com.estafeta.contenedor.modelo;

import java.io.Serializable;
import java.util.Date;

import com.estafeta.item.modelo.Edificio;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * 
 */
@Entity
public class ItenerarioContenedor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public ItenerarioContenedor() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long idItenerarioContenedor;

	/**
	 * 
	 */
	public Date fechaCarga;

	/**
	 * 
	 */
	public Date fechaCargaRegistro;

	/**
	 * 
	 */
	public Date fechaDescarga;

	/**
	 * 
	 */
	public Date fechaDescargaRegistro;

	/**
	 * 
	 */
	@ManyToOne
	public Contenedor contenedor;

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
	 * @return the idItenerarioContenedor
	 */
	public Long getIdItenerarioContenedor() {
		return idItenerarioContenedor;
	}

	/**
	 * @param idItenerarioContenedor the idItenerarioContenedor to set
	 */
	public void setIdItenerarioContenedor(Long idItenerarioContenedor) {
		this.idItenerarioContenedor = idItenerarioContenedor;
	}

	/**
	 * @return the fechaCarga
	 */
	public Date getFechaCarga() {
		return fechaCarga;
	}

	/**
	 * @param fechaCarga the fechaCarga to set
	 */
	public void setFechaCarga(Date fechaCarga) {
		this.fechaCarga = fechaCarga;
	}

	/**
	 * @return the fechaCargaRegistro
	 */
	public Date getFechaCargaRegistro() {
		return fechaCargaRegistro;
	}

	/**
	 * @param fechaCargaRegistro the fechaCargaRegistro to set
	 */
	public void setFechaCargaRegistro(Date fechaCargaRegistro) {
		this.fechaCargaRegistro = fechaCargaRegistro;
	}

	/**
	 * @return the fechaDescarga
	 */
	public Date getFechaDescarga() {
		return fechaDescarga;
	}

	/**
	 * @param fechaDescarga the fechaDescarga to set
	 */
	public void setFechaDescarga(Date fechaDescarga) {
		this.fechaDescarga = fechaDescarga;
	}

	/**
	 * @return the fechaDescargaRegistro
	 */
	public Date getFechaDescargaRegistro() {
		return fechaDescargaRegistro;
	}

	/**
	 * @param fechaDescargaRegistro the fechaDescargaRegistro to set
	 */
	public void setFechaDescargaRegistro(Date fechaDescargaRegistro) {
		this.fechaDescargaRegistro = fechaDescargaRegistro;
	}

	/**
	 * @return the contenedor
	 */
	public Contenedor getContenedor() {
		return contenedor;
	}

	/**
	 * @param contenedor the contenedor to set
	 */
	public void setContenedor(Contenedor contenedor) {
		this.contenedor = contenedor;
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