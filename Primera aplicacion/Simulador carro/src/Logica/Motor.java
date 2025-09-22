/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author JUAN
 */
public class Motor {
    private int cilindraje;
    private int velocidadMaxima;

    public Motor(int cilindraje) {
        this.cilindraje = cilindraje;
        switch (cilindraje) {
            case 1000 -> this.velocidadMaxima = 100;
            case 2000 -> this.velocidadMaxima = 160;
            case 3000 -> this.velocidadMaxima = 220;
            default -> this.velocidadMaxima = 80;
        }
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public int getCilindraje() {
        return cilindraje;
    }
}

