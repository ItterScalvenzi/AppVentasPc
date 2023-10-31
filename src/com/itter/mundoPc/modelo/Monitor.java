package com.itter.mundoPc.modelo;

public class Monitor {
	
	private final int idMonitor;
	private String marca;
	private double tamanio;
	private static int contadorMonitores = 0;
	
	private Monitor() {
		this.idMonitor = ++contadorMonitores;
	}
	
	public Monitor(String marca, double tamanio) {
		this();
		this.marca = marca;
		this.tamanio = tamanio;
	}



	public int getIdMonitor() {
		return idMonitor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getTamanio() {
		return tamanio;
	}

	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}

	public static int getContadorMonitores() {
		return contadorMonitores;
	}



	@Override
	public String toString() {
		return "Monitor [ID= " + idMonitor + ", marca= " + marca + ", tamaño= " + tamanio + " ]";
	}
	
	
	
}
