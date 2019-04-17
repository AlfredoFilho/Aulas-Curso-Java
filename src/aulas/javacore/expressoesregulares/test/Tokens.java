/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.expressoesregulares.test;

/**
 *
 * @author Alfredo Albélis
 */
public class Tokens {
    public static void main(String[] args) {
        String str = "Willian1 Paulo2 Joana3 Camila4 Anna4 Jhon5 Matheus6";
        String[] tokens = str.split("\\d");
        for (String arr: tokens){
            System.out.println(arr.trim());
        }
    }
}
