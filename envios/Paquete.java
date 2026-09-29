/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package envios;

/**
 *
 * @author estuam
 */
public class Paquete {
        String codigo;
    String destino;
    double peso;
    boolean asegurado;

    // Constructor completo
    public Paquete(String codigo, String destino, double peso, boolean asegurado) {
        this.codigo = codigo;
        this.destino = destino;
        this.peso = peso;
        this.asegurado = asegurado;
    }

    // Constructor con código y destino
    public Paquete(String codigo, String destino) {
        this(codigo, destino, 1.0, false);
    }

    // Constructor con solo código
    public Paquete(String codigo) {
        this(codigo, "Por asignar");
    }

    // Mostrar información
    public void mostrarInformacion() {
        System.out.println(codigo + " -> " + destino
                + " | " + peso + " kg | asegurado: " + asegurado);
    }

    // Sobrecarga de mostrarInformacion
    public void mostrarInformacion(String encabezado) {
        System.out.println(encabezado);
        mostrarInformacion();
    }

    // Actualizar peso
    public void actualizarPeso(double peso) {
        this.peso = peso;
    }

    // Calcular costo normal
    public double calcularCosto() {
        double costo = peso * 5000;

        if (asegurado) {
            costo += 8000;
        }

        return costo;
    }

    // Sobrecarga de calcularCosto
    public double calcularCosto(double tarifaPorKilo) {
        double costo = peso * tarifaPorKilo;

        if (asegurado) {
            costo += 8000;
        }

        return costo;
    }

    // Reto 2: saber si el paquete es pesado
    public boolean esPesado() {
        return peso > 5;
    }
}
