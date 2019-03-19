/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.javacore.associacao.test;

import aulas.javacore.associacao.classes.*;

/**
 *
 * @author Alfredo Albélis
 */
public class AssociacaoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Alfredo Albélis", 19);  
        Aluno aluno2 = new Aluno("Melissa Betina", 91);  
        Seminario sem = new Seminario("Exercicio associação");
        Professor prof = new Professor("João", "Dominar todo o conteudo");
        Local local = new Local("Rua l", "Paulinia");
        
        aluno.setSeminario(sem);
        aluno2.setSeminario(sem);
        
        sem.setProfessor(prof);
        sem.setLocal(local);
        sem.setAluno(new Aluno[]{aluno, aluno2});
        
        Seminario semArray[] = new Seminario[1];
        semArray[0] = sem;
        prof.setSeminario(semArray);
        
        sem.print();
        prof.print();
        aluno.print();
        local.print();
    }
}
