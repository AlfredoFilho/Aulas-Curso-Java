/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.heranca.test;

import aulas.javacore.heranca.classes.*;

/**
 *
 * @author Alfredo Albélis
 */
public class HerancaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Endereco end = new Endereco();
        Funcionario func = new Funcionario();
        
        p.setNome("Alfredo");
        p.setCpf("12345678911");
        
        end.setRua("1 de Abril");
        end.setBairro("Tupini");
        
        func.setNome("Alberto");
        func.setCpf("12345");
        func.setEndereco(end);
        func.setSalario(1500);
        
        p.setEndereco(end);
        
        p.Imprime();
    }
}
