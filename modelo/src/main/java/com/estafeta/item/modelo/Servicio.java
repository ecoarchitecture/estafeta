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
public class Servicio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public Servicio() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long idServicio;

	/**
	 * 
	 */
	public String descripcion;

	/**
	 * 
	 */
	@ManyToOne
	public ModalidadPago modalidadPago;

	/**
	 * 
	 */
	@ManyToOne
	public Seguro seguro;

	/**
	 * 
	 */
	@ManyToOne
	public ServicioAdicional servicioAdicional;

	/**
	 * 
	 */
	@ManyToOne
	public Producto producto;

	/**
	 * 
	 */
	@ManyToOne
	public GarantiaTiempoEntrega garantias;

	/**
	 * @return the idServicio
	 */
	public Long getIdServicio() {
		return idServicio;
	}

	/**
	 * @param idServicio the idServicio to set
	 */
	public void setIdServicio(Long idServicio) {
		this.idServicio = idServicio;
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
	 * @return the modalidadPago
	 */
	public ModalidadPago getModalidadPago() {
		return modalidadPago;
	}

	/**
	 * @param modalidadPago the modalidadPago to set
	 */
	public void setModalidadPago(ModalidadPago modalidadPago) {
		this.modalidadPago = modalidadPago;
	}

	/**
	 * @return the seguro
	 */
	public Seguro getSeguro() {
		return seguro;
	}

	/**
	 * @param seguro the seguro to set
	 */
	public void setSeguro(Seguro seguro) {
		this.seguro = seguro;
	}

	/**
	 * @return the servicioAdicional
	 */
	public ServicioAdicional getServicioAdicional() {
		return servicioAdicional;
	}

	/**
	 * @param servicioAdicional the servicioAdicional to set
	 */
	public void setServicioAdicional(ServicioAdicional servicioAdicional) {
		this.servicioAdicional = servicioAdicional;
	}

	/**
	 * @return the producto
	 */
	public Producto getProducto() {
		return producto;
	}

	/**
	 * @param producto the producto to set
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	/**
	 * @return the garantias
	 */
	public GarantiaTiempoEntrega getGarantias() {
		return garantias;
	}

	/**
	 * @param garantias the garantias to set
	 */
	public void setGarantias(GarantiaTiempoEntrega garantias) {
		this.garantias = garantias;
	}

}