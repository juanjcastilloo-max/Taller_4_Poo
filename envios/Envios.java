/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package envios;

/**
 *
 * @author estuam
 */
public class Envios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // Crear paquetes
        Paquete p1 = new Paquete("P-001", "Manizales", 3.0, true);
        Paquete p2 = new Paquete("P-002", "Pereira");
        Paquete p3 = new Paquete("P-003");

        // Mostrar información
        p1.mostrarInformacion();
        p2.mostrarInformacion();
        p3.mostrarInformacion();

        // Actualizar peso de p3
        p3.actualizarPeso(2.5);

        // Calcular costo total
        double total = p1.calcularCosto()
                + p2.calcularCosto()
                + p3.calcularCosto();

        System.out.println("Total del envío: " + total);

        // Sobrecarga de calcularCosto
        System.out.println("Costo p1 con tarifa 4000: "
                + p1.calcularCosto(4000));

        System.out.println("Costo p2 con tarifa 4000: "
                + p2.calcularCosto(4000));

        // Reto 2: probar esPesado()
        p3.actualizarPeso(6.0);

        if (p3.esPesado()) {
            System.out.println("Manejo especial: el paquete es pesado.");
        }

        // Reto 3: sobrecarga de mostrarInformacion()
        p1.mostrarInformacion("Información del paquete:");

        // Ejemplos de sobrecarga de calcularCosto
        System.out.println("Costo normal: " + p1.calcularCosto());
        System.out.println("Costo con tarifa personalizada: "
                + p1.calcularCosto(4000));

        /*
         * La siguiente línea NO compila porque
         * no existe calcularCosto(String).
         */
        // System.out.println(p1.calcularCosto("4000"));
    }
}
    

