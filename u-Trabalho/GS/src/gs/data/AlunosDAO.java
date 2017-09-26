/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gs.data;

import gs.business.Alunos;

/**
 *
 * @author tiagofraga
 */
public class AlunosDAO {

    public static Alunos listAllAlunos() {
        Alunos a = new Alunos(); //TODO: load from database
        a.addAluno("Tiago Fraga", "A74092");
        a.addAluno("Ricardo Cardante", "A75123");
        a.addAluno("Cesario Perneta", "A74123");
        
        return a;
    } 
    
}
