package com.prueba.ibm.dao.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.prueba.ibm.dao.facade.ProductoDAO;
import com.prueba.ibm.modelo.Productos;

public class ProductoDAOImpl implements ProductoDAO{

	private static final Logger logger = LogManager.getLogger(PedidoDAOImpl.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sesionFactory){
		this.sessionFactory = sesionFactory;
	}
	
	@Override
	public Productos consultarProductosById(Integer idProducto) {
		Session session = this.sessionFactory.getCurrentSession();
		String queryString = "select p from productos p where p.id:idProducto";
		Query query = session.createQuery(queryString);
		query.setParameter("id", idProducto);
		logger.info("Productos obtenidos exitosamente");
		return (Productos)query.uniqueResult();
	}

	@Override
	public List<Productos> consultarProductos() {
		Session session = this.sessionFactory.getCurrentSession();
		String queryString = "select p from productos p";
		Query query = session.createQuery(queryString);
		logger.info("Productos obtenidos exitosamente");
		return (List<Productos>)query.list();
	}

}
