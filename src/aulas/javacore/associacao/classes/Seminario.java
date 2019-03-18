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

//Crie um Sistema que gerenia seminários
//Deverá cadastrar os seminários, cadastrar os alunos, cadastrar os professores e cadastrar um local
//Um aluno podera estar em apenas um seminario
//um seminario poderá ter nenhum ou vários alunos
//Um professor poderá ministrar 
//Um seminário só poderá ster um professor
//Um seminário deverá ter um local

//Seminário: titulo
//Aluno: Nome e idade
//Professor: Mome e especialidaade
//Local: Rua e bairro

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;
    
    public Seminario() {
    }
    
    public Seminario(String Titulo) {
        this.titulo = Titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
    
    public void print(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Professor palestrante " + this.professor.getNome());
        System.out.println("Local, rua" + this.local.getRua() + "Bairro: " + this.local.getBairro());
        System.out.println("Alunos participante");
        for(Aluno aluno : alunos)
            System.out.println("Nome " + aluno.getNome());
    }
    
    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public Aluno[] getAluno() {
        return alunos;
    }

    public void setAluno(Aluno[] aluno) {
        this.alunos = aluno;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String Titulo) {
        this.titulo = Titulo;
    }
    
    
}
