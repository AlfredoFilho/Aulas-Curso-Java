/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.introducao.controlefluxo;

/**
 *
 * @author a193532
 */
public class ControleFluxo1 {
	public static void main(String[] args) {
		// idade < 158 categoria infantil
		// idade >= 15 $$ idade <18 juvenil
		// idade >= 18 adulto
		
		int idade = 20;
		String categoria = "";
		
		if(idade < 15) {		
			categoria = "infantil";
		}else if(idade >=15 && idade < 18){
			categoria = "juvenil";
		}else {
			categoria = "adulto";;
		}
		System.out.println(categoria);
	}
}

