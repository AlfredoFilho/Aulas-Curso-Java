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
public class StringTest {
    public static void main(String[] args) {
        String nome = "Alfredo";
        nome = nome.concat(" Albélis");
        String nome2 = "Alfredo";
        String nome3 = new String("Betina");
        System.out.println(nome);
        
        String test = "  Nicolas";
        String test2 = "Bento";
        System.out.println(test.charAt(3));
        System.out.println(test.equals(test2));
        System.out.println(test.length());
        System.out.println(test2.replace('e', 'a'));
        System.out.println(test2.toLowerCase());
        System.out.println(test2.toUpperCase());
        System.out.println(test.substring(0,2));
        System.out.println(test.trim());
    }
}
