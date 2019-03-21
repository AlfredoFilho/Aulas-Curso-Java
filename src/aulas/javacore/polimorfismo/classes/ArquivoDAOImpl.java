/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.polimorfismo.classes;

/**
 *
 * @author Alfredo Albélis
 */
public class ArquivoDAOImpl implements GenericDAO{

    @Override
    public void save() {
        System.out.println("Salvando dados nos arquivos");
    }
    
}
