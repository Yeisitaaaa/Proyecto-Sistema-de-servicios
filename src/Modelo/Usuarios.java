package Modelo;

import java.util.ArrayList;

public class Usuarios {
    
    private String nombre;
    private String cedula;
    private String telefono;
    private String barrio;
    private String contraseña;

    public static ArrayList<Usuarios> lista = new ArrayList<>();

    public Usuarios(String nombre, String cedula, String telefono, String barrio, String contraseña) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.barrio = barrio;
        this.contraseña = contraseña;
    }

    public String getNombre() { return nombre; }
    public String getCedula() { return cedula; }
    public String getTelefono() { return telefono; }
    public String getBarrio() { return barrio; }
    public String getContraseña() { return contraseña; }

    
    public static void agregar(Usuarios u){
        lista.add(u);
    }

    
    public static boolean validar(String cedula, String pass){
        for(Usuarios u : lista){
            if(u.getCedula().equals(cedula) && u.getContraseña().equals(pass)){
                return true;
            }
        }
        return false;
    }

   
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
        System.out.println("Telefono: " + telefono);
        System.out.println("Barrio: " + barrio);
        System.out.println("--------------------------");
    }

    
    public static void mostrarTodos(){
        for(Usuarios u : lista){
            u.mostrarDatos();
        }
    }
}