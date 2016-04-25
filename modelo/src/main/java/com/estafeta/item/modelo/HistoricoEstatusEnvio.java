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
public class HistoricoEstatusEnvio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public HistoricoEstatusEnvio() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long idHistoricoEstatusEnvio;

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
	public EstatusEnvio estatusEnvio;

	/**
	 * @return the idHistoricoEstatusEnvio
	 */
	public Long getIdHistoricoEstatusEnvio() {
		return idHistoricoEstatusEnvio;
	}

	/**
	 * @param idHistoricoEstatusEnvio the idHistoricoEstatusEnvio to set
	 */
	public void setIdHistoricoEstatusEnvio(Long idHistoricoEstatusEnvio) {
		this.idHistoricoEstatusEnvio = idHistoricoEstatusEnvio;
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
	 * @return the estatusEnvio
	 */
	public EstatusEnvio getEstatusEnvio() {
		return estatusEnvio;
	}

	/**
	 * @param estatusEnvio the estatusEnvio to set
	 */
	public void setEstatusEnvio(EstatusEnvio estatusEnvio) {
		this.estatusEnvio = estatusEnvio;
	}

}