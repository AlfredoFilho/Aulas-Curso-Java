/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.modificadorestatico.test;

import aulas.javacore.modificadorestatico.classes.Cliente;


/**
 *
 * @author Alfredo Albélis
 */
public class ClienteTest {
    public static void main(String[] args) {
        Cliente cli = new Cliente();
        Cliente cli1 = new Cliente();
        Cliente cli2 = new Cliente();
        
        System.out.println("\n\nExibindo quantidade de parcela possívels");
//        for(int parcelas : cli.getParcelas()){
//            System.out.print(parcelas + " ");
//        }

        System.out.println("Tamanho: " + Cliente.getParcelas().length);
        System.out.println("Tamanho: " + Cliente.getParcelas().length);
        System.out.println("Tamanho: " + Cliente.getParcelas().length);
    }
}
