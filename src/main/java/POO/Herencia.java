/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

import java.util.ArrayList;
import java.util.List;
        
        

/**
 *
 * @author Kelly
 */
public class Herencia {
    
    public static void main(String[] args){
        Animal p = new Perro("Negro", "Si", "Si","Si", (4));
        Animal g = new Gato("Gato", "Si", "Si", "Si", (4));

        List<Animal> lista = new ArrayList<Animal>();
        lista.add(p);
        lista.add(g);
       
     
        
        for (Animal item : lista){
            item.Sonido();
        }
   
    }
    
    
}
