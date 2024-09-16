/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q3;

import javax.swing.JOptionPane;

/**
 *
 * @author molle
 */
public class App {

    public App() {
        for(int i = 0; i < 3; i ++){
            Pessoa p = new Pessoa();
            p.peso = Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
            p.altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
            JOptionPane.showMessageDialog(null, "O IMC da pessoa nº " + (i+1) + " é " + p.calcularImc());
        }
    }
    public static void main(String[] args) {
        new App();
    }
}
