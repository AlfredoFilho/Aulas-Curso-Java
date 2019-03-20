/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.enumeracao.classes;

/**
 *
 * @author Alfredo Albélis
 */
public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"), PESSOA_JURIDICA(2, "Pessoa Juridica"){
        public String getId(){
            return "B";
        }
    };
    
    private int tipo;
    private String nome;
    
    TipoCliente(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public String getId(){
        return "A";
    }
    
    public String getNome() {
        return nome;
    }

    public int getTipo() {
        return tipo;
    }
}
