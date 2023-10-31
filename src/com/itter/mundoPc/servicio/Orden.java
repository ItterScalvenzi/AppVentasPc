package com.itter.mundoPc.servicio;

import java.util.ArrayList;
import java.util.List;

import com.itter.mundoPc.modelo.Computadora;

public class Orden {

	private final int idOrden;
	private final List<Computadora> computadoras;
	private static int contadorOrdenes = 0;
	
	public Orden() {
		this.idOrden = ++contadorOrdenes;
		computadoras = new ArrayList<>();
	}
	
	public void agregarComputadora(Computadora computadora) {
		computadoras.add(computadora);
	}
	
	public void mostrarOrden() {
		System.out.println("Orden #" +this.idOrden);
		System.out.println("Total de computadoras: " +computadoras.size());
		System.out.println("--Listado--");
		computadoras.forEach(System.out::println);
	}
	
}
