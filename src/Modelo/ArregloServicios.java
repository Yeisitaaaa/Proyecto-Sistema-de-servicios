
package Modelo;
import javax.swing.JOptionPane;

public class ArregloServicios {
    public static Servicio[] lista = new Servicio[100];
    public static int contador = 0;
    public boolean agregar(Servicio nuevo) {
        if (contador >= 100) {
            JOptionPane.showMessageDialog(null, "Sistema lleno (100 servicios)");
            return false;
        }
        
        int mios = 0;
        for (int i = 0; i < contador; i++) {
            if (lista[i].getCedulaProveedor().equals(nuevo.getCedulaProveedor())) mios++;
        }
        
        if (mios >= 3) {
            JOptionPane.showMessageDialog(null, "Máximo 3 servicios por proveedor.");
            return false;
        }

        lista[contador] = nuevo;
        contador++;
        return true;
    }
}