package com.estafeta.item.modelo;

import java.io.Serializable;
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
 * Contrato contiene la información del contraro asociado a un cliente.
 */
@Entity
public class Contrato implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public Contrato() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long idContrato;

	/**
	 * 
	 */
	@OneToMany(cascade={CascadeType.ALL}, mappedBy = "contrato" )
	public Set<FolioGuiaAsignado> folioGuiaAsignados;

	/**
	 * 
	 */
	@ManyToOne
	public TipoContrato tipoContrato;
	
	
	@ManyToOne
	@JoinColumn(name="idCliente")
	public Cliente cliente;
	
	
	

	/**
	 * @return the idContrato
	 */
	public Long getIdContrato() {
		return idContrato;
	}

	/**
	 * @param idContrato the idContrato to set
	 */
	public void setIdContrato(Long idContrato) {
		this.idContrato = idContrato;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the folioGuiaAsignados
	 */
	public Set<FolioGuiaAsignado> getFolioGuiaAsignados() {
		return folioGuiaAsignados;
	}

	/**
	 * @param folioGuiaAsignados the folioGuiaAsignados to set
	 */
	public void setFolioGuiaAsignados(Set<FolioGuiaAsignado> folioGuiaAsignados) {
		this.folioGuiaAsignados = folioGuiaAsignados;
	}

	/**
	 * @return the tipoContrato
	 */
	public TipoContrato getTipoContrato() {
		return tipoContrato;
	}

	/**
	 * @param tipoContrato the tipoContrato to set
	 */
	public void setTipoContrato(TipoContrato tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((folioGuiaAsignados == null) ? 0 : folioGuiaAsignados.hashCode());
		result = prime * result + ((idContrato == null) ? 0 : idContrato.hashCode());
		result = prime * result + ((tipoContrato == null) ? 0 : tipoContrato.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contrato other = (Contrato) obj;
		if (folioGuiaAsignados == null) {
			if (other.folioGuiaAsignados != null)
				return false;
		} else if (!folioGuiaAsignados.equals(other.folioGuiaAsignados))
			return false;
		if (idContrato == null) {
			if (other.idContrato != null)
				return false;
		} else if (!idContrato.equals(other.idContrato))
			return false;
		if (tipoContrato == null) {
			if (other.tipoContrato != null)
				return false;
		} else if (!tipoContrato.equals(other.tipoContrato))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Contrato [idContrato=" + idContrato + ", folioGuiaAsignados=" + folioGuiaAsignados + ", tipoContrato="
				+ tipoContrato +  "]";
	}

}