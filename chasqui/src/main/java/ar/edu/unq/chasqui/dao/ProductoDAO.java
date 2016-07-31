package ar.edu.unq.chasqui.dao;

import java.util.List;

import ar.edu.unq.chasqui.model.Imagen;
import ar.edu.unq.chasqui.model.Variante;

public interface ProductoDAO {

	public List<Variante> obtenerVariantesPorCategoria( Integer idCategoria, Integer pagina, Integer cantidadDeItems);

	public List<Variante> obtenerVariantesPorProductor(Integer idProductor, Integer pagina, Integer cantItems);

	public List<Variante> obtenerVariantesPorMedalla(Integer idMedalla, Integer pagina, Integer cantItems);

	public List<Imagen> obtenerImagenesDe(Integer idVariante);

	public List<Variante> obtenerVariantesPorNombreODescripcion(String param,Integer pagina,Integer cantItems,Integer idVendedor);

	public Variante obtenervariantePor(Integer id);

	public void modificarVariante(Variante v); 

}
