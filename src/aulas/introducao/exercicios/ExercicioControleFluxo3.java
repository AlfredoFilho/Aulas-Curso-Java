/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.introducao.exercicios;

/**
 *
 * @author Alfredo Albélis
 */
public class ExercicioControleFluxo3 {
    
    public static void main(String[] args) {
        
        int i = 0;
        
        while(i < 10000){
            i++;
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
}