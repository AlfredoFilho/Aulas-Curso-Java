/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.classesabstratas.classes;

/**
 *
 * @author Alfredo Albélis
 */
public class Gerente extends Funcionario{

    public Gerente() {
    }

    public Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }
    
    @Override
    public void calculaSalario(){
        this.salario = salario + (salario * 0.2);
    }

    @Override
    public void imprime() {
        System.out.println("Dentro do imprime de funcionario");
    }
}
