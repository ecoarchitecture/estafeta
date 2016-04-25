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
public class HistoricoEstatusUnidadTransporte implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public HistoricoEstatusUnidadTransporte() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue
	public Long idHistoricoEstatusUnidadTransporte;

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
	public EstatusUnidadTransporte estatusUnidadTransporte;

	/**
	 * 
	 */
	@ManyToOne
	public SubEstatusUnidadTransporte subEstatusUnidadTransporte;

	/**
	 * @return the idHistoricoEstatusUnidadTransporte
	 */
	public Long getIdHistoricoEstatusUnidadTransporte() {
		return idHistoricoEstatusUnidadTransporte;
	}

	/**
	 * @param idHistoricoEstatusUnidadTransporte the idHistoricoEstatusUnidadTransporte to set
	 */
	public void setIdHistoricoEstatusUnidadTransporte(Long idHistoricoEstatusUnidadTransporte) {
		this.idHistoricoEstatusUnidadTransporte = idHistoricoEstatusUnidadTransporte;
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
	 * @return the estatusUnidadTransporte
	 */
	public EstatusUnidadTransporte getEstatusUnidadTransporte() {
		return estatusUnidadTransporte;
	}

	/**
	 * @param estatusUnidadTransporte the estatusUnidadTransporte to set
	 */
	public void setEstatusUnidadTransporte(EstatusUnidadTransporte estatusUnidadTransporte) {
		this.estatusUnidadTransporte = estatusUnidadTransporte;
	}

	/**
	 * @return the subEstatusUnidadTransporte
	 */
	public SubEstatusUnidadTransporte getSubEstatusUnidadTransporte() {
		return subEstatusUnidadTransporte;
	}

	/**
	 * @param subEstatusUnidadTransporte the subEstatusUnidadTransporte to set
	 */
	public void setSubEstatusUnidadTransporte(SubEstatusUnidadTransporte subEstatusUnidadTransporte) {
		this.subEstatusUnidadTransporte = subEstatusUnidadTransporte;
	}

}