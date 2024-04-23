package test;

import org.example.entitys.Cuenta;
import org.example.entitys.Transaccion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;


public class TransaccionesTest {
    @Test
    public void crearTransaccion(){
        Transaccion transaccion = new Transaccion();
        transaccion.setTipo("Transferencia");
        transaccion.setMonto(5000);
        transaccion.setFecha(new Date());

        Cuenta cuentaOrigen = new Cuenta();
        cuentaOrigen.setNumero(12345);
        transaccion.setCuentaOrigen(cuentaOrigen);

        Cuenta cuentaDestino = new Cuenta();
        cuentaDestino.setNumero(67890);
        transaccion.setCuentaDestino(cuentaDestino);

        assertNotNull(transaccion);
    }
}
