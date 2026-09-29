package Paquete;
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

    // Muestra la información del paquete
    public void mostrarInformacion() {
        System.out.println(codigo + " -> " + destino
                + " | " + peso + " kg | asegurado: " + asegurado);
    }

    // Reto: mostrar información con encabezado
    public void mostrarInformacion(String encabezado) {
        System.out.println(encabezado);
        mostrarInformacion();
    }

    // Actualiza el peso
    public void actualizarPeso(double peso) {
        this.peso = peso;
    }

    // Calcula el costo con tarifa normal
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

    // Reto: determina si el paquete es pesado
    public boolean esPesado() {
        return peso > 5;
    }
}

    
