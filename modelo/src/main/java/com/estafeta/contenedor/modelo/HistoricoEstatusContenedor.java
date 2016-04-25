package com.estafeta.contenedor.modelo;

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
public class HistoricoEstatusContenedor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public HistoricoEstatusContenedor() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue
	public Long idHistoricoEstatusContenedor;

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
	public EstatusContenedor estatusContenedor;

	/**
	 * @return the idHistoricoEstatusContenedor
	 */
	public Long getIdHistoricoEstatusContenedor() {
		return idHistoricoEstatusContenedor;
	}

	/**
	 * @param idHistoricoEstatusContenedor the idHistoricoEstatusContenedor to set
	 */
	public void setIdHistoricoEstatusContenedor(Long idHistoricoEstatusContenedor) {
		this.idHistoricoEstatusContenedor = idHistoricoEstatusContenedor;
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
	 * @return the estatusContenedor
	 */
	public EstatusContenedor getEstatusContenedor() {
		return estatusContenedor;
	}

	/**
	 * @param estatusContenedor the estatusContenedor to set
	 */
	public void setEstatusContenedor(EstatusContenedor estatusContenedor) {
		this.estatusContenedor = estatusContenedor;
	}

}