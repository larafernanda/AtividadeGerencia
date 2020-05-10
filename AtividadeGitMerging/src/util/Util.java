/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Scanner;

/**
 *
 * @author Lara
 */
public class Util {
    
    
    //Método IMC (Lara) - Dev1
    
     public void calculoIMC(int imc, int peso, int altura) { 
        imc = peso / altura * altura;
    }
     
    //Método Conversão (Alicia) - Dev2
    	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double Celsius, Fahrenheit; 

		System.out.print("Conversor de temperatura: Graus Celsios -> Fahrenheit\n\n");
		
		
		System.out.print("Digite a temperatura em Celsius: ");
		Celsius = entrada.nextDouble();
		
		Fahrenheit = ( 9 * Celsius + 160 ) / 5;

		System.out.print("\n A medida convertida é " + Fahrenheit + "ºF\n");
		
	}

}

