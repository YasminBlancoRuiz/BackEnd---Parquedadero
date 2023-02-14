package com.vehiculos.rest.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.vehiculos.rest.modelo.Vehiculo;
import com.vehiculos.rest.repositorio.RepoVehiculo;

@Service
public class ServicioVehiculo {
	
	
	@Autowired
	private RepoVehiculo repositorio;
	
	public List<Vehiculo> listarVehiculos(){
		return repositorio.findAll();
	}
	
	public void guardarVehiculo(Vehiculo vehiculo) {
		repositorio.save(vehiculo);
	}
	
	public Vehiculo obtenerVehiculoPorID(Integer id) {
		return repositorio.findById(id).get();
	}
	
	public void eliminarVehiculo(Integer id) {
		repositorio.deleteById(id);
		
	}

}
