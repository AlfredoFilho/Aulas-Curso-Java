/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.io.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Alfredo Albélis
 */
public class FileWriterReaderTest {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
                
        try {
            FileWriter fw = new FileWriter(file);
            fw.write("Escrevendo uma mensagem no arquivo\nE pulando uma linha 2");
            fw.flush();
            fw.close();
            
            FileReader fr = new FileReader(file);
            char[] in = new char[500];
            int size = fr.read(in);
            System.out.println("Tamanho:" + size);
            
            for(char c : in){
                System.out.print(c);
            }
            fr.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
