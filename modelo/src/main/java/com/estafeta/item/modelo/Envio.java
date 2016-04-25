package com.estafeta.item.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * 
 */
@Entity
public class Envio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public Envio() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long idEnvio;

	/**
	 * 
	 */
	public String numeroGuia;

	/**
	 * 
	 */
	public Date fechaInicio;

	/**
	 * 
	 */
	public Date fechaInicioRegistro;

	/**
	 * 
	 */
	public Date fechaFin;

	/**
	 * 
	 */
	public Date fechaFinRegistrado;

	/**
	 * 
	 */
	@ManyToOne
	public Item item;

	/**
	 * 
	 */
	@OneToMany
	public Set<HistoricoEstatusEnvio> historicoEstatusEnvio;

	/**
	 * 
	 */
	
//	public Set<ItenerarioEnvio> itenerarioEnvios;
	@OneToMany(mappedBy = "envio")
	public Set<EnMovimiento> enMovimiento;
	
	@OneToMany(mappedBy = "envio")
	public Set<Detenido> detenido;
	
	/**
	 * @return the enMovimiento
	 */
	public Set<EnMovimiento> getEnMovimiento() {
		return enMovimiento;
	}

	/**
	 * @param enMovimiento the enMovimiento to set
	 */
	public void setEnMovimiento(Set<EnMovimiento> enMovimiento) {
		this.enMovimiento = enMovimiento;
	}

	/**
	 * @return the detenido
	 */
	public Set<Detenido> getDetenido() {
		return detenido;
	}

	/**
	 * @param detenido the detenido to set
	 */
	public void setDetenido(Set<Detenido> detenido) {
		this.detenido = detenido;
	}



	/**
	 * @return the idEnvio
	 */
	public Long getIdEnvio() {
		return idEnvio;
	}

	/**
	 * @param idEnvio the idEnvio to set
	 */
	public void setIdEnvio(Long idEnvio) {
		this.idEnvio = idEnvio;
	}

	/**
	 * @return the numeroGuia
	 */
	public String getNumeroGuia() {
		return numeroGuia;
	}

	/**
	 * @param numeroGuia the numeroGuia to set
	 */
	public void setNumeroGuia(String numeroGuia) {
		this.numeroGuia = numeroGuia;
	}

	/**
	 * @return the fechaInicio
	 */
	public Date getFechaInicio() {
		return fechaInicio;
	}

	/**
	 * @param fechaInicio the fechaInicio to set
	 */
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	/**
	 * @return the fechaInicioRegistro
	 */
	public Date getFechaInicioRegistro() {
		return fechaInicioRegistro;
	}

	/**
	 * @param fechaInicioRegistro the fechaInicioRegistro to set
	 */
	public void setFechaInicioRegistro(Date fechaInicioRegistro) {
		this.fechaInicioRegistro = fechaInicioRegistro;
	}

	/**
	 * @return the fechaFin
	 */
	public Date getFechaFin() {
		return fechaFin;
	}

	/**
	 * @param fechaFin the fechaFin to set
	 */
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	/**
	 * @return the fechaFinRegistrado
	 */
	public Date getFechaFinRegistrado() {
		return fechaFinRegistrado;
	}

	/**
	 * @param fechaFinRegistrado the fechaFinRegistrado to set
	 */
	public void setFechaFinRegistrado(Date fechaFinRegistrado) {
		this.fechaFinRegistrado = fechaFinRegistrado;
	}

	/**
	 * @return the item
	 */
	public Item getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(Item item) {
		this.item = item;
	}

	/**
	 * @return the historicoEstatusEnvio
	 */
	public Set<HistoricoEstatusEnvio> getHistoricoEstatusEnvio() {
		return historicoEstatusEnvio;
	}

	/**
	 * @param historicoEstatusEnvio the historicoEstatusEnvio to set
	 */
	public void setHistoricoEstatusEnvio(Set<HistoricoEstatusEnvio> historicoEstatusEnvio) {
		this.historicoEstatusEnvio = historicoEstatusEnvio;
	}

//	/**
//	 * @return the itenerarioEnvios
//	 */
//	public Set<ItenerarioEnvio> getItenerarioEnvios() {
//		return itenerarioEnvios;
//	}
//
//	/**
//	 * @param itenerarioEnvios the itenerarioEnvios to set
//	 */
//	public void setItenerarioEnvios(Set<ItenerarioEnvio> itenerarioEnvios) {
//		this.itenerarioEnvios = itenerarioEnvios;
//	}

}