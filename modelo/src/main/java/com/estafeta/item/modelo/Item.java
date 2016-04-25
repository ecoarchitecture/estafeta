package com.estafeta.item.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
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
public class Item implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public Item() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long idItem;

	/**
	 * 
	 */
	public BigDecimal peso;

	/**
	 * 
	 */
	public BigDecimal largo;

	/**
	 * 
	 */
	public BigDecimal alto;

	/**
	 * 
	 */
	public BigDecimal ancho;

	
	
	/**
	 * 
	 */
	public String descripcion;

	/**
	 * 
	 */
	public String nombreReceptor;

	/**
	 * 
	 */
	@OneToMany(mappedBy = "item")
	public Set<Envio> envios;

	/**
	 * 
	 */
	@ManyToOne
	public TipoEnvoltura tipoEnvoltura;

	/**
	 * 
	 */
	@OneToMany
	public Set<HistoricoEstatusItem> historicoEstatusItem;

	/**
	 * @return the idItem
	 */
	public Long getIdItem() {
		return idItem;
	}

	/**
	 * @param idItem the idItem to set
	 */
	public void setIdItem(Long idItem) {
		this.idItem = idItem;
	}

	/**
	 * @return the peso
	 */
	public BigDecimal getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	/**
	 * @return the largo
	 */
	public BigDecimal getLargo() {
		return largo;
	}

	/**
	 * @param largo the largo to set
	 */
	public void setLargo(BigDecimal largo) {
		this.largo = largo;
	}

	/**
	 * @return the alto
	 */
	public BigDecimal getAlto() {
		return alto;
	}

	/**
	 * @param alto the alto to set
	 */
	public void setAlto(BigDecimal alto) {
		this.alto = alto;
	}

	/**
	 * @return the ancho
	 */
	public BigDecimal getAncho() {
		return ancho;
	}

	/**
	 * @param ancho the ancho to set
	 */
	public void setAncho(BigDecimal ancho) {
		this.ancho = ancho;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the nombreReceptor
	 */
	public String getNombreReceptor() {
		return nombreReceptor;
	}

	/**
	 * @param nombreReceptor the nombreReceptor to set
	 */
	public void setNombreReceptor(String nombreReceptor) {
		this.nombreReceptor = nombreReceptor;
	}

	/**
	 * @return the envios
	 */
	public Set<Envio> getEnvios() {
		return envios;
	}

	/**
	 * @param envios the envios to set
	 */
	public void setEnvios(Set<Envio> envios) {
		this.envios = envios;
	}

	/**
	 * @return the tipoEnvoltura
	 */
	public TipoEnvoltura getTipoEnvoltura() {
		return tipoEnvoltura;
	}

	/**
	 * @param tipoEnvoltura the tipoEnvoltura to set
	 */
	public void setTipoEnvoltura(TipoEnvoltura tipoEnvoltura) {
		this.tipoEnvoltura = tipoEnvoltura;
	}

	/**
	 * @return the historicoEstatusItem
	 */
	public Set<HistoricoEstatusItem> getHistoricoEstatusItem() {
		return historicoEstatusItem;
	}

	/**
	 * @param historicoEstatusItem the historicoEstatusItem to set
	 */
	public void setHistoricoEstatusItem(Set<HistoricoEstatusItem> historicoEstatusItem) {
		this.historicoEstatusItem = historicoEstatusItem;
	}

}