/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.introducaoclasses.test;

import aulas.javacore.introducaoclasses.classes.Carro;

/**
 *
 * @author a193532
 */
public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Gol";
        carro.placa = "asd123";
        carro.velocidadeMaxima = 123;
        
        System.out.println(carro.modelo);
        System.out.println(carro.placa);
        System.out.println(carro.velocidadeMaxima);
    }    
}