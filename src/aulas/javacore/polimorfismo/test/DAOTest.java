/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.polimorfismo.test;

import aulas.javacore.polimorfismo.classes.ArquivoDAOImpl;
import aulas.javacore.polimorfismo.classes.GenericDAO;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Alfredo Albélis
 */
public class DAOTest {

    public static void main(String[] args) {
        GenericDAO arquivoDAO = new ArquivoDAOImpl();
        arquivoDAO.save();
        List<String> lista = new LinkedList<>();
        lista.add("nome1");
        lista.add("nome2");
        lista.add("nome3");
        lista.add("nome4");
        for(String nome : lista)
            System.out.println(nome);
    }
}
