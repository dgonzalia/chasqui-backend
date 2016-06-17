package ar.edu.unq.chasqui.model;

import java.util.ArrayList;
import java.util.List;

public class Fabricante {

	private Integer id;
	private String nombre;
	private String calle;
	private Integer altura;
	private String pais;
	private String provincia;
	private String localidad;
	private String pathImagen;
	private List<Producto> productos;
	private CaracteristicaProductor caracteristica;
 	
	//CONSTRUCTORs

	public Fabricante(){
		productos = new ArrayList<Producto>();
	}

	public Fabricante(String nombre){
		this.nombre = nombre;
		productos = new ArrayList<Producto>();
	}
	
	//GETs & SETs
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Integer  getAltura() {
		return altura;
	}

	public void setAltura(Integer altura) {
		this.altura = altura;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	public CaracteristicaProductor getCaracteristica() {
		return caracteristica;
	}
	
	public void setCaracteristica(CaracteristicaProductor caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public String getProvincia() {
		return provincia;
	}
	
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public String getLocalidad() {
		return localidad;
	}
	
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}	
	public String getPathImagen() {
		return pathImagen;
	}
	
	public void setPathImagen(String pathImagen) {
		this.pathImagen = pathImagen;
	}
	
	
	
	
	
	
	//METHODS
	



	@Override
	public String toString(){
		return this.getNombre();
	}

	public void agregarProducto(Producto model) {
		this.productos.add(model);
		
	}

}
