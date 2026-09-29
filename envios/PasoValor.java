/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package envios;

/**
 *
 * @author estuam
 */
public class PasoValor {
        // Método que modifica su parámetro
    public static void modificar(double numero) {
        numero = 100.0;

        System.out.println("Dentro del método: " + numero);
    }

    public static void main(String[] args) {

        double original = 50.0;

        System.out.println("Antes de llamar al método: " + original);

        modificar(original);

        System.out.println("Después de llamar al método: " + original);
    }
}

