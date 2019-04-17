/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.io.test;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alfredo Albélis
 */
public class FileTest {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try {
            boolean createNewFile = file.createNewFile();
            System.out.println(createNewFile);
        } catch (IOException ex) {
            Logger.getLogger(FileTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
