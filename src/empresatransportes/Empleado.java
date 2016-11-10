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
public class Empleado {
    private String nombre;
    private int edad;
    private Vehiculo vehiculo;
    
    public void mostrar(){
        System.out.println("Empleado:");
        System.out.println(" Nombre: "+this.nombre);
        System.out.println(" Edad: "+this.edad);
        System.out.println(" Vehiculo: ");
        System.out.println("    Marca: "+this.vehiculo.getMarca());
        System.out.println("    Matrícula: "+this.vehiculo.getMatricula());
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    
}
