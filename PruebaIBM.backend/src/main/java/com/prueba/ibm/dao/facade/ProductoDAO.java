package com.prueba.ibm.dao.facade;

import java.util.List;

import com.prueba.ibm.modelo.Productos;

public interface ProductoDAO {
	
	public Productos consultarProductosById(Integer idroducto);
	public List<Productos> consultarProductos();
}
