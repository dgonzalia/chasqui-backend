package ar.edu.unq.chasqui.service.rest.request;

import java.io.Serializable;

public class EditarPerfilRequest implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6246311656076856907L;
	private DireccionRequest direccion;
	private String password;
	private String nickName;
	private String nombre;
	private String apellido;
	private Integer telefonoFijo;
	private Integer telefonoMovil;
	private String email;
	
	public DireccionRequest getDireccion() {
		return direccion;
	}
	public void setDireccion(DireccionRequest direccion) {
		this.direccion = direccion;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getTelefonoFijo() {
		return telefonoFijo;
	}
	public void setTelefonoFijo(Integer telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}
	public Integer getTelefonoMovil() {
		return telefonoMovil;
	}
	public void setTelefonoMovil(Integer telefonoMovil) {
		this.telefonoMovil = telefonoMovil;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
	
	
	
	
	
}