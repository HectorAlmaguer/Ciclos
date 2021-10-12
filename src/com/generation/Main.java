package com.generation;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	/*System.out.println("Ingresa un numero");
	int numero =sc.nextInt();
	for(int i=1;i<=10; i++){
	    System.out.println(numero+" X "+i+" = "+(numero*i));*/
		/*System.out.println("Serie de Fibonacci");
		System.out.println("Ingresa un numero del que quieres saber la serie de Fibonacci");
		int numero = sc.nextInt();
		sc.close();
		int num1 = 0,num2=1;
		System.out.println(num1);
		for (int i=1;i<=numero-1;i++){
			int aux = num1+num2;
			num1=num2;
			num2=aux;
			System.out.println(num1);*/

		/*
			System.out.println("Adivina el numero secreto. Ingresa un numero: ");
			int numero = sc.nextInt();
			int numSecret = 33;
		while (numero != numSecret){
			System.out.println("Adivina el numero secreto. Ingresa un numero: ");
			numero =sc.nextInt();
		}
		sc.close();
		System.out.println("Felicidades!!! Adivinaste el numero secreto");*/
		String resp="Y";
		do {
			System.out.println("Programa que te muestra el factorial");
			System.out.println("Ingresa un numero del que quieras saber su factorial:");
			int numero = sc.nextInt();
			int factorial = 1;
			for (int i = 1; i <= numero; i++) {
				factorial = factorial * i;
				System.out.println(factorial);
			}
			System.out.println("Deseas continuar? y / n");
			sc.nextLine();
			resp = sc.nextLine().toUpperCase();
		}while(resp.equals("Y"));
		sc.close();
	}
}
