/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.resourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;


/**
 *
 * @author Alfredo Albélis
 */
public class ResourceBundleTest {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("good.morning"));
        System.out.println(rb.getString("show"));
        
        rb = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("good.morning"));
        System.out.println(rb.getString("show"));
    }
}
