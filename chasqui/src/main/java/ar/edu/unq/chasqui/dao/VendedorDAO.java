package ar.edu.unq.chasqui.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import ar.edu.unq.chasqui.model.Vendedor;

public interface VendedorDAO {
	
	@Transactional
	public List<Vendedor> obtenerVendedores();

}
