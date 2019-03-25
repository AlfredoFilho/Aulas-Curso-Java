/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.exception.CheckedException.test;

import aulas.javacore.exception.CheckedException.classes.Leitor1;
import aulas.javacore.exception.CheckedException.classes.Leitor2;


/**
 *
 * @author Alfredo Albélis
 */
public class TryWithResourcesTest {
    public static void main(String[] args) {
        lerArquivo();
    }
    public static void lerArquivo(){
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()){
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
