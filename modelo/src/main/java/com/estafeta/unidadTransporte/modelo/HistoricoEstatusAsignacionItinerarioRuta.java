package com.estafeta.unidadTransporte.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * 
 */
@Entity
public class HistoricoEstatusAsignacionItinerarioRuta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public HistoricoEstatusAsignacionItinerarioRuta() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue
	public Long idHistoricoEstatusAsignacionItinerarioRuta;

	/**
	 * 
	 */
	public Date fechaInicioEstatus;

	/**
	 * 
	 */
	public Date fechaInicioEstatusRegistro;

	/**
	 * 
	 */
	public Date fechaFinEstatus;

	/**
	 * 
	 */
	public Date fechaFinEstatusRegistro;

	/**
	 * 
	 */
	@ManyToOne
	public EstatusAsignacionItinerarioRuta estatusAsignacionItinerarioRuta;

	/**
	 * 
	 */
	@ManyToOne
	public SubEstatusAsignacionItinerarioRuta subEstatusAsignacionItinerarioRuta;

	/**
	 * @return the idHistoricoEstatusAsignacionItinerarioRuta
	 */
	public Long getIdHistoricoEstatusAsignacionItinerarioRuta() {
		return idHistoricoEstatusAsignacionItinerarioRuta;
	}

	/**
	 * @param idHistoricoEstatusAsignacionItinerarioRuta the idHistoricoEstatusAsignacionItinerarioRuta to set
	 */
	public void setIdHistoricoEstatusAsignacionItinerarioRuta(Long idHistoricoEstatusAsignacionItinerarioRuta) {
		this.idHistoricoEstatusAsignacionItinerarioRuta = idHistoricoEstatusAsignacionItinerarioRuta;
	}

	/**
	 * @return the fechaInicioEstatus
	 */
	public Date getFechaInicioEstatus() {
		return fechaInicioEstatus;
	}

	/**
	 * @param fechaInicioEstatus the fechaInicioEstatus to set
	 */
	public void setFechaInicioEstatus(Date fechaInicioEstatus) {
		this.fechaInicioEstatus = fechaInicioEstatus;
	}

	/**
	 * @return the fechaInicioEstatusRegistro
	 */
	public Date getFechaInicioEstatusRegistro() {
		return fechaInicioEstatusRegistro;
	}

	/**
	 * @param fechaInicioEstatusRegistro the fechaInicioEstatusRegistro to set
	 */
	public void setFechaInicioEstatusRegistro(Date fechaInicioEstatusRegistro) {
		this.fechaInicioEstatusRegistro = fechaInicioEstatusRegistro;
	}

	/**
	 * @return the fechaFinEstatus
	 */
	public Date getFechaFinEstatus() {
		return fechaFinEstatus;
	}

	/**
	 * @param fechaFinEstatus the fechaFinEstatus to set
	 */
	public void setFechaFinEstatus(Date fechaFinEstatus) {
		this.fechaFinEstatus = fechaFinEstatus;
	}

	/**
	 * @return the fechaFinEstatusRegistro
	 */
	public Date getFechaFinEstatusRegistro() {
		return fechaFinEstatusRegistro;
	}

	/**
	 * @param fechaFinEstatusRegistro the fechaFinEstatusRegistro to set
	 */
	public void setFechaFinEstatusRegistro(Date fechaFinEstatusRegistro) {
		this.fechaFinEstatusRegistro = fechaFinEstatusRegistro;
	}

	/**
	 * @return the estatusAsignacionItinerarioRuta
	 */
	public EstatusAsignacionItinerarioRuta getEstatusAsignacionItinerarioRuta() {
		return estatusAsignacionItinerarioRuta;
	}

	/**
	 * @param estatusAsignacionItinerarioRuta the estatusAsignacionItinerarioRuta to set
	 */
	public void setEstatusAsignacionItinerarioRuta(EstatusAsignacionItinerarioRuta estatusAsignacionItinerarioRuta) {
		this.estatusAsignacionItinerarioRuta = estatusAsignacionItinerarioRuta;
	}

	/**
	 * @return the subEstatusAsignacionItinerarioRuta
	 */
	public SubEstatusAsignacionItinerarioRuta getSubEstatusAsignacionItinerarioRuta() {
		return subEstatusAsignacionItinerarioRuta;
	}

	/**
	 * @param subEstatusAsignacionItinerarioRuta the subEstatusAsignacionItinerarioRuta to set
	 */
	public void setSubEstatusAsignacionItinerarioRuta(
			SubEstatusAsignacionItinerarioRuta subEstatusAsignacionItinerarioRuta) {
		this.subEstatusAsignacionItinerarioRuta = subEstatusAsignacionItinerarioRuta;
	}

}