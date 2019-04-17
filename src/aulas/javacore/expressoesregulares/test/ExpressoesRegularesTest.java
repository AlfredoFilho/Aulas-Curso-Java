/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.javacore.expressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Alfredo Albélis
 */
public class ExpressoesRegularesTest {
    public static void main(String[] args) {
        // \d - todos os digitos
        // \D - tudo que não for digito
        // \s - espaços em branco
        // \S - caractere que não é branco
        // \w - a-z A-Z, digitos e _
        // \W- tudo o que não for caractere de palavra
        // []
        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n,m} n até m
        // ()
        // |
        // $
        // . coringa
        
//        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
//        String texto = "12 0x 0x 0xFFABC 0X10G 0X1";
        //String regex = "(([\\w\\._-])+@([a-zA-Z])+\\.([a-zA-Z])+)+";
        String regex = "\\d{2}/\\d{2}/\\d{2,4}";
        String texto = "05/10/2010 05/05/2015 1/1/01 01/05/95";
        System.out.println("fulano@hotmail.com".matches(regex));
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto: " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Expressão: " + matcher.pattern());
        System.out.println("posições encontradas");
        while(matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
