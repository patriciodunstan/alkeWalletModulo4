package org.example.entitys;

public class ServicioTransaccionesImpl implements ServicioTransacciones {


    @Override
    public void realizarTransferencia(Cuenta origin, Cuenta destino, double monto) {
        if(origin.getSaldo() >= monto){
            origin.setSaldo(origin.getSaldo() - monto);
            destino.setSaldo(destino.getSaldo() + monto);
        } else {
            throw  new RuntimeException("Saldo insuficiente para realizar la transferencia");
        }
    }

    @Override
    public double convertirMoneda(double monto, String monedaOrigen, String monedaDestino) {
        return monto * factorConversion(monedaOrigen, monedaDestino);
    }

    private double factorConversion(String monedaOrigen, String monedaDestino){
        return 1.0;
    }
}
