/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author estuam
 */
public class Habitacion {
    int numero;
    String tipo;
    double precioNoche;
    boolean ocupada;

    // Constructor completo
    public Habitacion(int numero, String tipo, double precioNoche, boolean ocupada) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioNoche = precioNoche;
        this.ocupada = ocupada;
    }

    // Constructor abreviado
    public Habitacion(int numero, String tipo) {
        this(numero, tipo, 120000, false);
    }

    // Ocupa la habitación
    public void ocupar() {
        ocupada = true;
    }

    // Indica si la habitación está disponible
    public boolean estaDisponible() {
        return !ocupada;
    }

    // Calcula el precio sin descuento
    public double calcularEstadia(int noches) {
        return precioNoche * noches;
    }

    // Calcula el precio con descuento
    public double calcularEstadia(int noches, double descuento) {
        double total = calcularEstadia(noches);
        return total - (total * descuento / 100);
    }

    // Muestra la información
    public void mostrarInformacion() {
        System.out.println(
                "Habitación " + numero
                + " | Tipo: " + tipo
                + " | Precio/noche: " + precioNoche
                + " | Ocupada: " + ocupada
        );
    }
}

