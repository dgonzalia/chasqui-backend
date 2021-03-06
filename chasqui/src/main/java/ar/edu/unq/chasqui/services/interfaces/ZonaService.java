package ar.edu.unq.chasqui.services.interfaces;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import ar.edu.unq.chasqui.model.Zona;

public interface ZonaService {
	
	@Transactional
	public void guardar(Zona z);
	@Transactional
	public List<Zona>buscarZonasBy(Integer idUsuario);
	@Transactional
	public void borrar(Zona z);

}
