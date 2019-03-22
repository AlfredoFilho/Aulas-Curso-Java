/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.exception.runtimeexception.test;

/**
 *
 * @author Alfredo Albélis
 */
public class RumTimeExceptionTest {
    public static void main(String[] args) {
        try{
            divisao(10,0);
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
    }
    private static void divisao(int num1, int num2){
        if(num2 == 0){
            throw  new IllegalArgumentException("Passe um valor diferente de 0 para num2" );
        }
        
        double result = num1/num2;
        System.out.println(result);
    }
}
