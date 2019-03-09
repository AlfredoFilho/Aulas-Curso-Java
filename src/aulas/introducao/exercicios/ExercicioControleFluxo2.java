/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.introducao.exercicios;

/**
 *
 * @author a193532
 */
public class ExercicioControleFluxo2 {
	public static void main(String[] args) {
		//Crie um switch que dado valor de 1 a 7
		//Considerando 1 domingo imprima se � dia �til ou final de semana
		
		int valor = 2;
		
		switch(valor) {
			case 1:
			case 7:
				System.out.println("Final de semana");
				break;
				
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				System.out.println("Dia util");
				break;
			
			default:
				System.out.println("Valor inv�lido");
				break;
		}
	}
}
