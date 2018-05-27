package com.prueba.ibm.presentacion;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.hibernate.mapping.Array;

import com.prueba.ibm.logica.impl.PedidosServiceImpl;
import com.prueba.ibm.logica.impl.ProductosServiceImpl;
import com.prueba.ibm.modelo.Pedidos;
import com.prueba.ibm.modelo.Productos;
import com.prueba.ibm.presentacion.facade.RestPruebaIBM;
import com.google.gson.Gson;

/**
 * 
 * @author ALEXANDER
 *
 */
@Path("pruebaibm")
public class RestPruebaIBMImpl implements RestPruebaIBM{

	private static final String enconding = "UTF-8";
	

	@POST
	@Path("consultarProductoById")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON + ";charset=" + enconding)
	public Response getProductosById(Productos productos) {
		Gson gson = new Gson();
		ProductosServiceImpl productosServiceImpl = new ProductosServiceImpl();
		if(productos != null) {
			productosServiceImpl.consultarProductosById(productos.getId());
		}
		String jsonString = gson.toJson(productos);
		Response response = Response.status(Status.OK).entity(jsonString).build();
		return response;
	}

	@POST
	@Path("consultarProductos")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON + ";charset=" + enconding)
	public Response getProductos() {
		Gson gson = new Gson();
		List<Productos> productos = new ArrayList<Productos>();
		ProductosServiceImpl productosServiceImpl = new ProductosServiceImpl();
		productos = productosServiceImpl.consultarProductos();
		String jsonString = gson.toJson(productos);
		Response response = Response.status(Status.OK).entity(jsonString).build();
		return response;
		
	}

	@POST
	@Path("registrarPedidos")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON + ";charset=" + enconding)
	public Response registrarPedido(Pedidos pedido) {
		PedidosServiceImpl pedidosServiceImpl = new PedidosServiceImpl();
		Response response;
		if(pedido.getCantidadProductos()<=5) {
			pedidosServiceImpl.registrarPedido(pedido);
			pedido.setRespuesta("OK");
			 response = Response.status(Status.OK).entity(pedido).build();
		}else {
			pedido.setRespuesta("false");
			response = Response.status(Status.OK).entity(pedido).build();
		}
		return response;
	}


	
}
