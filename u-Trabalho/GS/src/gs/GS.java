/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gs;

import gs.business.Alunos;
import gs.layout.MainWindow;

/**
 *
 * @author tiagofraga
 */
public class GS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alunos a = new Alunos();
        a.loadAlunos();
        
        MainWindow m = new MainWindow(a);
        m.setVisible(true);
    }
    
}
