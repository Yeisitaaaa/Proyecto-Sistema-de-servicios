package Modelo;

import java.util.ArrayList;

public class RegistroPersonas {

    public static ArrayList<Usuarios> listaPersonas = new ArrayList<>();

    public static void agregarPersona(Usuarios persona) {
        listaPersonas.add(persona);
    }

    public static void mostrarPersonas() {
        for (Usuarios p : listaPersonas) {
            p.mostrarDatos();
        }
    }

    public static boolean validar(String cedula, String pass) {
        for (Usuarios u : listaPersonas) {
            if (u.getCedula().equals(cedula) && u.getpass().equals(pass)) {
                return true;
            }
        }
        return false;
    }

    public static Usuarios obtenerUsuario(String cedula, String pass) {
        for (Usuarios u : listaPersonas) {
            if (u.getCedula().equals(cedula) && u.getpass().equals(pass)) {
                return u;
            }
        }
        return null;
    }
}