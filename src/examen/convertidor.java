/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class convertidor extends JFrame implements ActionListener {

    private JTextField numero;
    private JButton uno;
    private JButton dos;
    private JButton tres;
    private JButton cuatro;
    private JButton cinco;
    private JButton seis;
    private JButton siete;
    private JButton ocho;
    private JButton nueve;
    private JButton ce;
    private JButton convertir;

    public convertidor() {
        ventana();
        componentes();
    }

    public void ventana() {
        this.setTitle("Convertidor");
        this.setSize(500, 500);
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void componentes() {
        numero = new JTextField();
        numero.setBounds(10, 10, 300, 40);
        add(numero);

        uno = new JButton();
        uno.setText("1");
        uno.setBounds(10, 60, 40, 40);
        add(uno);
        uno.addActionListener(this);

        dos = new JButton();
        dos.setText("2");
        dos.setBounds(55, 60, 40, 40);
        add(dos);
        dos.addActionListener(this);

        tres = new JButton();
        tres.setText("3");
        tres.setBounds(100, 60, 40, 40);
        add(tres);
        tres.addActionListener(this);

        cuatro = new JButton();
        cuatro.setText("4");
        cuatro.setBounds(10, 110, 40, 40);
        add(cuatro);
        cuatro.addActionListener(this);

        cinco = new JButton();
        cinco.setText("5");
        cinco.setBounds(55, 110, 40, 40);
        add(cinco);
        cinco.addActionListener(this);

        seis = new JButton();
        seis.setText("6");
        seis.setBounds(100, 110, 40, 40);
        add(seis);
        seis.addActionListener(this);

        siete = new JButton();
        siete.setText("7");
        siete.setBounds(10, 160, 40, 40);
        add(siete);
        siete.addActionListener(this);

        ocho = new JButton();
        ocho.setText("8");
        ocho.setBounds(55, 160, 40, 40);
        add(ocho);
        ocho.addActionListener(this);

        nueve = new JButton();
        nueve.setText("9");
        nueve.setBounds(100, 160, 40, 40);
        add(nueve);
        nueve.addActionListener(this);

        ce = new JButton();
        ce.setText("CE");
        ce.setBounds(150, 60, 40, 40);
        add(ce);
        ce.addActionListener(this);

        convertir = new JButton();
        convertir.setText("Convertir");
        convertir.setBounds(150, 110, 70, 70);
        add(convertir);
        convertir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convertir) {
            String textonumero = numero.getText();
            float num = Float.parseFloat(textonumero);
            float result = num / 19;
            String resultadotexto = String.valueOf(result);
            numero.setText(resultadotexto);
        }
        if (e.getSource() == ce) {
            numero.setText("");
        }
        
        if (e.getSource() == uno) {
            String textonumero = numero.getText();
            numero.setText(textonumero + "1");
        }
        if (e.getSource() == dos) {
            String textonumero = numero.getText();
            numero.setText(textonumero + "2");
        }
        if (e.getSource() == tres) {
            String textonumero = numero.getText();
            numero.setText(textonumero + "3");
        }
        if (e.getSource() == cuatro) {
            String textonumero = numero.getText();
            numero.setText(textonumero + "4");
        }
        if (e.getSource() == cinco) {
            String textonumero = numero.getText();
            numero.setText(textonumero + "5");
        }
        if (e.getSource() == seis) {
            String textonumero = numero.getText();
            numero.setText(textonumero + "6");
        }
        if (e.getSource() == siete) {
            String textonumero = numero.getText();
            numero.setText(textonumero + "7");
        }
        if (e.getSource() == ocho) {
            String textonumero = numero.getText();
            numero.setText(textonumero + "8");
        }
        if (e.getSource() == nueve) {
            String textonumero = numero.getText();
            numero.setText(textonumero + "9");
        }
        
    }
}

