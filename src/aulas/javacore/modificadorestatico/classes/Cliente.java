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
public class Cliente {
    private static int[] parcelas;
    
    static {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicialização");
        for(int i=1; i<=100; i++){
           parcelas[i-1] = i;
        }
    }
    
    public Cliente(){
        System.out.println("Dentro do construtor");
    }
    
    public static int[] getParcelas() {
        return parcelas;
    }
    
}
