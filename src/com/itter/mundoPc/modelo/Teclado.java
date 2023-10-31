package com.itter.mundoPc.modelo;

public class Teclado extends DispositivoDeEntrada{

	private int idTeclado;
	private static int contadorTeclados = 0;
	
	public Teclado(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		idTeclado = ++contadorTeclados;
	}

	@Override
	public String toString() {
		return "Teclado [ID= " + idTeclado + "]" +super.toString();
	}

}
