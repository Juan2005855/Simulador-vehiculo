package Logica;

import excepciones.AccidenteException;
import excepciones.VehiculoEncendidoException;
import excepciones.PatinadaException;
import excepciones.VehiculoApagadoException;

public class Vehiculo {
    private boolean encendido;
    private boolean patinando;
    private boolean accidentado;
    private int velocidadActual;

    private Motor motor;
    private Llantas llantas;

    public Vehiculo() {
        this.llantas = new Llantas("bonitas");
        this.motor = new Motor(2000);
        this.encendido = false;
        this.patinando = false;
        this.accidentado = false;
        this.velocidadActual = 0;
    }

    public Vehiculo(Llantas llantas, Motor motor) {
        this.llantas = llantas;
        this.motor = motor;
        this.encendido = false;
        this.patinando = false;
        this.accidentado = false;
        this.velocidadActual = 0;
    }

    public void encender() throws VehiculoEncendidoException {
        if (encendido) throw new VehiculoEncendidoException("El vehículo ya está encendido.");
        encendido = true;
    }

    public void apagar() throws VehiculoApagadoException, AccidenteException {
        if (!encendido) throw new VehiculoApagadoException("El vehículo ya está apagado.");
        if (velocidadActual > 60) {
            accidentado = true;
            encendido = false;
            throw new AccidenteException("El vehículo se accidentó al apagarse en movimiento.");
        }
        encendido = false;
    }

    public void acelerar(int incremento) throws VehiculoApagadoException, AccidenteException {
        if (!encendido) throw new VehiculoApagadoException("No se puede acelerar un vehículo apagado.");
        velocidadActual += incremento;
        if (velocidadActual > motor.getVelocidadMaxima()) {
            accidentado = true;
            encendido = false;
            throw new AccidenteException("El motor explotó por exceso de velocidad.");
        }
    }

    public void frenar(int decremento) throws VehiculoApagadoException, PatinadaException {
        if (!encendido) throw new VehiculoApagadoException("No se puede frenar un vehículo apagado.");
        if (velocidadActual == 0) return;
        if (decremento > velocidadActual) {
            patinando = true;
            throw new PatinadaException("El vehículo patinó por frenar demasiado fuerte.");
        }
        velocidadActual -= decremento;
    }

    public void frenarBruscamente(int decremento) throws VehiculoApagadoException, PatinadaException {
        if (!encendido) throw new VehiculoApagadoException("No se puede frenar un vehículo apagado.");
        if (decremento > 30 || velocidadActual > llantas.getLimitePermitido()) {
            patinando = true;
            throw new PatinadaException("El vehículo patinó al frenar bruscamente.");
        }
        velocidadActual -= decremento;
    }

    public int getVelocidadActual() { return velocidadActual; }
    public boolean isEncendido() { return encendido; }
    public boolean isPatinando() { return patinando; }
    public boolean isAccidentado() { return accidentado; }
}

