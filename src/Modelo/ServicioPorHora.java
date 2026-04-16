
package Modelo;

public class ServicioPorHora extends Servicio {
    private double valorHora;

    public ServicioPorHora(String n, String c, String l, String cp, String ad, double va, double vh) {
        super(n, c, l, cp, ad, va);
        setPrecioBase(vh);
    }

    @Override
    public void setPrecioBase(double pb) {
        if (pb >= 0) {
            this.valorHora = pb;
        } else {
            this.valorHora = 0;
        }
    }

    @Override
    public double getPrecioBase() {
        return valorHora;
    }
    @Override
    public String getModalidad() {
        return "Por Hora";
    }
    @Override
    public double calcularTotal() { 
        return valorHora + valorAgregado;
    }
}