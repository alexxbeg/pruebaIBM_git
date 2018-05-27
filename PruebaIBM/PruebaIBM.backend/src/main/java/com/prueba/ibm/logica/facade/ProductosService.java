package com.prueba.ibm.logica.facade;

import java.util.List;

import com.prueba.ibm.modelo.Productos;
 /**
  * 
  * @author ALEXANDER
  *
  */
public interface ProductosService {
	
	public Productos consultarProductosById(Integer idroducto);
	public List<Productos> consultarProductos();
	

}
