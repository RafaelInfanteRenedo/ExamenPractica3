
package controlador;

import java.time.LocalDate;

public class Test {
    
    public static boolean comprobarFecha(LocalDate fecha){
        if(fecha.getYear()<1900 || fecha.getYear() > 2026){
            return false;
        }else{
            return true;
        }
    }
    
    public static boolean comprobarPrecio(float precio){
        if(precio >= 0 && precio <= 150000){
            return true;
        }else{
            return false;
        }
    }
}
