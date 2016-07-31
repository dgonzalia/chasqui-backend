package ar.edu.unq.chasqui.service.rest.response;

import java.io.Serializable;

import ar.edu.unq.chasqui.model.ProductoPedido;

public class ProductoPedidoResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4476615487794072597L;
	
	private String nombre;
	private Double precio;
	private Integer cantidad;
	private String imagen;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	
	public ProductoPedidoResponse(){}
	public ProductoPedidoResponse(ProductoPedido p){
		imagen = p.getImagen();
		cantidad = p.getCantidad();
		precio = p.getPrecio();
		nombre = p.getNombreProducto() +" "+ p.getNombreVariante();
	}
	
	
	
	
	
	
	
}
