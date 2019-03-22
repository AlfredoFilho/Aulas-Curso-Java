/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.exception.CheckedException.classes;

/**
 *
 * @author Alfredo Albélis
 */
public class Leitor1 implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Fechando leitor 1");
    }
    
}
