/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseCajero;

/**
 *
 * @author Kelly
 */
public class Depositos extends Transcacion {
    private float Monto_Deposito;
    private int Cuenta_Destin;
    private String Referencia_Deposito;
    
    public Depositos(float Monto_Deposito, int Cuenta_Destin, String Referncia_Deposito,float Monto, int Cuenta_Origen, int Cuenta_Destino, String Tipo_Trascacion ){
        super(Monto, Cuenta_Origen, Cuenta_Destino,Tipo_Trascacion );
        this.Monto_Deposito = Monto_Deposito;
        this.Cuenta_Destin = Cuenta_Destin;
        this.Referencia_Deposito = Referncia_Deposito;
    }
    
    public float getMonto_Deposito(){
        return Monto_Deposito;
    }
    
    public void setMonto_Deposito(float Monto_Deposito){
      this.Monto_Deposito = Monto_Deposito;
    }
    
    public int getCuenta_Destin(){
        return Cuenta_Destin;
        
    }
    
    public void setCuenta_Destin(int Cuenta_Destin){
        this.Cuenta_Destin = Cuenta_Destin;
    }
    
    public String getReferencia_Deposito(){
        return Referencia_Deposito;
    }
    
    public void setReferencia_Deposito( String Referencia_Deposito){
        this.Referencia_Deposito = Referencia_Deposito;
    }
}
