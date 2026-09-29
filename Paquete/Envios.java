/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete;

/**
 *
 * @author estuam
 */
public class Envios {
    public static void main(String[] args) {
        Paquete p = new Paquete("","", 0, true);

        System.out.println("Código: " + p.codigo);
        System.out.println("Destino: " + p.destino);
        System.out.println("Peso: " + p.peso);
        System.out.println("Asegurado: " + p.asegurado);
        
                    // Etapa 2
        Paquete p1 = new Paquete("P-001", "Manizales", 3.0, true);
        p1.mostrarInformacion();

        // Etapa 3
        Paquete p2 = new Paquete("P-002", "Pereira", 0, true);
        
        Paquete p3 = new Paquete("P-003","", 0, true );

        p2.mostrarInformacion();
        p3.mostrarInformacion();

        // Etapa 4
        p3.actualizarPeso(2.5);

        double total = p1.calcularCosto()
                + p2.calcularCosto()
                + p3.calcularCosto();

        System.out.println("Total del envío: " + total);

        // Etapa 5
        System.out.println(p1.calcularCosto(4000));
        System.out.println(p2.calcularCosto(4000));

        // Reto: paquete pesado
        p3.actualizarPeso(6.0);

        if (p3.esPesado()) {
            System.out.println("Manejo especial: el paquete es pesado.");
        }

        // Reto: sobrecarga de mostrarInformacion
        p1.mostrarInformacion("Información del paquete:");
    }
}
    

