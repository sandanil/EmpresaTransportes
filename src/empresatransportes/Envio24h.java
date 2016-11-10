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
public class Envio24h extends Envio{
    private int prioridad;
        
    public void mostrar(){
        super.mostrar();
        System.out.println("Prioridad: "+this.prioridad);
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    
    
}
