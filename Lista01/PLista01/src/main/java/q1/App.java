/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1;

import javax.swing.JOptionPane;

/**
 *
 * @author molle
 */
public class App {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.peso=78;
        p1.altura=1.75;
        JOptionPane.showMessageDialog(null, "O IMC da pessoa 1 é " + p1.calcularImc());
    }
}
