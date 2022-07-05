package com.Practica_Tiburones_Servicio_Rest.Tiburones_Servicios_Rest.Controlador;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Practica_Tiburones_Servicio_Rest.Tiburones_Servicios_Rest.ModeloDatos.ModeloDatosMarcas;
import com.Practica_Tiburones_Servicio_Rest.Tiburones_Servicios_Rest.Servicio.AutomovilServicioMarca;

@RestController
@RequestMapping("/marca")
public class ControladorMarca {
	
	@Autowired
	AutomovilServicioMarca servicios;
	
	@GetMapping("")
	public List<ModeloDatosMarcas> list(){
		return servicios.listAllAutomovilMarca();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ModeloDatosMarcas> get(@PathVariable Integer id){
		try {
			ModeloDatosMarcas marca = servicios.getAutomovilMarca(id);
			return new ResponseEntity<ModeloDatosMarcas>(marca, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<ModeloDatosMarcas>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/")
	public void add(@RequestBody ModeloDatosMarcas marca) {
		servicios.guardarAutomovilMarca(marca);
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody ModeloDatosMarcas marca, @PathVariable Integer id){
		try {
			ModeloDatosMarcas existeAutomovil = servicios.getAutomovilMarca(id);
			marca.setId(id);
			servicios.guardarAutomovilMarca(marca);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
	}
	@DeleteMapping("/{id}")
	public void delete (@PathVariable Integer id) {
		servicios.deleteAutomovilMarca(id);
	}
}

