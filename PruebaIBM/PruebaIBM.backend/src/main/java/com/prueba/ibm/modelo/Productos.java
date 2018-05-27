package com.prueba.ibm.modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author ALEXANDER
 */
@Entity
@Table(name="TBL_PRODUCTOS")
public class Productos {

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
		
	@Column(name = "NOMBRE", nullable = false, length = 250)
	private String nombre;

	@Column(name = "CANTIDAD", nullable = false, length = 3)
	private Integer cantidad;
	
	@Column(name = "VALOR", nullable = false, length = 6, precision = 4)
	private BigDecimal valor;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="pedidos")
	private Pedidos pedidos;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Pedidos getPedidos() {
		return pedidos;
	}

	public void setPedidos(Pedidos pedidos) {
		this.pedidos = pedidos;
	}



	
	
	
}	