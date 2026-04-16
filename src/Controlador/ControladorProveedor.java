
package Controlador;
import Modelo.*;
import static Modelo.ArregloServicios.contador;
import static Modelo.ArregloServicios.lista;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class ControladorProveedor {
   public static void agregarServicio(Servicio nuevo) {
        int mios = 0;
        for (int i = 0; i < contador; i++) {
            if (lista[i].getCedulaProveedor().equals(nuevo.getCedulaProveedor())) {
                mios++;
            }
        }

        if (mios < 3) {
            if (contador < 100) {
                lista[contador] = nuevo;
                contador++;
                JOptionPane.showMessageDialog(null, "Servicio registrado");
            } else {
                JOptionPane.showMessageDialog(null, "Memoria llena");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ya tienes 3 servicios registrados.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void listarMisServicios(javax.swing.JTable tabla, String cedulaP) {
        DefaultTableModel modelo = (DefaultTableModel)
        tabla.getModel();
        modelo.setRowCount(0);
        
        for (int i = 0; i < contador; i++) {
            if (lista[i].getCedulaProveedor().equals(cedulaP)) {
                modelo.addRow(new Object[]{
                lista[i].getCategoria(),  
                lista[i].getNservicio(),  
                lista[i].getLocalidad(),   
                lista[i].getModalidad(),   
                lista[i].getPrecioBase(), 
                lista[i].getAdicional(),   
                lista[i].getValorAgregado(),
                lista[i].calcularTotal()   
            });
            }
        }
    }

 public static void eliminarServicio(int indiceReal) {
    if (indiceReal >= 0 && indiceReal < contador) {
        for (int i = indiceReal; i < contador - 1; i++) {
            lista[i] = lista[i + 1];
        }
        lista[contador - 1] = null;
        contador--;
}
}

   public static void actualizarServicio(int posicion, String nom, String loc, String adi, double pre, double vAgre, String cat) {
    Servicio s = lista[posicion];
    s.setNservicio(nom);
    s.setLocalidad(loc);
    s.setAdicional(adi);
    s.setPrecioBase(pre);
    s.setValorAgregado(vAgre);
    s.setCategoria(cat);
}
}
