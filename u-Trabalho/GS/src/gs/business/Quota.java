/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gs.business;


/**
 *
 * @author tiagofraga
 */
public class Quota {
    
    /*---------------------------------VARIAVEIS DA CLASSE------------------------------------*/
    
    private String data;
    private int valor;
    
    /*------------------------------------CONSTRUTORES----------------------------------------*/
    
    public Quota() {
       this("",0);
    }

    public Quota(String data, int valor) {
        this.data = data;
        this.valor = valor;
    }
    
    /*-------------------------------- GET'S & SET'S ----------------------------------------*/
    
    public String getData(){
        return this.data;
    }
    
    public int getValor(){
        return this.valor;
    }
    
    public void setData(String data){
        this.data = data;
    }
    
    public void setValor(int valor){
        this.valor = valor;
    }
    
    public boolean equals(Object o) {
        boolean b=false;

        if (o!= null && o instanceof Quota) {
            Quota q = (Quota)o;
            b = this.valor == q.getValor() && 
                    this.data.equals(q.getData());    
        }
        return b;
    }
    
    public Object clone() {
        return new Quota(this.data, this.valor);
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("Quota(");
        sb.append(this.data);
        sb.append(",");
        sb.append(this.valor);
        sb.append(")");
        return sb.toString();
    }
}