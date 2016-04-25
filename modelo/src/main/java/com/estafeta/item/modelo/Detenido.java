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
public class Detenido extends ItenerarioEnvio {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public Detenido() {
	}

	/**
	 * 
	 */
	public Date fechaEntrada;

	/**
	 * 
	 */
	public Date fechaSalida;

	/**
	 * 
	 */
	@ManyToOne
	public Edificio edificio;

	/**
	 * @return the fechaEntrada
	 */
	public Date getFechaEntrada() {
		return fechaEntrada;
	}

	/**
	 * @param fechaEntrada the fechaEntrada to set
	 */
	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	/**
	 * @return the fechaSalida
	 */
	public Date getFechaSalida() {
		return fechaSalida;
	}

	/**
	 * @param fechaSalida the fechaSalida to set
	 */
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	/**
	 * @return the edificio
	 */
	public Edificio getEdificio() {
		return edificio;
	}

	/**
	 * @param edificio the edificio to set
	 */
	public void setEdificio(Edificio edificio) {
		this.edificio = edificio;
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