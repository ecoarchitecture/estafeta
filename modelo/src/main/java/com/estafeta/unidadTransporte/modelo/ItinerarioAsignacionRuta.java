package com.estafeta.unidadTransporte.modelo;

import java.io.Serializable;
import java.util.Date;

import com.estafeta.item.modelo.Edificio;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * 
 */
@Entity
public class ItinerarioAsignacionRuta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public ItinerarioAsignacionRuta() {
	}

	
	/**
	 * 
	 */
	@Id
	@GeneratedValue
	public Long idItinerarioAsignacionRuta;
	
	/**
	 * 
	 */
	public Date fechaEntrada;

	/**
	 * 
	 */
	public Date fechaEntradaRegistro;

	/**
	 * 
	 */
	public Date fechaSalida;

	/**
	 * 
	 */
	public Date fechaSalidaRegistrado;

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
	 * @return the fechaEntradaRegistro
	 */
	public Date getFechaEntradaRegistro() {
		return fechaEntradaRegistro;
	}

	/**
	 * @param fechaEntradaRegistro the fechaEntradaRegistro to set
	 */
	public void setFechaEntradaRegistro(Date fechaEntradaRegistro) {
		this.fechaEntradaRegistro = fechaEntradaRegistro;
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
	 * @return the fechaSalidaRegistrado
	 */
	public Date getFechaSalidaRegistrado() {
		return fechaSalidaRegistrado;
	}

	/**
	 * @param fechaSalidaRegistrado the fechaSalidaRegistrado to set
	 */
	public void setFechaSalidaRegistrado(Date fechaSalidaRegistrado) {
		this.fechaSalidaRegistrado = fechaSalidaRegistrado;
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

	/**
	 * @return the idItinerarioAsignacionRuta
	 */
	public Long getIdItinerarioAsignacionRuta() {
		return idItinerarioAsignacionRuta;
	}

	/**
	 * @param idItinerarioAsignacionRuta the idItinerarioAsignacionRuta to set
	 */
	public void setIdItinerarioAsignacionRuta(Long idItinerarioAsignacionRuta) {
		this.idItinerarioAsignacionRuta = idItinerarioAsignacionRuta;
	}

}