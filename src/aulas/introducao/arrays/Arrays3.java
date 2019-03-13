/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.introducao.arrays;

/**
 *
 * @author Alfredo Albélis
 */
public class Arrays3 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{1,2,3,4,5};
        
//        for(int i = 0; i<numeros2.length; i++){
//            System.out.println(numeros2[i]);
//        }
        
        for(int aux : numeros2){
            System.out.println(aux);
        }
    }
}
