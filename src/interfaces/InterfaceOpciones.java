package interfaces;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


import java.awt.Color;

import interfaces.Usuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Font;
import java.awt.GridLayout;
public class InterfaceOpciones extends JFrame implements ActionListener{
    JLabel texto,money;
    JButton shop,history,exit;
    Pago p;

    private Usuario u;
    public InterfaceOpciones(Usuario u){
        this.u = u;
        this.setSize(700,700);
        this.setLayout(new GridLayout(4,2));
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        
        texto = new JLabel("Opciones");
        texto.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC, 40));
        texto.setForeground(Color.BLACK);
        add(texto);

        money = new JLabel("Presupuesto: "+u.getDinero()+"$");
        money.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC, 20));
        add(money);


        shop = new JButton("Shop");
        shop.addActionListener(this);
        add(shop);

        history = new JButton("historial");
        history.addActionListener(this);
        add(history);


        exit = new JButton("Exit");
        exit.addActionListener(this);
        add(exit);



        
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == shop){
            new Shop(u);
        }else if(e.getSource() == history){
            Historial h =new Historial(p);
            h.lista();
            h.mostrarLista();
        }else if(e.getSource() == exit){
            new Exit();

        }

    }
}
