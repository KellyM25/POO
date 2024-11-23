/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseVehiculo;

/**
 *
 * @author Kelly
 */

import java.util.ArrayList;

public class VentaVehiculos {
    public static void main(String[] args){
      
        Coche coche1 = new Coche("Toyota", "BMW", 20000, 4);
        Motocicleta moto1 = new Motocicleta("Honda", "Pulsar", 6000, false);
        
        ArrayList<Vehiculo> vehiculoEnVenta = new ArrayList<>();
        vehiculoEnVenta.add(coche1);
        vehiculoEnVenta.add(moto1);
        
        
        for (Vehiculo vehiculo : vehiculoEnVenta){
            vehiculo.MostrarInformacion();
            System.out.println("----------------");
        }
        
    }
}
