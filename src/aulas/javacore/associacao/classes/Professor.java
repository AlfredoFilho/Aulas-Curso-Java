/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.associacao.classes;

/**
 *
 * @author Alfredo Albélis
 */
public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminario;
    private Local local;

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
    
    public void print(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialização" + this.especialidade);
        System.out.println("Seminarios participantes ");
        for(Seminario semi : seminario){
            System.out.println(semi.getTitulo() + " ");
        }
    }
    
    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }
    
    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    
}
