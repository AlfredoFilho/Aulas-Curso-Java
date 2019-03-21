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
        Object o = null;
        
        int a = 10;
        int b = 0;
        if(b != 0){
            int c = a / b;
            System.out.println(a);
        }
        int[] H = new int[2];
        
        System.out.println(a[2]);
    }
}
