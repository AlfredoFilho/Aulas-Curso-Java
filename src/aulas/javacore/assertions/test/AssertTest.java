/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.assertions.test;

/**
 *
 * @author Alfredo Albélis
 */
public class AssertTest {
    public static void main(String[] args) {
        diaDaSemana(9);
    }
    
    private static void calculaSalario(double salario){
        assert (salario > 0): "Salario n pode ser menor que zero";

    }
    public static void calcSalario(double salario){
        if(salario < 0){
            throw new IllegalArgumentException();
        }
    }
    
    public static void diaDaSemana(int dia){
        switch(dia){
            case 1:break;
            case 2:break;
            case 3:break;
            case 4:break;
            case 5:break;
            case 6:break;
            case 7:break;
            default:assert false;
        }
    }
}
