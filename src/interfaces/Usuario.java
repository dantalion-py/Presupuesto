package interfaces;
public class Usuario {
    private String nombre;
    private Double dinero ;
    public Usuario(String nombre, Double dinero) {
        this.nombre = nombre;
        this.dinero = dinero;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Double getDinero() {
        return dinero;
    }
    public void setDinero(Double dinero) {
        this.dinero = dinero;
    }
    
}
