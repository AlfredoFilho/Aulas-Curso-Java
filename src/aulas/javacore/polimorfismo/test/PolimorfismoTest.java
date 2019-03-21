/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.polimorfismo.test;

import aulas.javacore.polimorfismo.classes.*;

/**
 *
 * @author Alfredo Albélis
 */
public class PolimorfismoTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Alfredo", 5000, 2000);
        Vendedor v = new Vendedor("Betina", 2000, 20000);
        RalatorioPagamento r = new RalatorioPagamento();
//        r.relatorioPagamentoGerente(g);
//        System.out.println("---------------------");
//        r.relatorioPagamentoVendedor(v);
        r.relatorioPagamentoGenerico(g);
        System.out.println("---------------------");
        r.relatorioPagamentoGenerico(v);
        
        Funcionario f = g;
        System.out.println("-----------------------");
        System.out.println(f.getSalario());    
                
    }
}
