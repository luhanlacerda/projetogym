/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turma;

import java.util.ArrayList;

/**
 *
 * @author ELAINE
 */

    
    public class NegocioTurma implements InferfaceTurma {

      
    @Override
    public void cadastrar(Turma t) throws Exception {
    
        // VALIDAÇÕES
        // Validando códio da turma
        if (t.getCodigo() <= 0) {
            throw new Exception("Informar código.");
        }
 
        // Validando quantidade de alunos na turma
         
       
        
        // Validando matrícicula do instrutor em turma
        if (t.getInstrutor()== null) {
            throw new Exception("Informar a matrícula do Instrutor");
        }
        
        //Validando matrícula do aluno monitor em turma
       
        
        //Validando código da atividade
         if (t.getAtividade().trim().equals("") == true) {
            throw new Exception("Informar o código da Atividade");
        }
        if (t.getAtividade()== null) {
            throw new Exception("Informar o código da Atividade");
        }
        
        //Validando data inicial da aula 
        if (t.getDtinicial()== null) {
            throw new Exception("Informar a data inicial");
        }

        //Validando data final da aula 
        if (t.getDtfinal()== null) {
            throw new Exception("Informar a data final");
        }
        // Validando horário da aula
        if (t.getHorario()== null) {
            throw new Exception("Informar o horário da aula");
        }
        
         // Validando duração da aula
        if (t.getDuracaoaula()== null) {
            throw new Exception("Informar a duração da aula");
        }
    
    }

    @Override
    
    //VALIDAÇÕES
    // Validando dados da atualização
    public void atualizar(Turma t) throws Exception {
          if (t.getCodigo() <= 0) {
            throw new Exception("Informar código.");   
        }
 
        // Validando quantidade de alunos na turma
       
        
        // Validando matrícicula do instrutor em turma
        if (t.getInstrutor()== null) {
            throw new Exception("Informar a matrícula do Instrutor");
        }
        
        //Validando matrícula do aluno monitor em turma
        
        
        //Validando código da atividade
         if (t.getAtividade().trim().equals("") == true) {
            throw new Exception("Informar o código da Atividade");
        }
        if (t.getAtividade()== null) {
            throw new Exception("Informar o código da Atividade");
        }
        
        //Validando data inicial da aula 
        if (t.getDtinicial()== null) {
            throw new Exception("Informar a data inicial");
        }

        //Validando data final da aula  
        if (t.getDtfinal()== null) {
            throw new Exception("Informar a data final");
        }
        // Validando horário da aula
        if (t.getHorario()== null) {
            throw new Exception("Informar o horário da aula");
        }
        
         // Validando duração da aula
        if (t.getDuracaoaula()== null) {
            throw new Exception("Informar a duração da aula");
        }
    }

    @Override
    public void remover(Turma t) throws Exception {
        
    }

    @Override
    public ArrayList<Turma> listar(Turma filtro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean verificaExistencia(Turma a) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
        
    }
    

