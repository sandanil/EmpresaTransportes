/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresatransportes;

import java.util.ArrayList;

/**
 *
 * @author DaniL
 */
public class EmpresaTransportes {
    static ArrayList<Envio> envios = new ArrayList<Envio>();
    static ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    
    public static void rellenarDatos(){
        for (int i=0; i < 10; i++){
            EnvioAzul ea = new EnvioAzul();
            ea.setPeso((int) (Math.random()*100));
            ea.setFecha("Código de fecha del envío azul nº"+(i+1)+": "+(int) (Math.random()*365));
            ea.setValor((int) (Math.random()*1000));
            envios.add(ea);
            
            Envio24h e24 = new Envio24h();
            e24.setPeso((int) (Math.random()*100));
            e24.setFecha("Código de fecha del envío 24h nº"+(i+1)+": "+(int) (Math.random()*365));
            e24.setPrioridad((int) (Math.random()*3));
            envios.add(e24);
            
            Empleado emp = new Empleado();
            emp.setNombre("Empleado nº "+(i+1));
            emp.setEdad((int) (Math.random() * 65));
            empleados.add(emp);
            
            Coche co = new Coche();
            co.setMarca("Marca coche nº: "+(i+1));
            co.setMatricula("Matrícula coche nº: "+(i+1));
            co.setColor("Color coche nº: "+(i+1));
            vehiculos.add(co);
            
            Furgoneta fur = new Furgoneta();
            fur.setMarca("Marca furgoneta nº: "+(i+1));
            fur.setMatricula("Matrícula furgoneta nº: "+(i+1));
            fur.setPesomaxaut((int) (Math.random()*1000));
            vehiculos.add(fur);
            
            Camion cam = new Camion();
            cam.setMarca("Marca camión nº: "+(i+1));
            cam.setMatricula("Matrícula camión nº: "+(i+1));
            cam.setVolumen((int) (Math.random()*1000));
            vehiculos.add(cam);
        }
    }
//----------------------------------------------------------------------------------------------------
    public static void mostrarTodosEnvios(){
        for (Envio envio : envios) {
            envio.mostrar();
            System.out.println("");
        }
    }
//----------------------------------------------------------------------------------------------------
    public static void mostrarEnvio24hMayorPeso(){
        int mayorpeso=0;
        Envio enviomax = new Envio24h();
        for (int i=0; i < envios.size(); i++){
            if (envios.get(i) instanceof Envio24h && mayorpeso < envios.get(i).getPeso()){
                mayorpeso = envios.get(i).getPeso();
                enviomax = envios.get(i);
            }
        }
        System.out.println("El envío 24h de mayor peso es el de fecha: "+enviomax.getFecha()+" y pesa: "+mayorpeso);
    }
//----------------------------------------------------------------------------------------------------
    public static void mostrarSumaPesosPorTipoEnvio(){
        int pesoazul = 0;
        int peso24 = 0;
        for (Envio envio : envios) {
            if (envio instanceof EnvioAzul) {
                pesoazul = pesoazul + envio.getPeso();
            }
            else {
                peso24 = peso24 + envio.getPeso();
            }
        }
        System.out.println("Suma de los pesos de los envíos azules: "+pesoazul);
        System.out.println("Suma de los pesos de los envíos 24h: "+peso24);
        System.out.println("Suma de los pesos de todos los envíos:  "+(pesoazul+peso24));
    }
//----------------------------------------------------------------------------------------------------
    public static void asignarEmpleadoaVehiculo(Empleado e, Vehiculo v){
        e.setVehiculo(v);
        e.mostrar();
    }
//----------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        rellenarDatos();
        mostrarTodosEnvios();
        mostrarEnvio24hMayorPeso();
        mostrarSumaPesosPorTipoEnvio();
        asignarEmpleadoaVehiculo(empleados.get(6), vehiculos.get(16));
    }
    
}
