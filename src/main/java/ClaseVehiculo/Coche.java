/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseVehiculo;

/**
 *
 * @author Kelly
 */
public class Coche extends Vehiculo{
    private int Numero_Puertas;
    
    public Coche(String Marca, String Modelo, double Precio, int Numero_Puertas){
        super(Marca, Modelo, Precio);
        this.Numero_Puertas = Numero_Puertas;
    }
    
    public int getNumero_Puertas(){
        return Numero_Puertas;
    }
    
    public void setNumero_Puertas(int Numero_Puertas){
        this.Numero_Puertas = Numero_Puertas;
    }
    
    public void MostrarInformacion(){
        super.MostrarInformacion();
        System.out.println("Numero_Puertas: " + Numero_Puertas);
    }
}
