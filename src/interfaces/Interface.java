package interfaces;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Interface extends JFrame implements ActionListener{
    JTextField nombre,sueldo,presupuesto;
    JLabel nombreLabel,texto,presupuestoLabel;
    JButton opciones;
    Usuario user;
    static String nombreField,presupuestoField;
    public Interface(){
        super("Planificacion de gastos V:1.0");


        this.setSize(400,250);
        this.setLayout(new GridLayout(4,2));
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
   
        
        nombre = new JTextField(0);
        nombre.addActionListener(this);
        nombreLabel = new JLabel("Nombre");
     
        add(nombreLabel);
        add(nombre);

        presupuesto = new JTextField(0);
        presupuesto.addActionListener(this);
        presupuestoLabel = new JLabel("presupuesto");
        
        add(presupuestoLabel);
        add(presupuesto);

        opciones = new JButton("Opciones");
        opciones.addActionListener(this);
        add(opciones);
        
        setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        nombreField = nombre.getText();
        presupuestoField = presupuesto.getText();

        
        if(nombreField.equals("") || presupuestoField.equals("")){
            JOptionPane.showMessageDialog(null, "Los datos son requeridos");

        }else{
            user = new Usuario(nombreField,Double.parseDouble(presupuestoField));
            new InterfaceOpciones(user);
       
        }


    }
}
