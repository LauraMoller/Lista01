/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q2;

/**
 *
 * @author molle
 */
public class Pessoa {

    public double altura;
    public double peso;

    public double calcularImc() {
        return peso / (altura * altura);
    }
}
