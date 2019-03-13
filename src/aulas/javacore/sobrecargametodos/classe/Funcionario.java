/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.sobrecargametodos.classe;

/**
 *
 * @author Alfredo Albélis
 */
public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public void getNome(){
        returnn this.nome;
    }
    public void getIdade(){
        return this.idade;
    }   
    public void getSalario(){
        return this.salario;
    }
}
