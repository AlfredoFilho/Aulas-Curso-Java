/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.introducaometodos.test;

import aulas.javacore.introducaometodos.classes.Estudante;

/**
 *
 * @author Alfredo Albélis
 */
public class EstudanteTest {
    public static void main(String[] args) {
        Estudante est = new Estudante();
        
        est.setNome("Alfredo");
        est.setIdade(-1);
        est.setNotas(new double[]{10,10,5});
        
        est.imprime();
        System.out.println(est.getNome());
    }
}
