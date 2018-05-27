package com.prueba.ibm.dao.impl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.prueba.ibm.dao.facade.PedidoDAO;
import com.prueba.ibm.modelo.Pedidos;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PedidoDAOImpl implements PedidoDAO{
	
	private static final Logger logger = LogManager.getLogger(PedidoDAOImpl.class);
	 
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sesionFactory){
		this.sessionFactory = sesionFactory;
	}

	@Override
	public void registrarPedido(Pedidos pedido) {
		try {
			Session session = this.sessionFactory.getCurrentSession();
			session.persist(pedido);
			logger.info("Pedido registrado exitosamente");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
