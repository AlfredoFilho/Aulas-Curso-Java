/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.introducao.controlefluxo;

/**
 *
 * @author Alfredo Albélis
 */
public class ControleFluxo2 {
	public static void main(String[] args) {
		
		int idade = 15; 
		
		if (idade < 15) {
			System.out.println("Infantil");
		}else if(idade >=15 && idade < 18) {
			System.out.println("Juvenil");
		}else {
			System.out.println("Adulto");
		}
	}
}
	
