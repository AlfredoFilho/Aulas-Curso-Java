/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.interfaces.test;

import aulas.javacore.interfaces.classes.Produto;

/**
 *
 * @author Alfredo Albélis
 */
public class TesteProduto {
    public static void main(String[] args) {
        Produto p = new Produto("Mesa", 4, 3000);
        p.calculaImposto();
        p.calculaFrete();
        System.out.println(p);
    }
}
