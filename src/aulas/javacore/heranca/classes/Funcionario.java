/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.heranca.classes;

/**
 *
 * @author Alfedo Albélis
 */
public class Funcionario extends Pessoa{
    
    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de funcionário");
    }
    
    static{
        System.out.println("Bloco de inicialização estático de funcionário");
    }
    
    {
        System.out.println("Bloco de inicialização de funcionário 1");
    }
    
    {
        System.out.println("Bloco de inicialização de funcionário2");
    }
    
    private double salario;
    
    public void imprime(){
        super.imprime();
        System.out.println("Salário: " + this.salario);
        imprimeReciboPagamento();
    }
    
    public void imprimeReciboPagamento(){
        System.out.println("Eu " + super.nome + " recebi o pagamento de: " + this.salario);
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
