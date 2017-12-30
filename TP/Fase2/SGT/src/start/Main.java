/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

import business.SGT;
import business.aulas.Turno;
import business.aulas.UnidadeCurricular;
import business.pessoal.Aluno;
import business.pessoal.Professor;
import business.pessoal.Utilizador;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JFrame;
import layout.JInicio;


public class Main {
    
    public static void main(String[] args) {
        UnidadeCurricular u1 = new UnidadeCurricular("HN1", "Desenvolvimento de Sistemas de Software", "DSS",3);
        UnidadeCurricular u2 = new UnidadeCurricular("HN2", "Programação Imperativa", "PI",1);
        UnidadeCurricular u3 = new UnidadeCurricular("HN3", "Programação Funcional", "PF",1);
        UnidadeCurricular u4 = new UnidadeCurricular("HN4", "Sistemas Operativos", "SO",2);
        UnidadeCurricular u5 = new UnidadeCurricular("HN5", "Sistemas Distribuidos", "SD",3);
        
        Turno t1 = new Turno("9h-11h", "Segunda-Feira", "H1", "TP1", 30, 50, "DI-A1");
        Turno t2 = new Turno("9h-11h", "Segunda-Feira", "H2", "TP2", 30, 50, "DI-A1");
        Turno t3 = new Turno("9h-11h", "Segunda-Feira", "H3", "TP3", 30, 50, "DI-A1");
        Turno t4 = new Turno("9h-11h", "Segunda-Feira", "H4", "TP4", 30, 50, "DI-A1");
        Turno t5 = new Turno("9h-11h", "Segunda-Feira", "H5", "TP5", 30, 50, "DI-A1");
        
        Turno t6 = new Turno("9h-11h", "Segunda-Feira", "H6", "TP1", 30, 50, "DI-A1");
        Turno t7 = new Turno("9h-11h", "Segunda-Feira", "H7", "TP2", 30, 50, "DI-A1");
        Turno t8 = new Turno("9h-11h", "Segunda-Feira", "H8", "TP3", 30, 50, "DI-A1");
        Turno t9 = new Turno("9h-11h", "Segunda-Feira", "H9", "TP4", 30, 50, "DI-A1");
        Turno t10 = new Turno("9h-11h", "Segunda-Feira", "H10", "TP5", 30, 50, "DI-A1");
        
        Turno t11 = new Turno("9h-11h", "Segunda-Feira", "H11", "TP1", 30, 50, "DI-A1");
        Turno t12 = new Turno("9h-11h", "Segunda-Feira", "H12", "TP2", 30, 50, "DI-A1");
        Turno t13 = new Turno("9h-11h", "Segunda-Feira", "H13", "TP3", 30, 50, "DI-A1");
        Turno t14 = new Turno("9h-11h", "Segunda-Feira", "H14", "TP4", 30, 50, "DI-A1");
        Turno t15 = new Turno("9h-11h", "Segunda-Feira", "H15", "TP5", 30, 50, "DI-A1");
        
        Turno t16 = new Turno("9h-11h", "Segunda-Feira", "H16", "TP1", 30, 50, "DI-A1");
        Turno t17 = new Turno("9h-11h", "Segunda-Feira", "H17", "TP2", 30, 50, "DI-A1");
        Turno t18 = new Turno("9h-11h", "Segunda-Feira", "H18", "TP3", 30, 50, "DI-A1");
        Turno t19 = new Turno("9h-11h", "Segunda-Feira", "H19", "TP4", 30, 50, "DI-A1");
        Turno t20 = new Turno("9h-11h", "Segunda-Feira", "H20", "TP5", 30, 50, "DI-A1");
        
        Turno t21 = new Turno("9h-11h", "Segunda-Feira", "H21", "TP1", 30, 50, "DI-A1");
        Turno t22 = new Turno("9h-11h", "Segunda-Feira", "H22", "TP2", 30, 50, "DI-A1");
        Turno t23 = new Turno("9h-11h", "Segunda-Feira", "H23", "TP3", 30, 50, "DI-A1");
        Turno t24 = new Turno("9h-11h", "Segunda-Feira", "H24", "TP4", 30, 50, "DI-A1");
        Turno t25 = new Turno("9h-11h", "Segunda-Feira", "H25", "TP5", 30, 50, "DI-A1");
        
        
        
        Aluno a1 = new Aluno(false, 74092, "Tiago Fraga", "a74092@uminho.pt", "putas");
        HashMap<UnidadeCurricular,Turno> cadeiras1 = new HashMap<UnidadeCurricular,Turno>();
        Aluno a2 = new Aluno(true, 1, "Ricardo Cardante", "a1@uminho.pt", "putas");
        HashMap<UnidadeCurricular,Turno> cadeiras2 = new HashMap<UnidadeCurricular,Turno>();
        Aluno a3 = new Aluno(false, 2, "Cesario Miguel", "a2@uminho.pt", "putas");
        HashMap<UnidadeCurricular,Turno> cadeiras3 = new HashMap<UnidadeCurricular,Turno>();
        Aluno a4 = new Aluno(false, 3, "Duarte Freitas", "a3@uminho.pt", "putas");
        HashMap<UnidadeCurricular,Turno> cadeiras4 = new HashMap<UnidadeCurricular,Turno>();
        Aluno a5 = new Aluno(false, 4, "Pedro Marta", "a4@uminho.pt", "putas");
        HashMap<UnidadeCurricular,Turno> cadeiras5 = new HashMap<UnidadeCurricular,Turno>();
        Aluno a6 = new Aluno(false, 5, "Joao Gomes", "a5@uminho.pt", "putas");
        HashMap<UnidadeCurricular,Turno> cadeiras6 = new HashMap<UnidadeCurricular,Turno>();
        Aluno a7 = new Aluno(false, 6, "Joao Reis", "a6@uminho.pt", "putas");
        HashMap<UnidadeCurricular,Turno> cadeiras7 = new HashMap<UnidadeCurricular,Turno>();
        
        
        Professor a8 = new Professor(true,"PRH",7 , "Pedro Rangel", "pg7@uminho.pt", "putas");
        HashMap<UnidadeCurricular,ArrayList<Turno>> cadeiras8 = new HashMap<UnidadeCurricular,ArrayList<Turno>>();
        Professor a9 = new Professor(false,"Creissac",8 , "Jose Creissac", "pg8@uminho.pt", "putas");
        HashMap<UnidadeCurricular,ArrayList<Turno>> cadeiras9 = new HashMap<UnidadeCurricular,ArrayList<Turno>>();
        Professor a10 = new Professor(false,"JBB",9 , "Jose Bernardo Barros", "pg9@uminho.pt", "putas");
        HashMap<UnidadeCurricular,ArrayList<Turno>> cadeiras10 = new HashMap<UnidadeCurricular,ArrayList<Turno>>();
        Professor a11 = new Professor(false,"JNO",10 , "Jose Nuno Oliveira", "pg10@uminho.pt", "putas");
        HashMap<UnidadeCurricular,ArrayList<Turno>> cadeiras11 = new HashMap<UnidadeCurricular,ArrayList<Turno>>();
        Professor a12 = new Professor(false,"VFF",11 , "Vitor Fontes", "pg11@uminho.pt", "putas");
        HashMap<UnidadeCurricular,ArrayList<Turno>> cadeiras12 = new HashMap<UnidadeCurricular,ArrayList<Turno>>();
        Professor a13 = new Professor(false,"Nestor",12 , "Nestor", "pg12@uminho.pt", "putas");
        
        
        u1.setRegente((Professor) a9);
        u2.setRegente((Professor) a10);
        u3.setRegente((Professor) a11);
        u4.setRegente((Professor) a12);
        u5.setRegente((Professor) a13);
        
        ArrayList<Professor> listaP = new ArrayList<Professor>();
        listaP.add((Professor) a8);
        listaP.add((Professor) a9);
        listaP.add((Professor) a10);
        listaP.add((Professor) a11);
        listaP.add((Professor) a12);
        listaP.add((Professor) a13);
        
        
        u1.setProfessores(listaP);
        u2.setProfessores(listaP);
        u3.setProfessores(listaP);
        u4.setProfessores(listaP);
        u5.setProfessores(listaP);
        
        
        
        ArrayList<Turno> listaT1 = new ArrayList<Turno>();
        listaT1.add(t1);
        listaT1.add(t2);
        listaT1.add(t3);
        listaT1.add(t4);
        listaT1.add(t5);
        
        u1.setTurnos(listaT1);
        
        
        ArrayList<Turno> listaT2 = new ArrayList<Turno>();
        listaT2.add(t6);
        listaT2.add(t7);
        listaT2.add(t8);
        listaT2.add(t9);
        listaT2.add(t10);
        
        u2.setTurnos(listaT2);
        
        ArrayList<Turno> listaT3 = new ArrayList<Turno>();
        listaT3.add(t11);
        listaT3.add(t12);
        listaT3.add(t13);
        listaT3.add(t14);
        listaT3.add(t15);
        
        u3.setTurnos(listaT3);
        
        ArrayList<Turno> listaT4 = new ArrayList<Turno>();
        listaT4.add(t16);
        listaT4.add(t17);
        listaT4.add(t18);
        listaT4.add(t19);
        listaT4.add(t20);
        
        u4.setTurnos(listaT4);
        
        
        ArrayList<Turno> listaT5 = new ArrayList<Turno>();
        listaT5.add(t21);
        listaT5.add(t22);
        listaT5.add(t23);
        listaT5.add(t24);
        listaT5.add(t25);
        
        u5.setTurnos(listaT5);
        
        
        HashMap<Aluno,Integer> faltas1 = new HashMap<Aluno,Integer>();
        HashMap<Aluno,Integer> faltas2 = new HashMap<Aluno,Integer>();
        HashMap<Aluno,Integer> faltas3 = new HashMap<Aluno,Integer>();
        HashMap<Aluno,Integer> faltas4 = new HashMap<Aluno,Integer>();
        HashMap<Aluno,Integer> faltas5 = new HashMap<Aluno,Integer>();
        
        faltas1.put((Aluno) a1, 0);
        t1.setProfALecionar((Professor) a8);
        t1.setFaltas(faltas1);
        
        faltas2.put((Aluno) a2, 0);
        t2.setFaltas(faltas2);
        t2.setProfALecionar((Professor) a9);
        
        faltas3.put((Aluno) a3, 0);
        t3.setFaltas(faltas3);
        t3.setProfALecionar((Professor) a10);
        
        faltas4.put((Aluno) a4, 0);
        t4.setFaltas(faltas4);
        t4.setProfALecionar((Professor) a11);
        
        faltas5.put((Aluno) a5, 0);
        faltas5.put((Aluno) a6, 0);
        faltas5.put((Aluno) a7, 0);
        t5.setFaltas(faltas5);
        t5.setProfALecionar((Professor) a12);
        
        
        
        HashMap<Aluno,Integer> faltas6 = new HashMap<Aluno,Integer>();
        HashMap<Aluno,Integer> faltas7 = new HashMap<Aluno,Integer>();
        HashMap<Aluno,Integer> faltas8 = new HashMap<Aluno,Integer>();
        HashMap<Aluno,Integer> faltas9 = new HashMap<Aluno,Integer>();
        HashMap<Aluno,Integer> faltas10 = new HashMap<Aluno,Integer>();
        
        faltas6.put((Aluno) a1, 0);
        t6.setFaltas(faltas6);
        t6.setProfALecionar((Professor) a13);
        
        faltas7.put((Aluno) a2, 0);
        t7.setFaltas(faltas7);
        t7.setProfALecionar((Professor) a8);
        
        faltas8.put((Aluno) a3, 0);
        t8.setFaltas(faltas8);
        t8.setProfALecionar((Professor) a9);
        
        faltas9.put((Aluno) a4, 0);
        t9.setFaltas(faltas9);
        t9.setProfALecionar((Professor) a10);
        
        faltas10.put((Aluno) a5, 0);
        t10.setFaltas(faltas10);
        t10.setProfALecionar((Professor) a11);
        
        faltas6.put((Aluno) a6, 0);
        faltas6.put((Aluno) a7, 0);
        t6.setFaltas(faltas6);
        
        
        HashMap<Aluno,Integer> faltas11= new HashMap<Aluno,Integer>();
        HashMap<Aluno,Integer> faltas12 = new HashMap<Aluno,Integer>();
        HashMap<Aluno,Integer> faltas13 = new HashMap<Aluno,Integer>();
        HashMap<Aluno,Integer> faltas14 = new HashMap<Aluno,Integer>();
        HashMap<Aluno,Integer> faltas15 = new HashMap<Aluno,Integer>();
        
        faltas11.put((Aluno) a1, 0);
        t11.setFaltas(faltas11);
        t11.setProfALecionar((Professor) a12);
        
        faltas12.put((Aluno) a2, 0);
        t12.setFaltas(faltas12);
        t12.setProfALecionar((Professor) a13);
        
        faltas13.put((Aluno) a3, 0);
        t13.setFaltas(faltas13);
        t13.setProfALecionar((Professor) a8);
        
        faltas14.put((Aluno) a4, 0);
        t14.setFaltas(faltas14);
        t14.setProfALecionar((Professor) a9);
        
        faltas15.put((Aluno) a5, 0);
        t15.setFaltas(faltas15);
        t15.setProfALecionar((Professor) a10);
        
        faltas11.put((Aluno) a6, 0);
        faltas11.put((Aluno) a7, 0);
        t11.setFaltas(faltas11);        
        
        
        
        HashMap<Aluno,Integer> faltas16 = new HashMap<Aluno,Integer>();
        HashMap<Aluno,Integer> faltas17 = new HashMap<Aluno,Integer>();
        HashMap<Aluno,Integer> faltas18 = new HashMap<Aluno,Integer>();
        HashMap<Aluno,Integer> faltas19 = new HashMap<Aluno,Integer>();
        HashMap<Aluno,Integer> faltas20 = new HashMap<Aluno,Integer>();
        
        
        faltas16.put((Aluno) a1, 0);
        t16.setFaltas(faltas16);
        t16.setProfALecionar((Professor) a11);
        
        faltas17.put((Aluno) a2, 0);
        t17.setFaltas(faltas17);
        t17.setProfALecionar((Professor) a12);
        
        faltas18.put((Aluno) a3, 0);
        t18.setFaltas(faltas18);
        t18.setProfALecionar((Professor) a13);
        
        faltas19.put((Aluno) a4, 0);
        t19.setFaltas(faltas19);
        t19.setProfALecionar((Professor) a8);
        
        faltas20.put((Aluno) a5, 0);
        t20.setFaltas(faltas20);
        t20.setProfALecionar((Professor) a9);
        
        faltas16.put((Aluno) a6, 0);
        faltas16.put((Aluno) a7, 0);
        t16.setFaltas(faltas16);
        
        
        
        
        HashMap<Aluno,Integer> faltas21 = new HashMap<Aluno,Integer>();
        HashMap<Aluno,Integer> faltas22 = new HashMap<Aluno,Integer>();
        HashMap<Aluno,Integer> faltas23 = new HashMap<Aluno,Integer>();
        HashMap<Aluno,Integer> faltas24 = new HashMap<Aluno,Integer>();
        HashMap<Aluno,Integer> faltas25 = new HashMap<Aluno,Integer>();
        
        faltas21.put((Aluno) a1, 0);
        t21.setFaltas(faltas21);
        t21.setProfALecionar((Professor) a10);
        
        faltas22.put((Aluno) a2, 0);
        t22.setFaltas(faltas22);
        t22.setProfALecionar((Professor) a10);
        
        faltas23.put((Aluno) a3, 0);
        t23.setFaltas(faltas23);
        t23.setProfALecionar((Professor) a10);
        
        faltas24.put((Aluno) a4, 0);
        t24.setFaltas(faltas24);
        t24.setProfALecionar((Professor) a10);
        
        faltas25.put((Aluno) a5, 0);
        faltas25.put((Aluno) a6, 0);
        faltas25.put((Aluno) a7, 0);
        t25.setProfALecionar(a10);
        t25.setFaltas(faltas25);
        
        cadeiras1.put(u1, t1);
        cadeiras1.put(u2, t6);
        cadeiras1.put(u3, t11);
        cadeiras1.put(u4, t16);
        cadeiras1.put(u5, t21);
        
        a1.setCadeiras(cadeiras1);
        
        cadeiras2.put(u1, t2);
        cadeiras2.put(u2, t7);
        cadeiras2.put(u3, t12);
        cadeiras2.put(u4, t17);
        cadeiras2.put(u5, t22);
        
        a2.setCadeiras(cadeiras2);
        
        cadeiras3.put(u1, t3);
        cadeiras3.put(u2, t8);
        cadeiras3.put(u3, t13);
        cadeiras3.put(u4, t18);
        cadeiras3.put(u5, t23);
        
        a3.setCadeiras(cadeiras3);
        
        
        cadeiras4.put(u1, t4);
        cadeiras4.put(u2, t9);
        cadeiras4.put(u3, t14);
        cadeiras4.put(u4, t19);
        cadeiras4.put(u5, t24);
        
        a4.setCadeiras(cadeiras4);
        
        cadeiras5.put(u1, t5);
        cadeiras5.put(u2, t10);
        cadeiras5.put(u3, t15);
        cadeiras5.put(u4, t20);
        cadeiras5.put(u5, t25);
        
        a5.setCadeiras(cadeiras5);
        
        cadeiras6.put(u1, t5);
        cadeiras6.put(u2, t6);
        cadeiras6.put(u3, t11);
        cadeiras6.put(u4, t16);
        cadeiras6.put(u5, t21);
        
        a6.setCadeiras(cadeiras6);
        
        cadeiras7.put(u1, t5);
        cadeiras7.put(u2, t6);
        cadeiras7.put(u3, t11);
        cadeiras7.put(u4, t16);
        cadeiras7.put(u5, t21);
        
        a7.setCadeiras(cadeiras7);
        
        //Professores
        
        a8.addUcs(u1);
        a8.addUcs(u2);
        a8.addUcs(u3);
        a8.addUcs(u4);
        a8.adicionaTurnos(u1,t1);
        a8.adicionaTurnos(u2,t7);
        a8.adicionaTurnos(u3,t13);
        a8.adicionaTurnos(u4,t19);
        
        a9.addUcs(u1);
        a9.addUcs(u2);
        a9.addUcs(u3);
        a9.addUcs(u4);
        a9.adicionaTurnos(u1,t2);
        a9.adicionaTurnos(u2,t8);
        a9.adicionaTurnos(u3,t14);
        a9.adicionaTurnos(u4,t20);
        
        a10.addUcs(u1);
        a10.addUcs(u2);
        a10.addUcs(u3);
        a10.addUcs(u5);
        a10.adicionaTurnos(u1,t3);
        a10.adicionaTurnos(u2,t9);
        a10.adicionaTurnos(u3,t15);
        a10.adicionaTurnos(u5,t21);
        a10.adicionaTurnos(u5,t22);
        a10.adicionaTurnos(u5,t23);
        a10.adicionaTurnos(u5,t24);
        a10.adicionaTurnos(u5,t25);
        
        a11.addUcs(u1);
        a11.addUcs(u2);
        a11.addUcs(u4);
        a11.adicionaTurnos(u1,t4);
        a11.adicionaTurnos(u2,t10);
        a11.adicionaTurnos(u4,t16);
        
        a12.addUcs(u1);
        a12.addUcs(u3);
        a12.addUcs(u4);
        a12.adicionaTurnos(u1,t5);
        a12.adicionaTurnos(u3,t11);
        a12.adicionaTurnos(u4,t17);
        
        a13.addUcs(u2);
        a13.addUcs(u3);
        a13.addUcs(u4);
        a13.adicionaTurnos(u2,t6);
        a13.adicionaTurnos(u3,t12);
        a13.adicionaTurnos(u4,t18);
        
        
        
        HashMap <String, UnidadeCurricular> listaUCs = new HashMap<String,UnidadeCurricular> ();
        listaUCs.put(u1.getCodigo(),u1);
        listaUCs.put(u2.getCodigo(),u2);
        listaUCs.put(u3.getCodigo(),u3);
        listaUCs.put(u4.getCodigo(),u4);
        listaUCs.put(u5.getCodigo(),u5);
        
        
        HashMap<Integer,Professor> listaProfs = new HashMap<Integer,Professor> ();
        listaProfs.put(a8.getNumero(),a8);
        listaProfs.put(a9.getNumero(),a9);
        listaProfs.put(a10.getNumero(),a10);
        listaProfs.put(a11.getNumero(),a11);
        listaProfs.put(a12.getNumero(),a12);
        listaProfs.put(a13.getNumero(),a13);
        
        
        HashMap<Integer,Aluno> listaAlunos = new HashMap<Integer,Aluno>();
        listaAlunos.put(a1.getNumero(),a1);
        listaAlunos.put(a2.getNumero(),a2);
        listaAlunos.put(a3.getNumero(),a3);
        listaAlunos.put(a4.getNumero(),a4);
        listaAlunos.put(a5.getNumero(),a5);
        listaAlunos.put(a6.getNumero(),a6);
        listaAlunos.put(a7.getNumero(),a7);
        
        
        
        
        
        //SGT sgt = new SGT();
        SGT sgt = new SGT(listaUCs, listaProfs,listaAlunos);
        JInicio inicio = new JInicio(sgt);
        inicio.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        inicio.setVisible(true);
    
    }
    
}
