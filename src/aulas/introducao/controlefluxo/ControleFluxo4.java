/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.introducao.controlefluxo;

/**
 *
 * @author Alfredo Albélis
 */
public class ControleFluxo4 {
    public static void main(String[] args) {
       
        int cont  = 0;
        
        while(cont < 10){
            cont++;
            
            if (cont == 5){
                break;
            }
            
            System.out.println(cont);
        }
       
    }

}
