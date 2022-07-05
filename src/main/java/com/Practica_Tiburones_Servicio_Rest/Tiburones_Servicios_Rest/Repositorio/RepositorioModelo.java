package com.Practica_Tiburones_Servicio_Rest.Tiburones_Servicios_Rest.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Practica_Tiburones_Servicio_Rest.Tiburones_Servicios_Rest.ModeloDatos.ModeloDatosModelos;

public interface RepositorioModelo extends JpaRepository<ModeloDatosModelos, Integer>{

}
