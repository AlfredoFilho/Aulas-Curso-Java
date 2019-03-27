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
public class StringBuilderTest {
    public static void main(String[] args) {
        String s = "Uma frase comum";
        StringBuilder sb = new StringBuilder(10);
        sb.append("def").insert(3, "ghi").reverse().delete(2, 4);
        System.out.println(sb);
    }
}
