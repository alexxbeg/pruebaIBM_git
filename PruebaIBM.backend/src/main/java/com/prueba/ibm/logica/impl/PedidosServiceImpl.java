package com.prueba.ibm.logica.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.prueba.ibm.dao.impl.PedidoDAOImpl;
import com.prueba.ibm.logica.facade.PedidosService;
import com.prueba.ibm.modelo.Pedidos;

public class PedidosServiceImpl implements PedidosService{
	
	private static final Logger logger = LogManager.getLogger(PedidosServiceImpl.class);
	
	@Override
	public void registrarPedido(Pedidos pedido) {
		try {
			PedidoDAOImpl pedidosDAOImpl = new PedidoDAOImpl();
			pedidosDAOImpl.registrarPedido(pedido);
			logger.info("pedido creado exitosamente!");
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
