package com.Practica_Tiburones_Servicio_Rest.Tiburones_Servicios_Rest.ModeloDatos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "tabla_detalles_modelo_auto")
public class ModeloDatosModelos {
	
	private int id;
	private String marca;
	private String modelo;
	private String calificacion;
	private String precio;
	private String estatus;
	
	public ModeloDatosModelos() {
		
	}

	public ModeloDatosModelos(int id, String marca, String modelo, String calificacion, String precio, String estatus) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.calificacion = calificacion;
		this.precio = precio;
		this.estatus = estatus;
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "ModeloDatosModelos {" +
	"id=" + id +
	", marca=" + marca + 	'\'' + 
	", modelo=" + modelo + '\'' +
	", calificacion" + calificacion + '\''+
	", precio" + precio + '\''+
	", estatus"+ estatus + '\'' + '}';
	}
}
