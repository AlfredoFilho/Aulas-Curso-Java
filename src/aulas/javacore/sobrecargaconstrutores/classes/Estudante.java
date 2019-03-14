/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.sobrecargaconstrutores.classes;

/**
 *
 * @author Alfredo Albélis
 */
public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;
    private String dataMatricula;
    
    public Estudante(String matricula, String nome, double[] notas){
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }
    
    public Estudante(String matricula, String nome, double[] notas, String dataMatricula){
        this(matricula, nome, notas);
        this.dataMatricula = dataMatricula;
    }
    
    public Estudante(){
        System.out.println("Teste");
    }
    
    public void imprime(){
        System.out.println(this.matricula);
        System.out.println(this.nome);
        for (double n : notas){
            System.out.println(n + " ");
        }
        System.out.println(this.dataMatricula);
        
    }
    
    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
        
}
