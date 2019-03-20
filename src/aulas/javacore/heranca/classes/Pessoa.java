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
    protected String nome;
    protected String cpf;
    protected Endereco endereco;    
 
    public Pessoa(String nome){
        System.out.println("Dentro do contrutor de pessoa");
        this.nome = nome;        
    }
    
    static{
        System.out.println("Bloco de inicialização estático de pessoa");
    }
    
    {
        System.out.println("Bloco de inicialização de pessoa 1");
    }
    
    {
        System.out.println("Bloco de inicialização de pessoa 2");
    }
    
    public Pessoa(String nome, String cpf){
        this(nome);    
        this.cpf = cpf;    
    }
    
    public void imprime(){
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
