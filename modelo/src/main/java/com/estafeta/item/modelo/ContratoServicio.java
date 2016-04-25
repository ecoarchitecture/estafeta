package com.estafeta.item.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * ContratoServicio es la relación entre <code>Contrato</code> y <code> Servicio </code>.
 */
@Entity
public class ContratoServicio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public ContratoServicio() {
	}

	
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long numItemsContratados;

	/**
	 * 
	 */
	public BigDecimal pesoAmparadoPorItem;

	/**
	 * 
	 */
	@ManyToOne
	@JoinColumn(name="idServicio")
	public Servicio servicio;

	/**
	 * 
	 */
	@ManyToOne
	@JoinColumn(name="idContrato")
	public Contrato contrato;

	/**
	 * 
	 */
	@OneToMany(cascade={CascadeType.ALL})
	public Set<SolicitudServicio> solicitudServicio;

	/**
	 * @return the numItemsContratados
	 */
	public Long getNumItemsContratados() {
		return numItemsContratados;
	}

	/**
	 * @param numItemsContratados the numItemsContratados to set
	 */
	public void setNumItemsContratados(Long numItemsContratados) {
		this.numItemsContratados = numItemsContratados;
	}

	/**
	 * @return the peroAmparadoPorItem
	 */
	public BigDecimal getPeroAmparadoPorItem() {
		return pesoAmparadoPorItem;
	}

	/**
	 * @param peroAmparadoPorItem the peroAmparadoPorItem to set
	 */
	public void setPeroAmparadoPorItem(BigDecimal peroAmparadoPorItem) {
		this.pesoAmparadoPorItem = peroAmparadoPorItem;
	}

	/**
	 * @return the servicio
	 */
	public Servicio getServicio() {
		return servicio;
	}

	/**
	 * @param servicio the servicio to set
	 */
	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	/**
	 * @return the contrato
	 */
	public Contrato getContrato() {
		return contrato;
	}

	/**
	 * @param contrato the contrato to set
	 */
	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	/**
	 * @return the solicitudServicio
	 */
	public Set<SolicitudServicio> getSolicitudServicio() {
		return solicitudServicio;
	}

	/**
	 * @param solicitudServicio the solicitudServicio to set
	 */
	public void setSolicitudServicio(Set<SolicitudServicio> solicitudServicio) {
		this.solicitudServicio = solicitudServicio;
	}

}