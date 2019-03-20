/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.classesabstratas.test;

import aulas.javacore.classesabstratas.classes.*;

/**
 *
 * @author a193532
 */
public class FuncionarioTest {
    public static void main(String[] args) {
        
        Gerente g = new Gerente("Betina", "65432-1", 2000);
        Vendedor v = new Vendedor("Alfredo", "12345-6", 1500, 5000);
        v.calculaSalario();
        g.calculaSalario();
        System.out.println(g);
        System.out.println("------------------------------");
        System.out.println(v);
    }
}
