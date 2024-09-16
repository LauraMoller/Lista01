/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q2;

import javax.swing.JOptionPane;

/**
 *
 * @author molle
 */
public class App {
    public static void main(String[] args) {
        Pessoa p2 = new Pessoa();
        p2.altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
        p2.peso = Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
        JOptionPane.showMessageDialog(null, "O IMC desta pessoa é " + p2.calcularImc());
    }
}
