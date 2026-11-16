
package controlador;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import modelo.Coche;

public class ListaCoches{
    private List<Coche> coches;
    private int actual;

    public ListaCoches() {
        this.actual = 0;
        this.coches = new ArrayList();
        coches.add(new Coche("1234abc", LocalDate.of(2005, 3, 20), 20000));
        coches.add(new Coche("4321def", LocalDate.of(2006, 12, 2), 5000));
        coches.add(new Coche("9999ghi", LocalDate.of(2023, 4, 18), 27455));
        coches.add(new Coche("8889jkl", LocalDate.of(1992, 7, 30), 39900));
    }
    
    public boolean esVacia(){
        return coches.isEmpty();
    }
    
    public void retroceder(){
        if(!coches.isEmpty()){
            actual--;
        }
    }
    
    public void avanzar(){
        if(!coches.isEmpty()){
            actual++;
        }
    }
    
    public void irAlPrimero(){
        actual = 0;
    }
    
    public void irAlUltimo(){
        actual = coches.size()-1;
    }
    
    public boolean esPrimero(){
        return actual==0;
    }
    
    public boolean esUltimo(){
        return actual==coches.size()-1;
    }
    
    public void añadirCoche(String matricula, LocalDate fecha, float precio){
        coches.add(new Coche(matricula, fecha, precio));
    }
    
    public void borrarCoche(){
        if(!coches.isEmpty()){
            coches.remove(actual);
            
            if(coches.isEmpty()){
                actual = 0;
            }else{
                actual = coches.size()-1;
            }
        }
    }
    
    public Coche obtenerCoche(){
        return coches.get(actual);
    }
    
    public void ordenar(){
        coches.sort(null);
    } 
}
