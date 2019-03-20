/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.sobrescrita.test;

import aulas.javacore.sobrescrita.classes.Pessoa;

/**
 *
 * @author Alfredo Albélis
 */
public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Betina");
        p.setIdade(21);
        System.out.println(p);
        
        Pessoa p2 = new Pessoa();
        p2.setNome("Alfredo");
        p2.setIdade(19);
        System.out.println(p2);
    }
}
