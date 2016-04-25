package com.estafeta.contenedor.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.estafeta.item.modelo.EnMovimiento;

/**
 * 
 */
@Entity
public class Contenedor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public Contenedor() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long idContenedor;

	/**
	 * 
	 */
	public Date fechaAlta;

	/**
	 * 
	 */
	public Date fechaAltaRegistro;

	/**
	 * 
	 */
	public Date fechaBaja;

	/**
	 * 
	 */
	public Date fechaBajaRegistro;

	/**
	 * 
	 */
	@OneToMany
	public Set<EnMovimiento> movimientoEnvio;

	/**
	 * 
	 */
	@OneToMany
	public Set<HistoricoEstatusContenedor> historicoEstatusContenedor;

	/**
	 * 
	 */
	@OneToMany(mappedBy = "contenedor")
	public Set<ItenerarioContenedor> itinerarioContenedores;

	/**
	 * @return the idContenedor
	 */
	public Long getIdContenedor() {
		return idContenedor;
	}

	/**
	 * @param idContenedor the idContenedor to set
	 */
	public void setIdContenedor(Long idContenedor) {
		this.idContenedor = idContenedor;
	}

	/**
	 * @return the fechaAlta
	 */
	public Date getFechaAlta() {
		return fechaAlta;
	}

	/**
	 * @param fechaAlta the fechaAlta to set
	 */
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	/**
	 * @return the fechaAltaRegistro
	 */
	public Date getFechaAltaRegistro() {
		return fechaAltaRegistro;
	}

	/**
	 * @param fechaAltaRegistro the fechaAltaRegistro to set
	 */
	public void setFechaAltaRegistro(Date fechaAltaRegistro) {
		this.fechaAltaRegistro = fechaAltaRegistro;
	}

	/**
	 * @return the fechaBaja
	 */
	public Date getFechaBaja() {
		return fechaBaja;
	}

	/**
	 * @param fechaBaja the fechaBaja to set
	 */
	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	/**
	 * @return the fechaBajaRegistro
	 */
	public Date getFechaBajaRegistro() {
		return fechaBajaRegistro;
	}

	/**
	 * @param fechaBajaRegistro the fechaBajaRegistro to set
	 */
	public void setFechaBajaRegistro(Date fechaBajaRegistro) {
		this.fechaBajaRegistro = fechaBajaRegistro;
	}

	/**
	 * @return the movimientoEnvio
	 */
	public Set<EnMovimiento> getMovimientoEnvio() {
		return movimientoEnvio;
	}

	/**
	 * @param movimientoEnvio the movimientoEnvio to set
	 */
	public void setMovimientoEnvio(Set<EnMovimiento> movimientoEnvio) {
		this.movimientoEnvio = movimientoEnvio;
	}

	/**
	 * @return the historicoEstatusContenedor
	 */
	public Set<HistoricoEstatusContenedor> getHistoricoEstatusContenedor() {
		return historicoEstatusContenedor;
	}

	/**
	 * @param historicoEstatusContenedor the historicoEstatusContenedor to set
	 */
	public void setHistoricoEstatusContenedor(Set<HistoricoEstatusContenedor> historicoEstatusContenedor) {
		this.historicoEstatusContenedor = historicoEstatusContenedor;
	}

	/**
	 * @return the itinerarioContenedores
	 */
	public Set<ItenerarioContenedor> getItinerarioContenedores() {
		return itinerarioContenedores;
	}

	/**
	 * @param itinerarioContenedores the itinerarioContenedores to set
	 */
	public void setItinerarioContenedores(Set<ItenerarioContenedor> itinerarioContenedores) {
		this.itinerarioContenedores = itinerarioContenedores;
	}

}