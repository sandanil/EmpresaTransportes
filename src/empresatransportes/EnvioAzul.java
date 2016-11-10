/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresatransportes;

/**
 *
 * @author DaniL
 */
public class EnvioAzul extends Envio{
    private int valor;
    
    public void mostrar(){
        super.mostrar();
        System.out.println("Valor: "+this.valor);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
}
