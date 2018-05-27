package com.prueba.ibm.logica.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.prueba.ibm.dao.impl.PedidoDAOImpl;
import com.prueba.ibm.dao.impl.ProductoDAOImpl;
import com.prueba.ibm.logica.facade.ProductosService;
import com.prueba.ibm.modelo.Productos;

public class ProductosServiceImpl implements ProductosService{

	private static final Logger logger = LogManager.getLogger(ProductosServiceImpl.class);
	
	@Override
	public Productos consultarProductosById(Integer idProducto) {
		Productos producto = new Productos();
		try {
			ProductoDAOImpl productoDAOImpl = new ProductoDAOImpl();
			if(idProducto != null) {
				producto = productoDAOImpl.consultarProductosById(idProducto);
			}
			return producto;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return producto;
	}

	@Override
	public List<Productos> consultarProductos() {
		List<Productos> productos = new ArrayList<Productos>();
		try {
			ProductoDAOImpl productoDAOImpl = new ProductoDAOImpl();
			productos = productoDAOImpl.consultarProductos();
			return productos;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return productos;
	}
	
	

}
