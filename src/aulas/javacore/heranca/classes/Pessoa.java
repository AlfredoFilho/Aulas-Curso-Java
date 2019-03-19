/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.heranca.classes;

/**
 *
 * @author Alfredo Albélis
 */
public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;    

    public void Imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereco:");
        System.out.println("- Rua: " + this.endereco.getRua());
        System.out.println("- Bairro: " + this.endereco.getBairro());
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
}
