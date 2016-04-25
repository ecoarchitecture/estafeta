package com.estafeta.item.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * 
 */
@Entity
public class HistoricoEstatusSolicituServicio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public HistoricoEstatusSolicituServicio() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long idHistoricoEstatusSolicitudServicio;

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
	public EstatusSolicitudServicio estatusSolicitudServicio;

	/**
	 * @return the idHistoricoEstatusSolicitudServicio
	 */
	public Long getIdHistoricoEstatusSolicitudServicio() {
		return idHistoricoEstatusSolicitudServicio;
	}

	/**
	 * @param idHistoricoEstatusSolicitudServicio the idHistoricoEstatusSolicitudServicio to set
	 */
	public void setIdHistoricoEstatusSolicitudServicio(Long idHistoricoEstatusSolicitudServicio) {
		this.idHistoricoEstatusSolicitudServicio = idHistoricoEstatusSolicitudServicio;
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
	 * @return the estatusSolicitudServicio
	 */
	public EstatusSolicitudServicio getEstatusSolicitudServicio() {
		return estatusSolicitudServicio;
	}

	/**
	 * @param estatusSolicitudServicio the estatusSolicitudServicio to set
	 */
	public void setEstatusSolicitudServicio(EstatusSolicitudServicio estatusSolicitudServicio) {
		this.estatusSolicitudServicio = estatusSolicitudServicio;
	}

}