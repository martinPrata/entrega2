package com.educacionIt;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		int n3 = 30;
		
		System.out.println("Teniendo a n1 como: " + n1 + " a n2 como: " + n2 + " y a n3 como: " + n3 + " los resultados de las siguientes operaciones seran:");
		
		int total = n1 + n2 + n3;
		double promedio = (double)total/3;
		int resto = n2%n1;
		
		System.out.println("El resultado de sumar los tres valores es: " + total);
		System.out.println("El promedio de los tres valores es: " + promedio);
		System.out.println("El resto entre n2 y n1 es: " + resto);
		
	}

}
