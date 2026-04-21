package Controlador;

import Modelo.*;
import static Modelo.ArregloServicios.lista;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorProveedor {
    public static void agregarServicio(Servicio nuevo) {
        int mios = 0;
        for (Servicio s : lista) {
            if (s.getCedulaProveedor().equals(nuevo.getCedulaProveedor())) {
                mios++;
            }
        }
        if (mios < 3) {
            lista.add(nuevo); 
            JOptionPane.showMessageDialog(null, "Servicio registrado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Ya tienes 3 servicios registrados.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void listarMisServicios(javax.swing.JTable tabla, String cedulaP) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);

        for (Servicio s : lista) {
            if (s.getCedulaProveedor().equals(cedulaP)) {
                modelo.addRow(new Object[]{
                    s.getCategoria(),
                    s.getNservicio(),
                    s.getLocalidad(),
                    s.getModalidad(),
                    s.getPrecioBase(),
                    s.getAdicional(),
                    s.getValorAgregado(),
                    s.calcularTotal()
                });
            }
        }
    }

    public static void eliminarServicio(int indiceReal) {
        if (indiceReal >= 0 && indiceReal < lista.size()) {
            lista.remove(indiceReal);
        }
    }

    public static void actualizarServicio(int posicion, String nom, String loc, String adi, double pre, double vAgre, String cat) {
        if (posicion >= 0 && posicion < lista.size()) {
            Servicio s = lista.get(posicion);
            s.setNservicio(nom);
            s.setLocalidad(loc);
            s.setAdicional(adi);
            s.setPrecioBase(pre);
            s.setValorAgregado(vAgre);
            s.setCategoria(cat);
        }
    }
}