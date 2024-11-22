/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseCajero;

/**
 *
 * @author Kelly
 */
public class Transcacion {
    float Monto;
    int Cuenta_Origen;
    int Cuenta_Destino;
    String Tipo_Transcacion;
    
    public Transcacion(float Monto, int Cuenta_Origen, int Cuenta_Destino, String  Tipo_Transcacion){
      this.Monto = Monto;
      this.Cuenta_Origen = Cuenta_Origen;
      this.Cuenta_Destino = Cuenta_Destino;
      this.Tipo_Transcacion = Tipo_Transcacion;
    }
    
    public float getMonto(){
        return Monto;
    }
    
    public void setMonto(float Monto){
        this.Monto = Monto;
    }
    
    public int getCuenta_Origen(){
        return Cuenta_Origen;
    }
    
    public void setCuenta_Origen(int Cuenta_Origen){
        this.Cuenta_Origen = Cuenta_Origen;
    }
    
    public int getCuenta_Destino(){
        return Cuenta_Destino;
    }
    
    public void setCuenta_Destino(int Cuenta_Destino){
        this.Cuenta_Destino = Cuenta_Destino;
    }
}   

