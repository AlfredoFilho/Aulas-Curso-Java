/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.introducaometodos.classes;

import aulas.javacore.introducaometodos.classes.Professor;

/**
 *
 * @author Alfredo Albélis
 */
public class Professor {
    public String nome;
    public String matricula;
    public String RG;
    public String CPF;
    
    public void imprime(){
        System.out.println("-------------------");
        System.out.println(this.CPF);
        System.out.println(this.matricula);
        System.out.println(this.nome);
        System.out.println(this.RG);
    }
}
