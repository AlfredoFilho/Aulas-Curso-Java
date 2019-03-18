/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.modificadorestatico.classes;

/**
 *
 * @author Alfredo Albélis
 */
public class Carro {
    //Velocidade limite deve ser de 22400km/h
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 210;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro() {
        
    }
    
    public void Imprime(){
        System.out.println("--------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + velocidadeLimite);
    }
    
    public String getNome() {
        return nome;
    }
    
    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }
    
    public static double getVelocidadeLimite(){
        return velocidadeLimite;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
   
    
}
