package ar.edu.unju.edm.controller;

import ar.edu.unju.edm.model.Calculadora;

public class CalculadoraController {
	
	public void resolverSuma() {
		
		int a=10;
		int b=20;
		
		Calculadora nuevaCalculadora=new Calculadora();
		
		nuevaCalculadora.setA(a);
		nuevaCalculadora.setB(b);
		
		System.out.println("El resultado de la Suma es: "+ nuevaCalculadora.sumarDosNumeros());
	}
	
}
