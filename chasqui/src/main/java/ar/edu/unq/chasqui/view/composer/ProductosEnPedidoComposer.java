package ar.edu.unq.chasqui.view.composer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zkplus.databind.AnnotateDataBinder;

import ar.edu.unq.chasqui.dtos.PedidoDTO;
import ar.edu.unq.chasqui.model.Pedido;
import ar.edu.unq.chasqui.model.ProductoPedido;

public class ProductosEnPedidoComposer extends GenericForwardComposer<Component>{
	
	private AnnotateDataBinder binder;
	private List<PedidoDTO>pedidos;
	private Double total = 0.0;
	
	@SuppressWarnings("deprecation")
	public void doAfterCompose(Component c) throws Exception{
		super.doAfterCompose(c);
		binder = new AnnotateDataBinder(c);
		Pedido p = (Pedido) Executions.getCurrent().getArg().get("pedido");
		pedidos = toDTO(p.ordernarByUsuario());
		for(PedidoDTO t : pedidos){
			total =+ t.getPrecio();
			
		}
		this.binder.loadAll();
		
		
	}

	private List<PedidoDTO>toDTO(HashMap<String,List<ProductoPedido>>param){
		List<PedidoDTO>resultado = new ArrayList<PedidoDTO>();
		for(String key : param.keySet()){
			List<ProductoPedido> pss = param.get(key);
			for(ProductoPedido p : pss){
				resultado.add(new PedidoDTO(key,p.getNombreProducto(),p.getNombreVariante(),p.getCantidad(),p.getPrecio()));				
			}
		}
		return resultado;
	}
	


	public List<PedidoDTO> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<PedidoDTO> pedidos) {
		this.pedidos = pedidos;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	
	
	
	
	

}
