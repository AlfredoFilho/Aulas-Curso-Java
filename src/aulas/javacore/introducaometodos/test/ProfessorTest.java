/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.introducaometodos.test;

import aulas.javacore.introducaometodos.classes.Professor;

/**
 *
 * @author a193532
 */
public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.CPF = "12345678911";
        prof.matricula = "12456";
        prof.nome = "Marcos";
        prof.RG = "123456789";
        
        Professor prof2 = new Professor();
        prof2.CPF = "98765432199";
        prof2.matricula = "654321";
        prof2.nome = "Joana";
        prof2.RG = "987654321";
        
        System.out.println("Dentro do professor test");
        System.out.println(prof.nome);
        prof.imprime(prof);
        System.out.println(prof.nome);
        
//        prof.imprime(prof2);
    }
}
