package com.estafeta.unidadTransporte.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * 
 */
@Entity
public class UnidadTransporte implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public UnidadTransporte() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long idUnidadTransporte;

	/**
	 * 
	 */
	public String numeroPlaca;

	/**
	 * 
	 */
	public String tarjetaCirculacion;

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
	public Set<AsignacionItinerarioRuta> asignacionItinerarioRuta;

	/**
	 * 
	 */
	@OneToMany
	public Set<HistoricoEstatusUnidadTransporte> historicoEstatusUnidadTransporte;

	/**
	 * 
	 */
	@OneToMany
	public Set<SubtipoUnidadTransporte> subtipoUnidadTransporte;

	/**
	 * @return the idUnidadTransporte
	 */
	public Long getIdUnidadTransporte() {
		return idUnidadTransporte;
	}

	/**
	 * @param idUnidadTransporte the idUnidadTransporte to set
	 */
	public void setIdUnidadTransporte(Long idUnidadTransporte) {
		this.idUnidadTransporte = idUnidadTransporte;
	}

	/**
	 * @return the numeroPlaca
	 */
	public String getNumeroPlaca() {
		return numeroPlaca;
	}

	/**
	 * @param numeroPlaca the numeroPlaca to set
	 */
	public void setNumeroPlaca(String numeroPlaca) {
		this.numeroPlaca = numeroPlaca;
	}

	/**
	 * @return the tarjetaCirculacion
	 */
	public String getTarjetaCirculacion() {
		return tarjetaCirculacion;
	}

	/**
	 * @param tarjetaCirculacion the tarjetaCirculacion to set
	 */
	public void setTarjetaCirculacion(String tarjetaCirculacion) {
		this.tarjetaCirculacion = tarjetaCirculacion;
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
	 * @return the asignacionItinerarioRuta
	 */
	public Set<AsignacionItinerarioRuta> getAsignacionItinerarioRuta() {
		return asignacionItinerarioRuta;
	}

	/**
	 * @param asignacionItinerarioRuta the asignacionItinerarioRuta to set
	 */
	public void setAsignacionItinerarioRuta(Set<AsignacionItinerarioRuta> asignacionItinerarioRuta) {
		this.asignacionItinerarioRuta = asignacionItinerarioRuta;
	}

	/**
	 * @return the historicoEstatusUnidadTransporte
	 */
	public Set<HistoricoEstatusUnidadTransporte> getHistoricoEstatusUnidadTransporte() {
		return historicoEstatusUnidadTransporte;
	}

	/**
	 * @param historicoEstatusUnidadTransporte the historicoEstatusUnidadTransporte to set
	 */
	public void setHistoricoEstatusUnidadTransporte(
			Set<HistoricoEstatusUnidadTransporte> historicoEstatusUnidadTransporte) {
		this.historicoEstatusUnidadTransporte = historicoEstatusUnidadTransporte;
	}

	/**
	 * @return the subtipoUnidadTransporte
	 */
	public Set<SubtipoUnidadTransporte> getSubtipoUnidadTransporte() {
		return subtipoUnidadTransporte;
	}

	/**
	 * @param subtipoUnidadTransporte the subtipoUnidadTransporte to set
	 */
	public void setSubtipoUnidadTransporte(Set<SubtipoUnidadTransporte> subtipoUnidadTransporte) {
		this.subtipoUnidadTransporte = subtipoUnidadTransporte;
	}

}