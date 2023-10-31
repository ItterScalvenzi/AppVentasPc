package com.itter.mundoPc.modelo;

public class Raton extends DispositivoDeEntrada {

	private final int idRaton;
	private static int contadorRatones = 0;
	
	public Raton(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		idRaton = ++contadorRatones;
		
	}

	@Override
	public String toString() {
		return "Raton [ID= " + idRaton +"] " +super.toString();
	}
	
}
