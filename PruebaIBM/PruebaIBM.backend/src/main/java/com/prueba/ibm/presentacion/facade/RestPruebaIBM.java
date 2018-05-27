package com.prueba.ibm.presentacion.facade;

import javax.ws.rs.core.Response;

import com.prueba.ibm.modelo.*;

/**
 * 
 * @author ALEXANDER
 *
 */
public interface RestPruebaIBM {
	
	public Response getProductosById(Productos productos);
	public Response getProductos();
	public Response registrarPedido(Pedidos pedidos);

}
