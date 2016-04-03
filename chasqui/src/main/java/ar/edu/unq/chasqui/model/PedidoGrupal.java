package ar.edu.unq.chasqui.model;

import java.util.Date;

public class PedidoGrupal extends Pedido{
	
	private String descripcion;

	public PedidoGrupal(int i, String string, Date date, Double j, Double k,
			String estadoPedidoAbierto,Boolean alterable,String descripcion) {
		super(i, string, date, j, k, estadoPedidoAbierto,alterable);
		this.descripcion=descripcion;
	}
	
	//GETs & SETs
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}	
	
	
	//METHODS
	
	public void agregarMiembro () {
		//TODO
	}
	
	
}
