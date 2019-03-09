/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.introducaometodos.test;

import aulas.javacore.introducaometodos.classes.Calculadora;

/**
 *
 * @author a193532
 */
public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("\nSoma:");
        calc.somaDoisNumeros();
        
        System.out.println("\nSubtração:");
        calc.subtraiDoisNumeros();
        
        System.out.println("\nMultiplicação:");
        calc.multiplicaDoisNumeros(5, 5);
        
        System.out.println("\nDivisão:");
        double result = calc.divideDoisNumeros(20, 0);
        System.out.println(result);
        
        
        calc.imprimeDoisNumerosDivididos(10, 0);
        System.out.println("\nContinuação...");
    }   
}
