package com.Practica_Tiburones_Servicio_Rest.Tiburones_Servicios_Rest.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Practica_Tiburones_Servicio_Rest.Tiburones_Servicios_Rest.ModeloDatos.ModeloDatosMarcas;
import com.Practica_Tiburones_Servicio_Rest.Tiburones_Servicios_Rest.Repositorio.RepositorioMarca;
import com.Practica_Tiburones_Servicio_Rest.Tiburones_Servicios_Rest.Repositorio.RepositorioModelo;
import com.Practica_Tiburones_Servicio_Rest.Tiburones_Servicios_Rest.ModeloDatos.ModeloDatosModelos;


@Service
@Transactional
public class AutomovilServicioMarca {
	
	@Autowired
	private RepositorioMarca repMarca;
	
	
	public List<ModeloDatosMarcas> listAllAutomovilMarca(){
		return repMarca.findAll();
	}
		
	public void guardarAutomovilMarca(ModeloDatosMarcas marcas) {
		repMarca.save(marcas);
	}
	
	public ModeloDatosMarcas getAutomovilMarca(Integer id) {
		return repMarca.findById(id).get();
	}
	
	public void deleteAutomovilMarca(Integer id) {
		repMarca.deleteById(id);
	}

}
