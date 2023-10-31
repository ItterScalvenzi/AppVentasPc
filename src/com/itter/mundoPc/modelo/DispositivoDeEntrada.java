package com.itter.mundoPc.modelo;

public class DispositivoDeEntrada {

	private String tipoEntrada;
	private String marca;
	
	public DispositivoDeEntrada(String tipoEntrada, String marca) {
		this.tipoEntrada = tipoEntrada;
		this.marca = marca;
	}

	public String getTipoEntrada() {
		return tipoEntrada;
	}

	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Dispositivo de Entrada [tipo de entrada = " + tipoEntrada + ", marca = " + marca + " ]";
	}
	
	
}
