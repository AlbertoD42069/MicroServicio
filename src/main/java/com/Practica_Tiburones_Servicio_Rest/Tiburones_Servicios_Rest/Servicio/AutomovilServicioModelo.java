package com.Practica_Tiburones_Servicio_Rest.Tiburones_Servicios_Rest.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Practica_Tiburones_Servicio_Rest.Tiburones_Servicios_Rest.ModeloDatos.ModeloDatosModelos;
import com.Practica_Tiburones_Servicio_Rest.Tiburones_Servicios_Rest.Repositorio.RepositorioModelo;

@Service
@Transactional
public class AutomovilServicioModelo {

	@Autowired
	private RepositorioModelo repModelo;
	
	public List<ModeloDatosModelos> listAutomovilModelo(){
		return repModelo.findAll(); 
		}
	
	public void guardarAutomovilModelo(ModeloDatosModelos modelo) {
		repModelo.save(modelo);
			}
	public ModeloDatosModelos getAutomovilModelo(Integer id) {
		return repModelo.findById(id).get();
				}
	public void deleteAutomovilModelo(Integer id) {
		repModelo.deleteById(id);
					}

}
