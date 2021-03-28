package br.com.erickfrei.calculadoradeindicedemassacorporal;

import java.util.Scanner;

/**
 * Crie um programa que calcula o indice de massa corporal
 * @author Erick Freire
 * @version 1 - Criado em 28-03-2021 as 19:28
 */

public class CalculadoraDeIndiceDeMassaCorporal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double imc;
		double peso;
		double altura;
		
		System.out.print("Digite o seu peso: ");
		peso = entrada.nextDouble();
		
		System.out.print("Digite a sua altura: ");
		altura = entrada.nextDouble();
		
		imc =  (peso / Math.pow(altura, 2));
		
		System.out.printf("Seu IMC é de: %.2f%n", imc);
		
		if(imc < 18.5)
			System.out.println("Abaixo do peso");
		if(imc >= 18.5)
			if(imc < 25)
				System.out.println("Peso Normal");
		if(imc > 24.9)
			if(imc < 30)
				System.out.println("Sobrepeso");
		if(imc > 29.9)
			System.out.println("Obesidade");
				

	}

}
