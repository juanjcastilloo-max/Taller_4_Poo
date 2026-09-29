/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotel;

/**
 *
 * @author estuam
 */
public class Hotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Habitacion h1 = new Habitacion(101, "Sencilla");
        Habitacion h2 = new Habitacion(202, "Doble", 180000, false);
        Habitacion h3 = new Habitacion(303, "Suite");

        // Ocupar una habitación
        h2.ocupar();

        // Mostrar información
        h1.mostrarInformacion();
        h2.mostrarInformacion();
        h3.mostrarInformacion();

        // Estadía de 3 noches
        System.out.println("Estadía de 3 noches: "
                + h1.calcularEstadia(3));

        System.out.println("Estadía de 3 noches con 10% de descuento: "
                + h1.calcularEstadia(3, 10));
    }
}
    

