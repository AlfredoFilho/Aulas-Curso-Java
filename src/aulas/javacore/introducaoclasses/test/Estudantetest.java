/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.introducaoclasses.test;

import aulas.javacore.introducaoclasses.classes.Estudante;

/**
 *
 * @author Alfredo Albélis
 */
public class Estudantetest {
    public static void main(String[] args) {
        Estudante alfredo = new Estudante();
        alfredo.nome = "Alfredo";
        alfredo.matricula = "193532";
        alfredo.idade = 19;
        
        System.out.println(alfredo.nome);
        System.out.println(alfredo.matricula);
        System.out.println(alfredo.idade);
    }
}
