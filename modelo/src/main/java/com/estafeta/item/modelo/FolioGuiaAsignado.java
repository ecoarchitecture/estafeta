package com.estafeta.item.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * 
 */
@Entity
public class FolioGuiaAsignado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public FolioGuiaAsignado() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long idFoliosGuiaAsignados;

	/**
	 * 
	 */
	public String numeroFolio;

	/**
	 * 
	 */
	public String numeroGuia;
	
	
	/**
	 * 
	 */
	@ManyToOne
	@JoinColumn(name="idContrato")
	public Contrato contrato;

	/**
	 * @return the idFoliosGuiaAsignados
	 */
	public Long getIdFoliosGuiaAsignados() {
		return idFoliosGuiaAsignados;
	}

	/**
	 * @param idFoliosGuiaAsignados the idFoliosGuiaAsignados to set
	 */
	public void setIdFoliosGuiaAsignados(Long idFoliosGuiaAsignados) {
		this.idFoliosGuiaAsignados = idFoliosGuiaAsignados;
	}

	/**
	 * @return the numeroFolio
	 */
	public String getNumeroFolio() {
		return numeroFolio;
	}

	/**
	 * @param numeroFolio the numeroFolio to set
	 */
	public void setNumeroFolio(String numeroFolio) {
		this.numeroFolio = numeroFolio;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idFoliosGuiaAsignados == null) ? 0 : idFoliosGuiaAsignados.hashCode());
		result = prime * result + ((numeroFolio == null) ? 0 : numeroFolio.hashCode());
		result = prime * result + ((numeroGuia == null) ? 0 : numeroGuia.hashCode());
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
		FolioGuiaAsignado other = (FolioGuiaAsignado) obj;
		if (idFoliosGuiaAsignados == null) {
			if (other.idFoliosGuiaAsignados != null)
				return false;
		} else if (!idFoliosGuiaAsignados.equals(other.idFoliosGuiaAsignados))
			return false;
		if (numeroFolio == null) {
			if (other.numeroFolio != null)
				return false;
		} else if (!numeroFolio.equals(other.numeroFolio))
			return false;
		if (numeroGuia == null) {
			if (other.numeroGuia != null)
				return false;
		} else if (!numeroGuia.equals(other.numeroGuia))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FolioGuiaAsignado [idFoliosGuiaAsignados=" + idFoliosGuiaAsignados + ", numeroFolio=" + numeroFolio
				+ ", numeroGuia=" + numeroGuia + "]";
	}


}