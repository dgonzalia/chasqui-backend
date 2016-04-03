package ar.edu.unq.chasqui.dao;

import ar.edu.unq.chasqui.model.Usuario;
import ar.edu.unq.chasqui.model.Vendedor;

public interface UsuarioDAO {

	
	public Usuario obtenerUsuarioPorID(Integer id);
	public Vendedor obtenerVendedorPorID(Integer id);
	public void guardarUsuario(Usuario u);
	public Usuario obtenerUsuarioPorNombre (String username);
}
