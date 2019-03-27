/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.javacore.datas.test;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Alfredo Albélis
 */
public class NumberFormatTest {
    public static void main(String[] args) {
        float valor = 123.4567f;
        Locale locJP = new Locale("jp");
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(locJP);
        nfa[2] = NumberFormat.getCurrencyInstance();
        nfa[3] = NumberFormat.getCurrencyInstance(locJP);
        
        for(NumberFormat nf : nfa){
            System.out.println(nf.format(valor));
        }
        
        NumberFormat  nf = NumberFormat.getInstance();
        System.out.println(nf.getMaximumFractionDigits());
    }
}
