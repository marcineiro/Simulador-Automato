/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladordeautomatos;

/**
 *
 * @author murilo
 */
public class simbolo {
    public char valor;
    public estado proxEstado;

    public estado getProxEstado() {
        return proxEstado;
    }

    public void setProxEstado(estado proxEstado) {
        this.proxEstado = proxEstado;
    }

    public char getValor() {
        return valor;
    }

    public void setValor(char valor) {
        this.valor = valor;
    }

}
