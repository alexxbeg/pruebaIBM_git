package com.prueba.ibm.modelo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author ALEXANDER
 */
@Entity
@Table(name="PEDIDOS")
@SequenceGenerator(name="SEQUENCIA_PEDIDOS", initialValue=1, allocationSize=100)
public class Pedidos {

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCIA_PEDIDOS")
	private int id;
	
	@Column(name = "USUARIO", nullable = false, length = 250)
	private String usuario;
	
	@Column(name = "TIPO_DOCUMENTO", nullable = false, length = 3)
	private String tipoDocumento;

	@Column(name = "NUMERO_DOCUMENTO", nullable = false, length = 12)
	private Integer numeroDocumento;
	
	@Column(name = "CANTIDAD_PRODUCTOS", nullable = false, length = 12)
	private Integer cantidadProductos;
	
	@Column(name="FECHA_SOLICITUD" , nullable = false)
	private Date fechaSolicitud;
	
	@Column(name = "DIRECCION_CORRESPONDENCIA", nullable = false, length = 250)
	private String direccionCorrespondencia;
	
	@Column(name = "VALOR_PERDIDO", nullable = false, length = 12)
	private BigDecimal valorPedido;
	
	
	@OneToMany(mappedBy="PEDIDOS" )
	private List<Productos> productos;
	
	@Transient
	private String respuesta;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public Integer getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(Integer numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public List<Productos> getProductos() {
		return productos;
	}
	public void setProductos(List<Productos> productos) {
		this.productos = productos;
	}
	public Integer getCantidadProductos() {
		return cantidadProductos;
	}
	public void setCantidadProductos(Integer cantidadProductos) {
		this.cantidadProductos = cantidadProductos;
	}
	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}
	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}
	
	public String getDireccionCorrespondencia() {
		return direccionCorrespondencia;
	}
	public void setDireccionCorrespondencia(String direccionCorrespondencia) {
		this.direccionCorrespondencia = direccionCorrespondencia;
	}
	public BigDecimal getValorPedido() {
		return valorPedido;
	}
	public void setValorPedido(BigDecimal valorPedido) {
		this.valorPedido = valorPedido;
	}
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	
}	