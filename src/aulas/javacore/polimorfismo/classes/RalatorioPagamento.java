/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.polimorfismo.classes;

/**
 *
 * @author Alfredo Albélis */
public class RalatorioPagamento {
//    public void relatorioPagamentoGerente(Gerente gerente){
//        System.out.println("Gerando relatoriode pagamento para a gerencia");
//        gerente.calcularpagamento();
//        System.out.println("Nome: " + gerente.getNome());
//        System.out.println("Salario desse mês: " + gerente.getSalario());
//    }
//    
//    public void relatorioPagamentoVendedor(Vendedor vendedor){
//        System.out.println("Gerando relatoriode pagamento para a gerencia");
//        vendedor.calcularpagamento();
//        System.out.println("Nome: " + vendedor.getNome());
//        System.out.println("Salario desse mês: " + vendedor.getSalario());
//    }
    
    public void relatorioPagamentoGenerico(Funcionario funcionario){
        System.out.println("Gerando relatoriode pagamento ");
        funcionario.calcularpagamento();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salario desse mês: " + funcionario.getSalario());
    }
}
