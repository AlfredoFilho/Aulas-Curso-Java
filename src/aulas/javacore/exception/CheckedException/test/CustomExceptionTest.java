/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.exception.CheckedException.test;

import aulas.javacore.exception.customexception.loginInvalidoException;

/**
 *
 * @author Alfredo Albélis
 */
public class CustomExceptionTest {
    public static void main(String[] args) {
        try{
            logar();
        }catch(loginInvalidoException e){
            e.printStackTrace();
        }
    }
    
    public static void logar() throws loginInvalidoException{
        String usuarioBancoDeDados = "Alfredo";
        String senhaBancoDeDados = "111";
        String usuarioDigitado = "Alfredo";
        String senhaDigitada = "123";
        if(!usuarioBancoDeDados.equals(usuarioDigitado) || !senhaBancoDeDados.equals(senhaDigitada)){
            throw new loginInvalidoException();
        }else{
            System.out.println("Logado");
        }
    }
}
