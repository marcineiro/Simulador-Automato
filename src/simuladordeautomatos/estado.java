/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladordeautomatos;

import java.util.ArrayList;

/**
 *
 * @author murilo
 */
public class estado {
    private int num;
    private ArrayList<simbolo> listaSimb;
    private boolean inicial;
    private boolean aceit;
    private boolean inicializado;
    private ArrayList<reg> regEx;

    public boolean isInicializado() {
        return inicializado;
    }

    public void setInicializado(boolean inicializado) {
        this.inicializado = inicializado;
    }
    
    public ArrayList<simbolo> getListaSimb() {
        return listaSimb;
    }

    public void setReg(reg r) {
        if(this.regEx==null){
            this.regEx = new ArrayList<>();
        }
        this.regEx.add(r);
    }

    public ArrayList<reg> getRegEx() {
        return regEx;
    }
    
    
    
    public void setListaSimb(simbolo simb) {
        if(this.listaSimb==null){
            this.listaSimb = new ArrayList<>();
        }
        this.listaSimb.add(simb);
    }
    
    public boolean isInicial() {
        return inicial;
    }

    public void setInicial(boolean inicial) {
        this.inicial = inicial;
    }

    public boolean isAceit() {
        return aceit;
    }

    public void setAceit(boolean aceit) {
        this.aceit = aceit;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }  

    public String getExp(estado e){
        String str="";
        if(!this.temEx(e)){
            for(int i=0;i<listaSimb.size();i++){
                if(listaSimb.get(i).getProxEstado().equals(e)){
                    if(!str.isEmpty())
                        str+="|";
                    str+=listaSimb.get(i).getValor();
                }
            }
        } else {
            str = this.getEx(e);
        }
        return str;
    }
    
    public boolean temEx(estado e){
        boolean t = false;
        if(regEx!=null){
            for(int i=0;i<regEx.size();i++){
                if(regEx.get(i).getE().equals(e))
                    t=true;
            }
        }
        return t;
    }
    
    public boolean temTrans(estado e){
        boolean t = false;
        if(listaSimb!=null){
            for(int i = 0;i<listaSimb.size();i++){
                if(listaSimb.get(i).proxEstado.equals(e))
                    t = true;
            }
        }
        return t;
    }

    private String getEx(estado e) {
        String str = "";
        if(regEx!=null){
            for(int i=0;i<regEx.size();i++){
                if(regEx.get(i).getE().equals(e))
                    str = regEx.get(i).getEx();
            }
        }
        return str;
    }
}
