package com.vehiculos.rest.modelo;

import java.text.DateFormat;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;





public class Vehiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String placa;
	private DateFormat fechaHoraEntrada;
	private DateFormat fechaHoraSalida;
	private String disponible;
	private Double valorPagar;

	public Vehiculo(int id, String placa, DateFormat fechaHoraEntrada, DateFormat fechaHoraSalida, String disponible,
			Double valorPagar) {
		super();
		this.id = id;
		this.placa = placa;
		this.fechaHoraEntrada = fechaHoraEntrada;
		this.fechaHoraSalida = fechaHoraSalida;
		this.disponible = disponible;
		this.valorPagar = valorPagar;
	}
	
	public Vehiculo(String placa, DateFormat fechaHoraEntrada, DateFormat fechaHoraSalida, String disponible,
			Double valorPagar) {
		super();
		this.placa = placa;
		this.fechaHoraEntrada = fechaHoraEntrada;
		this.fechaHoraSalida = fechaHoraSalida;
		this.disponible = disponible;
		this.valorPagar = valorPagar;
	}
	
	public Vehiculo() {
		super();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public DateFormat getFechaHoraEntrada() {
		return fechaHoraEntrada;
	}

	public void setFechaHoraEntrada(DateFormat fechaHoraEntrada) {
		this.fechaHoraEntrada = fechaHoraEntrada;
	}

	public DateFormat getFechaHoraSalida() {
		return fechaHoraSalida;
	}

	public void setFechaHoraSalida(DateFormat fechaHoraSalida) {
		this.fechaHoraSalida = fechaHoraSalida;
	}

	public String getDisponible() {
		return disponible;
	}

	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}

	public Double getValorPagar() {
		return valorPagar;
	}

	public void setValorPagar(Double valorPagar) {
		this.valorPagar = valorPagar;
	}
	
	
}
