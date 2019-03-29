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
        
        String regex = "\\d";
        String texto = "fsdfs12ss64ssfsf32s13";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto: " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Expressão: " + matcher.pattern());
        System.out.println("posições encontradas");
        while(matcher.find()){
            System.out.print(matcher.start() + " ");
        }
    }
}
