/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.javacore.datas.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Alfredo Albélis
 */
public class SimpleDateFormatTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        String mascara = "yyyy.MM.dd G 'at' HH:mm:ss z";
        SimpleDateFormat formatador = new SimpleDateFormat(mascara);
        System.out.println(formatador.format(c.getTime()));
    }
}
