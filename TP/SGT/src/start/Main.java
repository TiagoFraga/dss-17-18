/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

import business.SGT;
import layout.JInicio;

/**
 *
 * @author tiagofraga
 */
public class Main {
    
    public static void main(String[] args) {
        SGT sgt = new SGT();
        JInicio inicio = new JInicio(sgt);
    }
    
}
