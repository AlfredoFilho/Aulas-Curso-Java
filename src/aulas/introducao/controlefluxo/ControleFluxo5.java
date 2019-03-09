/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.introducao.controlefluxo;

/**
 *
 * @author a193532
 */
public class ControleFluxo5 {
    public static void main(String[] args) {
        
        //Dado un valor de um carro descubra em quantas vezes ele pode ser parcelado
        //Porém as parcelas não podem ser menores que 1000
        
        double valorTotal = 30000;
        
        for(int parcela = 1; parcela <= valorTotal; parcela++){
            double valorParcela = valorTotal / parcela;
            
            if(valorParcela < 1000){
                break;
            }
            System.out.println("Parcela: " + parcela + "R$: " + valorParcela);
            }
        }       
    }
