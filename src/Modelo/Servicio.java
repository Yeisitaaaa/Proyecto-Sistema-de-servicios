package Modelo;
public abstract class Servicio {
    protected String nservicio, categoria, localidad, cedulaProveedor, adicional;
    protected double valorAgregado;

    public Servicio(String n, String c, String l, String cp, String ad, double va) {
        setNservicio(n);
        setCategoria(c);
        setLocalidad(l);
        this.cedulaProveedor = cp; 
        setAdicional(ad);
        setValorAgregado(va);
    }

    public void setNservicio(String n) {
        if (n != null && !n.trim().isEmpty()) {
            this.nservicio = n;
        } else {
            this.nservicio = "Sin Nombre";
        }
    }

    public void setCategoria(String c) {
        if (c != null && !c.trim().isEmpty()) {
            this.categoria = c;
        }
    }

    public void setLocalidad(String l) {
        if (l != null && !l.trim().isEmpty()) {
            this.localidad = l;
        }
    }

    public void setAdicional(String ad) {
        if (ad != null && !ad.trim().isEmpty()) {
            this.adicional = ad;
        } else {
            this.adicional = "Ninguno";
        }
    }

    public void setValorAgregado(double va) {
        if (va >= 0) {
            this.valorAgregado = va;
        } else {
            this.valorAgregado = 0;
        }
    }

    public abstract void setPrecioBase(double pb);
    public abstract String getModalidad();
    public abstract double calcularTotal();
    public abstract double getPrecioBase();

    public String getNservicio() { 
        return nservicio; 
    }
    public String getCategoria() {
        return categoria; 
    }
    public String getLocalidad() {
        return localidad; 
    }
    public String getCedulaProveedor() {
        return cedulaProveedor;
    }
    public String getAdicional() {
        return adicional; 
    }
    public double getValorAgregado() {
        return valorAgregado;
    }
}