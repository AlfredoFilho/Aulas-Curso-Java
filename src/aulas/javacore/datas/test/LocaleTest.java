/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.javacore.datas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author Alfredo Albélis
 */
public class LocaleTest {
    public static void main(String[] args) {
        Locale locItaly = new Locale("it","IT");
        Locale locSuica = new Locale("it","CH");
        Calendar c = Calendar.getInstance();
        c.set(2015, Calendar.DECEMBER, 23);
        
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, locSuica);
        System.out.println(df.format(c.getTime()));
        System.out.println(df2.format(c.getTime()));
        
        System.out.println(locItaly.getDisplayLanguage(locSuica));
        
    }
}
