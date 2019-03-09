/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.introducaoclasses.test;

import aulas.javacore.introducaoclasses.classes.Professor;

/**
 *
 * @author a193532
 */
public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        
        professor.nome = "João";
        professor.matricula = "123456";
        professor.RG = "123456789";
        professor.CPF = "12345678911";
        
        System.out.println(professor.nome);
        System.out.println(professor.matricula);
        System.out.println(professor.RG);
        System.out.println(professor.CPF);
    }
}
