package org.example.entitys;

/**
 * Interfaz que define los métodos para administrar fondos.
 */
public interface ServiciosFondos {
    double consutarSaldo(Cuenta cuenta);
    void realizarDeposito(Cuenta cuenta, double monto);
    void realizarRetiro(Cuenta cuenta, double monto);
}


