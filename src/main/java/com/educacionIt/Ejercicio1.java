package com.educacionIt;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int horasPorTeclado, horas, dias, semanas;
		System.out.println("Introduzca la cantidad de horas: ");
        Scanner scanner = new Scanner(System.in);
        horasPorTeclado = scanner.nextInt();
        semanas = horasPorTeclado/168;
        dias = (horasPorTeclado%168)/24;
        horas = horasPorTeclado%24;
        
        System.out.println("Semanas: " + semanas);
        System.out.println("Dias: " + dias);
        System.out.println("Horas: " + horas);
        
        
	}

}
