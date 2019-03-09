/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.introducao.arrays;

/**
 *
 * @author a193532
 */
public class Arrays5 {
    public static void main(String[] args) {
        int[][] dias = new int[2][2];
        dias[0][0] = 30;
        dias[0][1] = 31;
        dias[1][0] = 29;
        dias[1][1] = 28;
        
        for(int i =0; i < dias.length; i++){
            for(int j = 0; j < dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
        }
        
        System.out.println("----------------------------------------");
        
        for(int[] ref : dias){
            for(int dia : ref){
                System.out.println(dia);
            }
        }
    }
}
