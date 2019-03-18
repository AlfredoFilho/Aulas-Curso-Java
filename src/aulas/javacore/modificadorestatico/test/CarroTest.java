/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.modificadorestatico.test;

import aulas.javacore.modificadorestatico.classes.Carro;

/**
 *
 * @author Alfredo Albélis
 */
public class CarroTest {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(220);
        System.out.println(Carro.getVelocidadeLimite());
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Audi", 290);
        Carro c3 = new Carro("Fusca", 300);
        
        c1.Imprime();
        c2.Imprime();
        c3.Imprime();
    }
}
