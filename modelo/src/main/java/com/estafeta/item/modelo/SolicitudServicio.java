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
public class SolicitudServicio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public SolicitudServicio() {
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long numeroItemsPorServicio;

	/**
	 * 
	 */
	public Date fechaSolicitudServicio;

	/**
	 * 
	 */
	public Date fechaSolicitudServicioRegistro;

	/**
	 * 
	 */
	public Long numeroItems;

	/**
	 * 
	 */
	@OneToMany
	public Set<Item> items;

	/**
	 * 
	 */
	@ManyToOne
	public ContratoServicio contratoServicio;

	/**
	 * 
	 */
	@ManyToOne
	public Edificio remitente;

	/**
	 * 
	 */
	@ManyToOne
	public Edificio destinatario;

	/**
	 * 
	 */
	@OneToMany
	public Set<HistoricoEstatusSolicituServicio> historicoEstatusSolicitudServicio;

	/**
	 * @return the numeroItemsPorServicio
	 */
	public Long getNumeroItemsPorServicio() {
		return numeroItemsPorServicio;
	}

	/**
	 * @param numeroItemsPorServicio the numeroItemsPorServicio to set
	 */
	public void setNumeroItemsPorServicio(Long numeroItemsPorServicio) {
		this.numeroItemsPorServicio = numeroItemsPorServicio;
	}

	/**
	 * @return the fechaSolicitudServicio
	 */
	public Date getFechaSolicitudServicio() {
		return fechaSolicitudServicio;
	}

	/**
	 * @param fechaSolicitudServicio the fechaSolicitudServicio to set
	 */
	public void setFechaSolicitudServicio(Date fechaSolicitudServicio) {
		this.fechaSolicitudServicio = fechaSolicitudServicio;
	}

	/**
	 * @return the fechaSolicitudServicioRegistro
	 */
	public Date getFechaSolicitudServicioRegistro() {
		return fechaSolicitudServicioRegistro;
	}

	/**
	 * @param fechaSolicitudServicioRegistro the fechaSolicitudServicioRegistro to set
	 */
	public void setFechaSolicitudServicioRegistro(Date fechaSolicitudServicioRegistro) {
		this.fechaSolicitudServicioRegistro = fechaSolicitudServicioRegistro;
	}

	/**
	 * @return the numeroItems
	 */
	public Long getNumeroItems() {
		return numeroItems;
	}

	/**
	 * @param numeroItems the numeroItems to set
	 */
	public void setNumeroItems(Long numeroItems) {
		this.numeroItems = numeroItems;
	}

	/**
	 * @return the items
	 */
	public Set<Item> getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(Set<Item> items) {
		this.items = items;
	}

	/**
	 * @return the contratoServicio
	 */
	public ContratoServicio getContratoServicio() {
		return contratoServicio;
	}

	/**
	 * @param contratoServicio the contratoServicio to set
	 */
	public void setContratoServicio(ContratoServicio contratoServicio) {
		this.contratoServicio = contratoServicio;
	}

	/**
	 * @return the remitente
	 */
	public Edificio getRemitente() {
		return remitente;
	}

	/**
	 * @param remitente the remitente to set
	 */
	public void setRemitente(Edificio remitente) {
		this.remitente = remitente;
	}

	/**
	 * @return the destinatario
	 */
	public Edificio getDestinatario() {
		return destinatario;
	}

	/**
	 * @param destinatario the destinatario to set
	 */
	public void setDestinatario(Edificio destinatario) {
		this.destinatario = destinatario;
	}

	/**
	 * @return the historicoEstatusSolicitudServicio
	 */
	public Set<HistoricoEstatusSolicituServicio> getHistoricoEstatusSolicitudServicio() {
		return historicoEstatusSolicitudServicio;
	}

	/**
	 * @param historicoEstatusSolicitudServicio the historicoEstatusSolicitudServicio to set
	 */
	public void setHistoricoEstatusSolicitudServicio(
			Set<HistoricoEstatusSolicituServicio> historicoEstatusSolicitudServicio) {
		this.historicoEstatusSolicitudServicio = historicoEstatusSolicitudServicio;
	}

}