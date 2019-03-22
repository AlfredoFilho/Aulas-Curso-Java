/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.exception.CheckedException.test;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alfredo Albélis
 */
public class CheckedExceptionTest {
    public static void main(String[] args) throws IOException {
        abrirArquivo();
    }
    
    public static void abrirArquivo() throws IOException{
        File file = new File("Test.txt");
        try{
            System.out.println("Abrindo um arquivo");
            System.out.println("Executando a leitudo do arquivo");
            throw new Exception();
            //System.out.println("Escrevendo no arquivo");
        }catch(Exception e){
            System.out.println("Dentro do catch");
            e.printStackTrace();
        } finally{
            System.out.println("Fechar o arquivo");
        }
    }
}
