/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.javacore.modificadorfinal.test;

import aulas.javacore.modificadorfinal.classes.Carro;

/**
 *
 * @author Alfredo Albélis
 */
public class CarroTest {
    public static void main(String[] args) {
        Carro c = new Carro();
        System.out.println(c.getComprador());
        c.getComprador().setNome("Alfredo");
        System.out.println(c.getComprador());
        
    }
}
