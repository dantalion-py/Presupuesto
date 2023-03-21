package interfaces;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.GridLayout;
public class Shop extends JFrame implements ActionListener{
    
    JButton comprarSer,comprarVer,comprarBebi;
    JTextField serviciosEsenciales,verduras,bebidas;
    JLabel serviciosEsencialesLabel,verdurasLabel,bebidasLabel,money; 
    Usuario usuario;
    Pago histoialPago;
    public Shop(Usuario usuario) {
        this.usuario = usuario;
        this.setSize(1000,750);
        this.setLayout(new GridLayout(4,2));
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);


        /**
         * boton parar realizar una compra
         */
        money = new JLabel("Presupuesto: "+usuario.getDinero()+"$");
        money.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC, 20));
        add(money);


        serviciosEsenciales = new JTextField(0);
        serviciosEsenciales.addActionListener(this);
        serviciosEsencialesLabel = new JLabel("servicios basicos cost:300$");
        serviciosEsencialesLabel.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC, 30));
        add(serviciosEsencialesLabel);

        comprarSer = new JButton("comprar");
        comprarSer.addActionListener(this);

        add(comprarSer);


        verduras = new JTextField(0);
        verduras.addActionListener(this);
        verdurasLabel = new JLabel("verduras cost:50$");
        verdurasLabel.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC, 30));
        add(verdurasLabel);

        comprarVer = new JButton("comprar");
        comprarVer.addActionListener(this);

        add(comprarVer);


        bebidas = new JTextField(0);
        bebidas.addActionListener(this);
        bebidasLabel = new JLabel("bebidas cost:15$");
        bebidasLabel.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC, 30));
        add(bebidasLabel);

        comprarBebi = new JButton("comprar");
        comprarBebi.addActionListener(this);

        add(comprarBebi);






        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        Gasto pago = new Gasto(usuario);
        if(e.getSource() == comprarSer){
            histoialPago = new Pago("pago servicios esenciales", 300.0);
            pago.gastoSer(usuario);
            

        }
        else if(e.getSource() == comprarVer){
            new Pago("verduras", 50.0);
            pago.gastoVer(usuario);

        }
        else if(e.getSource() == comprarBebi){
            new Pago("bebidas", 15.0);
            pago.gastoBebi(usuario);

        }
    }
    
}