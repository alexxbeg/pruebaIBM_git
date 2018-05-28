package tets;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.prueba.ibm.logica.impl.ProductosServiceImpl;
import com.prueba.ibm.modelo.Productos;

public class ProductosServiceImplTest {

	@Test
	public void consultaProductoOk() {
		int idProducto = 5;
		Productos productoResult = new Productos();
		productoResult.setId(idProducto);
		ProductosServiceImpl productosServiceImpl = new ProductosServiceImpl();
		Productos productoConsult = productosServiceImpl.consultarProductosById(idProducto);
		assertEquals(productoResult, productoConsult);
	}
	
	
	@Test
	public void consultaListaProductosOk() {
		
		ProductosServiceImpl productosServiceImpl = new ProductosServiceImpl();
		List<Productos> productos  = productosServiceImpl.consultarProductos();
		assertEquals(productos, true);
		
	}

}
