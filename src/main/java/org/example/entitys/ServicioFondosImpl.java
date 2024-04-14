package org.example.entitys;

public class ServicioFondosImpl implements ServiciosFondos {


    @Override
    public double consutarSaldo(Cuenta cuenta) {
        return cuenta.getSaldo();
    }

    @Override
    public void realizarDeposito(Cuenta cuenta, double monto) {
    cuenta.setSaldo(cuenta.getSaldo()+ monto);
    }

    @Override
    public void realizarRetiro(Cuenta cuenta, double monto) {
        if(cuenta.getSaldo() >= monto){
            cuenta.setSaldo(cuenta.getSaldo() - monto);
        } else {
            throw  new RuntimeException("saldo insuficiente");
        }
    }
}
