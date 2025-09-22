/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author JUAN
 */
public class Llantas {
    private String tipo;
    private int limitePermitido;

    public Llantas(String tipo) {
        this.tipo = tipo;
        switch (tipo.toLowerCase()) {
            case "buenas" -> this.limitePermitido = 110;
            case "bonitas" -> this.limitePermitido = 70;
            case "baratas" -> this.limitePermitido = 50;
            default -> this.limitePermitido = 40;
        }
    }

    public int getLimitePermitido() {
        return limitePermitido;
    }

    public String getTipo() {
        return tipo;
    }
}

