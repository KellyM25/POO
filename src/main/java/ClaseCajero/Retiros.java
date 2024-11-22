/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseCajero;

/**
 *
 * @author Kelly
 */
public class Retiros extends Transcacion {
    private float Mont_Retiro;
    private int Cuenta_Orige;
    private String Motivo_Retiro;
    
    public Retiros(float Mont_Retiro, int Cuenta_Orige, String Motivo_Retiro,float Monto, int Cuenta_Origen, int Cuenta_Destino, String Tipo_Trascacion){
        super(Monto, Cuenta_Origen, Cuenta_Destino, Tipo_Trascacion);
        this.Mont_Retiro = Mont_Retiro;
        this.Cuenta_Orige = Cuenta_Orige;
        this.Motivo_Retiro = Motivo_Retiro;
    }
    
    public float getMont_Retiro(){
        return Mont_Retiro;
    }
    
    public void setMont_Retiro(float Mont_Retiro){
        this.Mont_Retiro = Mont_Retiro;
    }
    
    public int getCuenta_Orige(){
        return Cuenta_Orige;
    }
    
    public void setCuenta_Orige(int Cuenta_Orige){
        this.Cuenta_Orige = Cuenta_Orige;
    }
    
    public String getMotivo_Retiro(){
        return Motivo_Retiro;
    }
    
    public void setMotivo_Retiro(String Motivo_Retiro){
        this.Motivo_Retiro = Motivo_Retiro;
    }
}
