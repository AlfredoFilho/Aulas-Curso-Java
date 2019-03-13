/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.introducaometodos.classes;

/**
 *
 * @author Alfredo Albélis
 */

//Crie uma classse estudante com os seguintes atributos:
    //Nome
    //Idade
    //Notas - guardar três notas
//Crie um método pata imprimir os dados e tira a média desse aluno caso a média seja maior que 6 imprimir aprovado, senão reprovado.

public class Estudante {
    private String nome;
    private int idade;
    private double[] notas;
    
    double soma = 0;
    double media = 0;
    
    public void imprime(){
        
        if(notas == null){
            System.out.println("Esse aluno não possui notas");
        }
        System.out.println(this.nome);
        System.out.println(this.idade);

        for (double n : notas){
            media += n;
            System.out.println(n);
        }
        media = media/3;
        if(media > 6){
            System.out.println("Média:" + media + " Situação: Aprovado");
        }else{
            System.out.println("Média:" + media + " Situação: Reprovado");
        }
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        if(idade < 0){
            System.out.println("Nota invalida");
            return;
        }
        this.idade = idade;
    }
    public void setNotas (double[] notas){
        this.notas = notas;
    }
    
    public String getNome(){
        return this.nome;
    }
    public int getidade(){
        return this.idade;
    }
    public double[] getNotas(){
        return this.notas;
    }
}
