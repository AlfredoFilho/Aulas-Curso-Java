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
public abstract class Pessoa {
    String nome;

    public abstract void imprime();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
