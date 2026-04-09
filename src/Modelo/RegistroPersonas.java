package Modelo;

import java.util.ArrayList;

public class RegistroPersonas {
    private ArrayList<Usuarios> listaPersonas;

    public RegistroPersonas() {
        listaPersonas = new ArrayList<>();
    }

    // Agregar una persona al ArrayList
    public void agregarPersona(Usuarios persona) {
        listaPersonas.add(persona);
    }

    // Mostrar todas las personas en la consola
    public void mostrarPersonas() {
        for (Usuarios p : listaPersonas) {
            p.mostrarDatos();
        }
    }
}
