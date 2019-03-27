/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.javacore.Strings.test;

/**
 *
 * @author Alfredo Albélis
 */
public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto: " + (fim-inicio) + "ms");
        
        inicio = System.currentTimeMillis();
        concatStringBuilder(100000000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuilder: " + (fim-inicio) + "ms");
        
        inicio = System.currentTimeMillis();
        concatStringBuffer(100000000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuffer: " + (fim-inicio) + "ms");
    }
    public static void concatString(int tam){
        String string = "";
        for (int i=0;  i<tam;i++){
            string +=  1;
        }
    }
    
    public static void concatStringBuilder(int tam){
        StringBuilder sb = new StringBuilder(tam);
        for (int i=0;  i<tam;i++){
            sb.append(i);
        }
    }
    
    public static void concatStringBuffer(int tam){
        StringBuffer sb = new StringBuffer(tam);
        for (int i=0;  i<tam;i++){
            sb.append(i);
        }
    }
}
