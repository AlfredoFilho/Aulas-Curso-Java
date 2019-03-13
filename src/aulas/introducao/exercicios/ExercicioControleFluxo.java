/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.introducao.exercicios;

/**
 *
 * @author Alfredo Albélis
 */
public class ExercicioControleFluxo {
	public static void main(String[] args) {
		
		/*
		 Crie uma variavel salario e imprima seu imposto
		 imposto:
		 salario < 1000 5%
		 salario >=1000 && salario < 2000 10%
		 salario >=2000 && salario < 4000 15%
		 salario > 5000 20%
		 */
		
		int salario = 900;
		double totalImposto;
		
		if (salario < 1000) {
			totalImposto = salario * 0.05;
		}else if(salario >= 1000 && salario < 2000){
			totalImposto = salario * 0.1;
		}else if(salario >= 2000 && salario < 4000) {
			totalImposto = salario * 0.15;
		}else {
			totalImposto = salario * 0.2;
		}
		
		System.out.println("O total de imposto �: " + totalImposto);
	}
}
