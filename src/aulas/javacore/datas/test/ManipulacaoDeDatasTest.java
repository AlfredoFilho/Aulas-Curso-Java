/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.javacore.datas.test;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Alfredo Albélis
 */
public class ManipulacaoDeDatasTest {
    public static void main(String[] args) {
        Date date = new Date();
        date.setTime(date.getTime() + 3_600_000L);
        System.out.println(date);
        
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        if(Calendar.SUNDAY == c.getFirstDayOfWeek()){
            System.out.println("Primeiro dia da semana");
        }
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        c.add(Calendar.HOUR, 24);
        c.roll(Calendar.MONTH, 12);
        Date date2 = c.getTime();
        System.out.println(date2);
        
        //NumberFormat, Loacale, Calenda, Date, Dateformat

    }
}
