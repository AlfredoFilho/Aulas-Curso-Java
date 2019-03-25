/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.exception.CheckedException.test;

import aulas.javacore.exception.CheckedException.classes.*;
import java.io.FileNotFoundException;

/**
 *
 * @author Alfredo Albélis
 */
public class SobrescritaComExceptionsTest {
    public static void main(String[] args) throws FileNotFoundException {
        Funcionario f = new Funcionario();
        Pessoa p = new Pessoa();
        
        f.salvar();
    }
}
