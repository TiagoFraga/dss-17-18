/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

import business.SGT;
import javax.swing.JFrame;
import layout.JInicio;


public class Main {
    
    public static void main(String[] args) {
        SGT sgt = new SGT();
        JInicio inicio = new JInicio(sgt);
        inicio.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        inicio.setVisible(true);
    }
    
}
