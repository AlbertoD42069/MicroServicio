package com.Practica_Tiburones_Servicio_Rest.Tiburones_Servicios_Rest.ModeloDatos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tabla_general_marca_auto")
public class ModeloDatosMarcas {
	
	//private ModeloDatosModelos datos_modelos;
	private int id;
	private String pais_Origen;
	private String calificacion;
	private String descripcion;
	private String nombre;
	
	public ModeloDatosMarcas() {
		
	}

	public ModeloDatosMarcas(int id, String nombre, String pais_Origen,
			String calificacion, String descripcion) {
		super();
		//this.datos_modelos = datos_modelos;
		this.id = id;
		this.nombre = nombre;
		this.pais_Origen = pais_Origen;
		this.calificacion = calificacion;
		this.descripcion = descripcion;
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

	/*public ModeloDatosModelos getDatos_modelos() {
		return datos_modelos;
	}

	public void setDatos_modelos(ModeloDatosModelos datos_modelos) {
		this.datos_modelos = datos_modelos;
	}
	*/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais_Origen() {
		return pais_Origen;
	}

	public void setPais_Origen(String pais_Origen) {
		this.pais_Origen = pais_Origen;
	}

	public String getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
	    return "ModeloDatosMarcas {" +
	        "id='" + id + '\'' +
	        "nombre='" + nombre + '\'' +
	        "pais_Origen='" + pais_Origen + '\'' + 
	        "calificacion='" + calificacion + '\''+
	        "descripcion='" + descripcion + '\''+      
	        '}';
	  }
	
}
