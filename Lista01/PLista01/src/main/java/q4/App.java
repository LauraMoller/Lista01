package q4;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author molle
 */
public class App {

    public App() {
        Pessoa vetor[] = new Pessoa[3];
        Pessoa p = new Pessoa();

        for (int i = 0; i < 3; i++) {
            p.peso = Double.parseDouble(JOptionPane.showInputDialog("Peso da pessoa " + (i+1) + ": "));
            p.altura = Double.parseDouble(JOptionPane.showInputDialog("Altura da pessoa " + (i+1) + ": "));
            vetor[i] = p;
        }
        
        for(int i = 2; i > -1 ; i--){
            JOptionPane.showMessageDialog(null, "IMC pessoa " + (i+1) + ": " + vetor[i].calcularImc());
        }
    }
    
    public static void main(String[] args) {
        new App();
    }
}
