/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.sobrecargaconstrutores.test;

import aulas.javacore.sobrecargaconstrutores.classes.Estudante;

/**
 *
 * @author Alfredo Albélis
 */
public class EstudanteTest {
    public static void main(String[] args) {
        Estudante est = new Estudante("123456", "Alfredo", new double[] {5,7,9}, "14/03/2019");
        
        est.imprime();
    }
}
