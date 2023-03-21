package interfaces;
public class Pago {
    private String nombrePago;
    private Double costo;
    public Pago(String nombrePago, Double costo){
        this.nombrePago = nombrePago;
        this.costo = costo;
    }
    public String getNombrePago() {
        return nombrePago;
    }
    public void setNombrePago(String nombrePago) {
        this.nombrePago = nombrePago;
    }
    public Double getCosto() {
        return costo;
    }
    public void setCosto(Double costo) {
        this.costo = costo;
    }




    
}
