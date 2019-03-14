/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.sobrecargametodos.test;

import aulas.javacore.sobrecargametodos.classe.Funcionario;

/**
 *
 * @author Alfredo Albélis
 */
public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("Alfredo", "12345678911", 5000, "123456789");
        Funcionario func2 = new Funcionario();
        
        func.imprime();
        func2.imprime();
    }
}
