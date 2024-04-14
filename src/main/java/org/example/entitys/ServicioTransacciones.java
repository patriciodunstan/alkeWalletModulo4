package org.example.entitys;

/**
 * Interfaz que define los métodos para enviar/receptar fondos
 * y realizar conversiones de moneda.
 */
public interface ServicioTransacciones {
    void realizarTransferencia(Cuenta origen, Cuenta destino, double monto);
    double convertirMoneda(double monto, String monedaOrigen, String monedaDestino);
}
