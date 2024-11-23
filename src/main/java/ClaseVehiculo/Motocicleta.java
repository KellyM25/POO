/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseVehiculo;

/**
 *
 * @author Kelly
 */
public class Motocicleta extends Vehiculo{
    private boolean TieneSidecar;
    
    public Motocicleta(String Marca, String Modelo, double Precio, boolean TieneSidecar){
        super(Marca, Modelo, Precio);
        this.TieneSidecar = TieneSidecar;
    }
    
    public boolean getTieneSidecar(){
        return TieneSidecar;
    }
    
    public void setTieneSidecar(boolean TieneSidecar){
        this.TieneSidecar = TieneSidecar;
    }
    
    @Override
    public void MostrarInformacion(){
        super.MostrarInformacion();
        System.out.println("Tiene Sidecar" + (TieneSidecar? "Si" : "No"));
    }
    
}
