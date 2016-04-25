package com.estafeta.unidadTransporte.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * 
 */
@Entity
public class AsignacionItinerarioRuta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public AsignacionItinerarioRuta() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue
	public Long idAsignacionItinerarioRuta;

	/**
	 * 
	 */
	public Date fechaInicioAsignacion;

	/**
	 * 
	 */
	public Date fechaInicioAsignacionRegistro;

	/**
	 * 
	 */
	public Date fechaFinAsignacion;

	/**
	 * 
	 */
	public Date fechaFinAsignacionRegistro;


	/**
	 * 
	 */
	@OneToMany
	public Set<ItinerarioRuta> itinerarioRuta;

	/**
	 * 
	 */
	@OneToMany
	public Set<ItinerarioAsignacionRuta> itinerarioAsignacionRuta;

	/**
	 * 
	 */
	@OneToMany
	public Set<HistoricoEstatusAsignacionItinerarioRuta> historicoEstatus;

	/**
	 * @return the idAsignacionItinerarioRuta
	 */
	public Long getIdAsignacionItinerarioRuta() {
		return idAsignacionItinerarioRuta;
	}

	/**
	 * @param idAsignacionItinerarioRuta the idAsignacionItinerarioRuta to set
	 */
	public void setIdAsignacionItinerarioRuta(Long idAsignacionItinerarioRuta) {
		this.idAsignacionItinerarioRuta = idAsignacionItinerarioRuta;
	}

	/**
	 * @return the fechaInicioAsignacion
	 */
	public Date getFechaInicioAsignacion() {
		return fechaInicioAsignacion;
	}

	/**
	 * @param fechaInicioAsignacion the fechaInicioAsignacion to set
	 */
	public void setFechaInicioAsignacion(Date fechaInicioAsignacion) {
		this.fechaInicioAsignacion = fechaInicioAsignacion;
	}

	/**
	 * @return the fechaInicioAsignacionRegistro
	 */
	public Date getFechaInicioAsignacionRegistro() {
		return fechaInicioAsignacionRegistro;
	}

	/**
	 * @param fechaInicioAsignacionRegistro the fechaInicioAsignacionRegistro to set
	 */
	public void setFechaInicioAsignacionRegistro(Date fechaInicioAsignacionRegistro) {
		this.fechaInicioAsignacionRegistro = fechaInicioAsignacionRegistro;
	}

	/**
	 * @return the fechaFinAsignacion
	 */
	public Date getFechaFinAsignacion() {
		return fechaFinAsignacion;
	}

	/**
	 * @param fechaFinAsignacion the fechaFinAsignacion to set
	 */
	public void setFechaFinAsignacion(Date fechaFinAsignacion) {
		this.fechaFinAsignacion = fechaFinAsignacion;
	}

	/**
	 * @return the fechaFinAsignacionRegistro
	 */
	public Date getFechaFinAsignacionRegistro() {
		return fechaFinAsignacionRegistro;
	}

	/**
	 * @param fechaFinAsignacionRegistro the fechaFinAsignacionRegistro to set
	 */
	public void setFechaFinAsignacionRegistro(Date fechaFinAsignacionRegistro) {
		this.fechaFinAsignacionRegistro = fechaFinAsignacionRegistro;
	}

	/**
	 * @return the itinerarioRuta
	 */
	public Set<ItinerarioRuta> getItinerarioRuta() {
		return itinerarioRuta;
	}

	/**
	 * @param itinerarioRuta the itinerarioRuta to set
	 */
	public void setItinerarioRuta(Set<ItinerarioRuta> itinerarioRuta) {
		this.itinerarioRuta = itinerarioRuta;
	}

	/**
	 * @return the itinerarioAsignacionRuta
	 */
	public Set<ItinerarioAsignacionRuta> getItinerarioAsignacionRuta() {
		return itinerarioAsignacionRuta;
	}

	/**
	 * @param itinerarioAsignacionRuta the itinerarioAsignacionRuta to set
	 */
	public void setItinerarioAsignacionRuta(Set<ItinerarioAsignacionRuta> itinerarioAsignacionRuta) {
		this.itinerarioAsignacionRuta = itinerarioAsignacionRuta;
	}

	/**
	 * @return the historicoEstatus
	 */
	public Set<HistoricoEstatusAsignacionItinerarioRuta> getHistoricoEstatus() {
		return historicoEstatus;
	}

	/**
	 * @param historicoEstatus the historicoEstatus to set
	 */
	public void setHistoricoEstatus(Set<HistoricoEstatusAsignacionItinerarioRuta> historicoEstatus) {
		this.historicoEstatus = historicoEstatus;
	}

}