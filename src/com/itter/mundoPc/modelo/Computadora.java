package com.itter.mundoPc.modelo;

public class Computadora {

	private final int idComputadora;
	private String nombre;
	private Monitor monitor;
	private Teclado teclado;
	private Raton raton;
	private static int contadorComputadoras = 0;
	
	private Computadora() {
		this.idComputadora = ++contadorComputadoras;
	}
	
	public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
		this();
		this.nombre = nombre;
		this.monitor = monitor;
		this.teclado = teclado;
		this.raton = raton;
	}

	@Override
	public String toString() {
		return "Computadora [ID= " + idComputadora +
				", \n -Nombre= " + nombre + 
				", \n -" + monitor +
				", \n -" + teclado + 
				", \n -" + raton + "]";
	}
	
	
}
