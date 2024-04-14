package org.example.entitys;


import java.util.List;

/**
 * Clase que representa una cuenta bancaria asociada a un usuario.
 */
public class Cuenta {

    private int numero;
    private double saldo;
    private String moneda;
    private List<Transaccion> historial;


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public List<Transaccion> getHistorial() {
        return historial;
    }

    public void setHistorial(List<Transaccion> historial) {
        this.historial = historial;
    }
}