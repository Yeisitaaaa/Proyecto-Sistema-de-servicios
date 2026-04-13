
package Modelo;

public class ServicioFijo extends Servicio {
    private double precioFijo;

    public ServicioFijo(String n, String c, String l, String cp, String ad, double va, double pf) {
        super(n, c, l, cp, ad, va);
        setPrecioBase(pf);
    }

    @Override
    public void setPrecioBase(double pb) {
        if (pb >= 0) {
            this.precioFijo = pb;
        } else {
            this.precioFijo = 0;
        }
    }

    @Override
    public double getPrecioBase() {
        return precioFijo; 
    }
    @Override
    public String getModalidad() {
        return "Tarifa Fija";
    }
    @Override
    public double calcularTotal() { 
        return precioFijo + valorAgregado;
    }
}