/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.exception.runtimeexception.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author Alfredo Albélis
 */
public class MultiplasRuntimeExceptionTest {
    public static void main(String[] args) {
        try{
            throw new IndexOutOfBoundsException();
        }catch(IllegalArgumentException | IndexOutOfBoundsException | ArithmeticException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }
        System.out.println("Final do programa");
        try{
            talvezLanceException();
        }catch(SQLException | IOException e){
            
        }
    }
    private static void talvezLanceException() throws SQLException, FileNotFoundException, IOException{
        
    }
}
