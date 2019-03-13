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
public class Arrays2 {
    public static void main(String[] args) {
        //byte, shot, int, long, float, double = 0
        //char '\u00000' ' '
        //boolean false;
        // reference null
        
        String[] nomes = new String[5];
        
        nomes[0] = "Alfredo";
        nomes[1] = "Cleofas";
        nomes[2] = "Felipe";
        nomes[3] = "Pedro";
        nomes[4] = "Vinicius";
        
        for(int i=0; i < nomes.length; i++){
            System.out.println((i + 1)+ " Nome: " + nomes[i]);
        }
    }
}
