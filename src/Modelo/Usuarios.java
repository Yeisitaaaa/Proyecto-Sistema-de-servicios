package Modelo;

public class Usuarios {

    private String nombre;
    private String cedula;
    private String telefono;
    private String barrio;
    private String pass;
    private String tipo;

    public Usuarios(String nombre, String cedula, String telefono, String barrio, String pass, String tipo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.barrio = barrio;
        this.pass = pass;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getpass() {
        return pass;
    }

    public String getTipo() {
        return tipo;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
        System.out.println("Telefono: " + telefono);
        System.out.println("Barrio: " + barrio);
        System.out.println("Contraseña: " + pass);
        System.out.println("Tipo: " + tipo);
        System.out.println("--------------------------");
    }
}