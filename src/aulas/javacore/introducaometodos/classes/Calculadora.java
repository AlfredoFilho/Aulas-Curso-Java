/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.introducaometodos.classes;

/**
 *
 * @author a193532
 */
public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(5+5);
    }
    
    public void subtraiDoisNumeros(){
            System.out.println(5-1);
    }
    
    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1*num2);
    }
    
    public double divideDoisNumeros(double num1, double num2){
        if(num2 != 0){
            return num1 / num2;
        }
        return 0;             
    }
    
    public void imprimeDoisNumerosDivididos(double num1, double num2){
        if(num2 != 0){
            System.out.println(num1 / num2);
            return;
        }else{
            System.out.println("Não é possivel dividir por 0");
        }   
    }
    
    public void alteraDoisNumeros(int num1, int num2){
        num1 = 30;
        num2 = 40;
        System.out.println("Alterando dois numeros...");
        System.out.println(num1);
        System.out.println(num2);
    }
}
