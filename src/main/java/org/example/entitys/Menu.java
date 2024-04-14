package org.example.entitys;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private ServiciosFondos serviciosFondos;
    private ServicioTransacciones servicioTransacciones;

    public Menu(ServiciosFondos serviciosFondos, ServicioTransacciones servicioTransacciones) {
        this.scanner = new Scanner(System.in);
        this.serviciosFondos = serviciosFondos;
        this.servicioTransacciones = servicioTransacciones;
    }

    public void mostrarMenu() {
        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- Menú de opciones ---");
            System.out.println("1. Ver saldo");
            System.out.println("2. Realizar depósito");
            System.out.println("3. Realizar retiro");
            System.out.println("4. Realizar transferencia");
            System.out.println("5. Convertir moneda");
            System.out.println("0. Salir");

            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    verSaldo();
                    break;
                case 2:
                    realizarDeposito();
                    break;
                case 3:
                    realizarRetiro();
                    break;
                case 4:
                    realizarTransferencia();
                    break;
                case 5:
                    convertirMoneda();
                    break;
                case 0:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
                    break;
            }
        }
        scanner.close();
    }

    private void verSaldo() {
        System.out.println("Ingrese el número de cuenta:");
        int numeroCuenta = scanner.nextInt();
        Cuenta cuenta = obtenerCuentaPorNumero(numeroCuenta);
        if (cuenta != null) {
            double saldo = serviciosFondos.consutarSaldo(cuenta);
            System.out.println("Saldo actual: " + saldo);
        } else {
            System.out.println("Cuenta no encontrada");
        }
    }

    private void realizarDeposito() {
        System.out.println("Ingrese el número de cuenta:");
        int numeroCuenta = scanner.nextInt();
        Cuenta cuenta = obtenerCuentaPorNumero(numeroCuenta);
        if (cuenta != null) {
            System.out.println("Ingrese el monto a depositar:");
            double monto = scanner.nextDouble();
            serviciosFondos.realizarDeposito(cuenta, monto);
            System.out.println("Depósito realizado correctamente");
        } else {
            System.out.println("Cuenta no encontrada");
        }
    }

    private void realizarRetiro() {
        System.out.println("Ingrese el número de cuenta:");
        int numeroCuenta = scanner.nextInt();
        Cuenta cuenta = obtenerCuentaPorNumero(numeroCuenta);
        if (cuenta != null) {
            System.out.println("Ingrese el monto a retirar:");
            double monto = scanner.nextDouble();
            serviciosFondos.realizarRetiro(cuenta, monto);
            System.out.println("Retiro realizado correctamente");
        } else {
            System.out.println("Cuenta no encontrada");
        }
    }

    private void realizarTransferencia() {
        System.out.println("Ingrese el número de cuenta de origen:");
        int numeroCuentaOrigen = scanner.nextInt();
        cuentaOrigen = obtenerCuentaPorNumero(numeroCuentaOrigen);
        System.out.println("Ingrese el número de cuenta de destino:");
        int numeroCuentaDestino = scanner.nextInt();
        cuentaDestino = obtenerCuentaPorNumero(numeroCuentaDestino);
        if (cuentaOrigen != null && cuentaDestino != null) {
            System.out.println("Ingrese el monto a transferir:");
            double monto = scanner.nextDouble();
            servicioTransacciones.realizarTransferencia(cuentaOrigen, cuentaDestino, monto);
            System.out.println("Transferencia realizada correctamente");
        } else {
            System.out.println("Cuentas no encontradas");
        }
    }

    private void convertirMoneda() {
        System.out.println("Ingrese el monto a convertir:");
        double monto = scanner.nextDouble();
        System.out.println("Ingrese la moneda de origen:");
        String monedaOrigen = scanner.next();
        System.out.println("Ingrese la moneda de destino:");
        String monedaDestino = scanner.next();
        double resultado = servicioTransacciones.convertirMoneda(monto, monedaOrigen, monedaDestino);
        System.out.println("Monto convertido: " + resultado + " " + monedaDestino);
    }

    private Cuenta obtenerCuentaPorNumero(int numero) {
        // Lógica para obtener una cuenta por su número, por ejemplo, consultar en la base de datos
        return null; // En este ejemplo retornamos null, deberías implementar esta lógica según tu sistema
    }

    public static void main(String[] args) {
        ServiciosFondos servicioFondos = new ServicioFondosImpl();
        ServicioTransacciones servicioTransacciones = new ServicioTransaccionesImpl();
        Menu menu = new Menu(servicioFondos, servicioTransacciones);
        menu.mostrarMenu();
    }
}