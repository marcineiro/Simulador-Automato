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
    public int num;
    public ArrayList<simbolo> listaSimb;
    public boolean inicial;
    public boolean aceit;
    public boolean inicializado;

    public boolean isInicializado() {
        return inicializado;
    }

    public void setInicializado(boolean inicializado) {
        this.inicializado = inicializado;
    }
    
    public ArrayList<simbolo> getListaSimb() {
        return listaSimb;
    }

    public void setListaSimb(simbolo simb) {
        if(this.listaSimb==null){
            this.listaSimb = new ArrayList<simbolo>();
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

}
