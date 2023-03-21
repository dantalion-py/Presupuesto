package interfaces;

import javax.swing.JOptionPane;

public class Gasto {
    private Double costoSer = 300.0;
    private Double costoVer = 50.0;
    private Double costoBebi = 15.0;
    Usuario usuario ;
    public Gasto(Usuario usuario) {
        this.usuario = usuario;
    }
    public void gastoSer(Usuario u){
        if(u.getDinero()>=costoSer){
            Double resto = u.getDinero()-costoSer ; 
            u.setDinero(resto);
            JOptionPane.showMessageDialog(null, "Nuevo saldo: "+u.getDinero());

        }else{
            JOptionPane.showMessageDialog(null, "Su saldo es insuficiente");
        }
    }
    public void gastoVer(Usuario u){
        if(u.getDinero()>=costoVer){
            Double resto = u.getDinero()-costoVer ; 
            u.setDinero(resto);
            JOptionPane.showMessageDialog(null, "Nuevo saldo: "+u.getDinero());

        }else{
            JOptionPane.showMessageDialog(null, "Su saldo es insuficiente");
        }
    }
    public void gastoBebi(Usuario u){
        if(u.getDinero()>=costoBebi){
            Double resto = u.getDinero()-costoBebi ; 
            u.setDinero(resto);
            JOptionPane.showMessageDialog(null, "Nuevo saldo: "+u.getDinero());

        }else{
            JOptionPane.showMessageDialog(null, "Su saldo es insuficiente");
        }
    }

    
    
}
