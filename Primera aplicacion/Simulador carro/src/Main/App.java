package Main;

import Controlador.ControladorVehiculo;
import Logica.Vehiculo;
import Vista.Vista;

public class App {
    public static void main(String[] args) {
        // Crear el modelo
        Vehiculo vehiculo = new Vehiculo();

        // Crear la vista (JFrame)
        Vista vista = new Vista();
        vista.setVisible(true);

        // Crear el controlador y enlazarlo
        ControladorVehiculo controlador = new ControladorVehiculo(vehiculo, vista);
    }
}



