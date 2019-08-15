package paquete.prueba.main;

import paquete.prueba.ISaludo;
import paquete.prueba.SaludoImpl01;

public class Principal {
	public static void main(String[] args) {
		ISaludo saludoA = (name) -> "Hola " + name;
		
		ISaludo saludoB = (name) -> "Bon dia, "+name+"!!";
		
		ISaludo saludoC = new SaludoImpl01();
		
		System.out.println(saludoA.sayHelloTo("Abel"));
		System.out.println(saludoB.sayHelloTo("Kevin"));
		System.out.println(saludoC.sayHelloTo("Abel"));
		System.out.println(saludoA.sayHelloWord());
		
		//output: Hola Abel
		//			Bon dia, Kevin!!
		//			Abel, Te saludo desde una clase implementada: 
		//			Hello World
	}
}
