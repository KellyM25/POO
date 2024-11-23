/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseVehiculo;

/**
 *
 * @author Kelly
 */
public class Vehiculo {
   private String Marca;
   private String Modelo;
   private double Precio;
   
   public Vehiculo(String Marca, String Modelo, double Precio){
       this.Marca = Marca;
       this.Modelo = Modelo;
       this.Precio = Precio;
   }
   
   public String getMarca(){
       return Marca;
   }
   
   public void setMarca(String Marca){
       this.Marca = Marca;
   }
   
   public String getModelo(){
       return Modelo;
   }
   
   public void setModelo(String Modelo){
       this.Modelo = Modelo;
   }
   
   public double getPrecio(){
       return  Precio;
   }
   
   public void setPrecio(double Precio){
       this.Precio = Precio;
   }
   
   public void MostrarInformacion(){
       System.out.println("Marca: " + Marca);
       System.out.println("Modelo: " + Modelo);
       System.out.println("Precio: " + Precio);
   }
}
