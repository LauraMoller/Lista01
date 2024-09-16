/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package q1;

/**
 *
 * @author moller
 */
public class Pessoa {
    public double altura;
    public double peso;

    public double calcularImc() {
        return peso / (altura * altura);
    }
}
