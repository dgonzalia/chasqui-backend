package ar.edu.unq.chasqui.services.interfaces;

import ar.edu.unq.chasqui.model.Usuario;

public interface UsuarioService {

	
	public Usuario obtenerUsuarioPorID(final Integer id);
	public void guardarUsuario(Usuario u);
}