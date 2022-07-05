package com.Practica_Tiburones_Servicio_Rest.Tiburones_Servicios_Rest.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Practica_Tiburones_Servicio_Rest.Tiburones_Servicios_Rest.ModeloDatos.ModeloDatosMarcas;

public interface RepositorioMarca extends JpaRepository<ModeloDatosMarcas, Integer>{

}
