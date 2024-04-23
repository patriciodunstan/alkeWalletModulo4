package org.example.entitys;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID; // Importa la clase UUID para generar IDs únicos

/**
 * Clase que representa a un usuario de la aplicación.
 */
public class Usuario {
    private String id;
    private String nombre;
    private String correo;
    private List<Cuenta> cuentas;


    //constructor vacío
    public Usuario(){
        this.id = generarIdUnico();// Genera un ID único al crear el usuario
        this.cuentas = new ArrayList<>();
    }



    // Constructor con parámetros
    public Usuario( String nombre, String correo){
        this.id = generarIdUnico();
        this.nombre = nombre;
        this.correo = correo;
        this.cuentas = new ArrayList<>();
    }



    private String generarIdUnico(){
        return UUID.randomUUID().toString();
    }


    // Métodos getter y setter para los atributos de la clase Usuario
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    // Método para agregar una cuenta a la lista de cuentas del usuario
    public void addCuenta(Cuenta cuenta){
        cuentas.add(cuenta);
    }

    // Método para eliminar una cuenta de la lista de cuentas del usuario
    public void deleteCuenta(Cuenta cuenta) {
        cuentas.remove(cuenta);
    }

}
