/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
/**
 *
 * @author JUAN
 */

import Logica.Vehiculo;
import Vista.Vista;

public class ControladorVehiculo {
    private Vehiculo vehiculo;
    private Vista vista;

    public ControladorVehiculo(Vehiculo vehiculo, Vista vista) {
        this.vehiculo = vehiculo;
        this.vista = vista;
        this.vista.setControlador(this);
    }

    public void encender() {
        try {
            vehiculo.encender();
            vista.mostrarMensaje("Vehículo encendido.");
        } catch (Exception e) {
            vista.mostrarMensaje("ERROR: " + e.getMessage());
        }
    }

    public void apagar() {
        try {
            vehiculo.apagar();
            vista.mostrarMensaje("Vehículo apagado.");
        } catch (Exception e) {
            vista.mostrarMensaje("ERROR: " + e.getMessage());
        }
    }

    public void acelerar(int valor) {
        try {
            vehiculo.acelerar(valor);
            vista.mostrarMensaje("Aceleró a " + vehiculo.getVelocidadActual() + " km/h.");
        } catch (Exception e) {
            vista.mostrarMensaje("ERROR: " + e.getMessage());
        }
    }

    public void frenar(int valor) {
        try {
            vehiculo.frenar(valor);
            vista.mostrarMensaje("Velocidad: " + vehiculo.getVelocidadActual() + " km/h.");
        } catch (Exception e) {
            vista.mostrarMensaje("ERROR: " + e.getMessage());
        }
    }

    public void frenarBruscamente(int valor) {
        try {
            vehiculo.frenarBruscamente(valor);
            vista.mostrarMensaje("Velocidad: " + vehiculo.getVelocidadActual() + " km/h.");
        } catch (Exception e) {
            vista.mostrarMensaje("ERROR: " + e.getMessage());
        }
    }

    public void frenar() {
    }

    public void acelerar() {
    }

    public void FrenarBrusco() {
    }
}
