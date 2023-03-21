package interfaces;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Font;
import java.awt.GridLayout;

public class Historial extends JFrame implements ActionListener{
  private static ArrayList<Pago> listaHistorial = new ArrayList<Pago>(); 
  private static Pago pago;

  public Historial(Pago pago){
    this.pago = pago;
    listaHistorial.add(pago);
    for(Pago i:listaHistorial){
      System.out.println(i);
    }  
  }
  public static void lista(){
    // for(Pago i:listaHistorial){
    //   System.out.println(i);
    // }    
  }
  public static void mostrarLista(){  
    // for(Pago i:listaHistorial){
    //   System.out.println(i);
    // }
  }

  @Override
  public void actionPerformed(ActionEvent e){

  }
}
