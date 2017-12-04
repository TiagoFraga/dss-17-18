/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgt;

import sgt.layout.AAInicio1;

/**
 *
 * @author cp74
 */
public class SGT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AAInicio1().setVisible(true);
            }
       });
               
        
    }
    
}
