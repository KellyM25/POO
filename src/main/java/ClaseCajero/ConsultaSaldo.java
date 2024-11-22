/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseCajero;

/**
 *
 * @author Kelly
 */
public class ConsultaSaldo extends Transcacion{
    private int Cuenta_Consulta;
   
    
    public ConsultaSaldo(int Cuenta_Consulta, float Monto, int Cuenta_Origen, int Cuenta_Destino, String Tipo_Trascacion){
        super(Monto, Cuenta_Origen, Cuenta_Destino, Tipo_Trascacion);
        this.Cuenta_Consulta = Cuenta_Consulta;
    }
    
    public int getCuenta_Consulta(){
        return Cuenta_Consulta;
    }
    
    public void setCuenta_Consulta(){
        this.Cuenta_Consulta = Cuenta_Consulta;
    }
    
}

