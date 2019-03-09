/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.introducaometodos.classes;

import aulas.javacore.introducaometodos.classes.Professor;

/**
 *
 * @author a193532
 */
public class Professor {
    public String nome;
    public String matricula;
    public String RG;
    public String CPF;
    
    public void imprime(Professor aux){
        System.out.println("-------------------");
        System.out.println(aux.CPF);
        System.out.println(aux.matricula);
        System.out.println(aux.nome);
        System.out.println(aux.RG);
        aux.nome = "Mariana";
        System.out.println(aux.nome);
    }
}
