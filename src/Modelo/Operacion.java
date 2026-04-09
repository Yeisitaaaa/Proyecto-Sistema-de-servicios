package Modelo;

import javax.swing.JOptionPane;

public class Operacion {

    public Operacion() {}

    public static String Nombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar su nombre.");
            return "";
        }

        if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) {
            JOptionPane.showMessageDialog(null, "El nombre solo puede contener letras.");
            return "";
        }

        return nombre.trim();
    }

    public static String Cedula(String cedula) {
        if (cedula == null || cedula.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar su número de cédula.");
            return "";
        }

        if (!cedula.matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "La cédula solo debe contener números.");
            return "";
        }

        return cedula;
    }

    public static String Telefono(String telefono) {
        if (telefono == null || telefono.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar su número de teléfono.");
            return "";
        }

        if (!telefono.matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "El teléfono solo debe contener números.");
            return "";
        }

        return telefono;
    }

    public static String Barrio(String barrio) {
        if (barrio == null || barrio.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar su barrio.");
            return "";
        }

        return barrio.trim();
    }

    public static String Contraseña(String contraseña) {
        if (contraseña == null || contraseña.length() < 6) {
            JOptionPane.showMessageDialog(null, "La contraseña debe tener al menos 6 caracteres.");
            return "";
        }

        return contraseña;
    }
}