package com.vehiculos.rest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehiculos.rest.modelo.Vehiculo;

public interface RepoVehiculo extends JpaRepository<Vehiculo, Integer> {

}
