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
import com.Practica_Tiburones_Servicio_Rest.Tiburones_Servicios_Rest.ModeloDatos.ModeloDatosModelos;
import com.Practica_Tiburones_Servicio_Rest.Tiburones_Servicios_Rest.Servicio.AutomovilServicioModelo;

@RestController
@RequestMapping("/modelo")
public class ControladorModelo {
	
	
	
	@Autowired
	AutomovilServicioModelo servicios;
	
	@GetMapping("")
	public List<ModeloDatosModelos> listModelo(){
		return servicios.listAutomovilModelo();
		
	}
	
	@GetMapping("/{Id}")
	public ResponseEntity<ModeloDatosModelos> get(@PathVariable Integer id){
		try {
			ModeloDatosModelos modelo = servicios.getAutomovilModelo(id);
			return new ResponseEntity<ModeloDatosModelos> (modelo, HttpStatus.OK);
		} catch (NoSuchElementException  e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add(@RequestBody ModeloDatosModelos modelo) {
		servicios.guardarAutomovilModelo(modelo);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody ModeloDatosModelos modelo, @PathVariable Integer id){
		try {
			ModeloDatosModelos existeAuto = servicios.getAutomovilModelo(id);
			modelo.setId(id);
			servicios.getAutomovilModelo(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
		
	}
	@DeleteMapping("")
	public void delete(@PathVariable Integer id) {

		servicios.deleteAutomovilModelo(id);    }
}
