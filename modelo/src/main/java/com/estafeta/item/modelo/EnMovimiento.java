package com.estafeta.item.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

/**
 * 
 */
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class EnMovimiento extends ItenerarioEnvio {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public EnMovimiento() {
	}

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
	public Edificio destino;

	/**
	 * 
	 */
	@ManyToOne
	public Edificio origen;

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
	 * @return the idItenerarioEnvio
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getIdItenerarioEnvio() {
		return idItenerarioEnvio;
	}

	/**
	 * @param idItenerarioEnvio the idItenerarioEnvio to set
	 */
	public void setIdItenerarioEnvio(Long idItenerarioEnvio) {
		this.idItenerarioEnvio = idItenerarioEnvio;
	}
	
	/**
	 * @return the envio
	 */
	@ManyToOne
	public Envio getEnvio() {
		return envio;
	}


}