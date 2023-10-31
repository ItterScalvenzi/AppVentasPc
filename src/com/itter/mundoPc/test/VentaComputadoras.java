package com.itter.mundoPc.test;

import com.itter.mundoPc.modelo.Computadora;
import com.itter.mundoPc.modelo.Monitor;
import com.itter.mundoPc.modelo.Raton;
import com.itter.mundoPc.modelo.Teclado;
import com.itter.mundoPc.servicio.Orden;

public class VentaComputadoras {

	public static void main(String[] args) {
		//Creacion de objetos
		
		Raton ratonSamsung = new Raton("inalambrico", "Samsung");
		Teclado tecladoSamsung = new Teclado("Inalambrico", "Samsung");
		Monitor monitorSamsung = new Monitor("Samsung", 32);
		//creacion de objeto tipo computadora
		Computadora computadorSamsung = 
				new Computadora("Pc Samsung", monitorSamsung, tecladoSamsung, ratonSamsung);
		
		Raton ratonLenovo = new Raton("Bluetooth", "Lenovo");
		Teclado tecladoLenovo = new Teclado("Bluetooth", "Lenovo");
		Monitor monitorLenovo = new Monitor("Lenovo", 24);
		//creacion de objeto tipo computadora
		Computadora computadoraLenovo = 
				new Computadora("Pc Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
		
		Raton ratonHp = new Raton("inalambrico", "Hp");
		Teclado tecladoHp = new Teclado("Inalambrico", "Hp");
		Monitor monitorHp = new Monitor("Hp", 26);
		//creacion de objeto tipo computadora
		Computadora computadoraHp = 
				new Computadora("Pc Hp", monitorHp, tecladoHp, ratonHp);
		
		
		
		//creacion de objeto Orden
		Orden orden_1 = new Orden();
		orden_1.agregarComputadora(computadorSamsung);
		orden_1.agregarComputadora(computadoraLenovo);
		orden_1.agregarComputadora(computadoraHp);
		orden_1.mostrarOrden();
	}
}
