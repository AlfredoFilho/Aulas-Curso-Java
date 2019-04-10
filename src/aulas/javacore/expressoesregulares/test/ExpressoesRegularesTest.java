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
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+\\.([a-zA-Z])";
        String texto = "fulano@hotmail.com, 102abc@gmail.com, #@!abrao@mail.com, teste@gmail.com, teste@mail.com";
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
