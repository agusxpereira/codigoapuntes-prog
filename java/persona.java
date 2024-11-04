import java.util.*;

public class Persona implements Comparable<Persona>{
    private String nombre;
    private String apellido;
    private int edad;
    private boolean pagoCuota;
    private ArrayList<Alquiler> alquileres;
    
    public Persona(String nombre, String apellido,  int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
        this.pagoCuota = false;
        alquileres = new ArrayList<Alquiler>();
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public boolean getPago(){
        return this.pagoCuota;
    }
    
    public void alquilarCancha(Cancha cancha){
        alquileres.add(new Alquiler(this.getNombre(), cancha.getId(), cancha.getPrecio()));
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public int compareTo(Persona p1){
        int result = this.getNombre().compareTo(p1.getNombre());
        
        if(result == 0)
            return this.getApellido().compareTo(p1.getApellido());
        
        return result;
    }
    public void setPago(){
        this.pagoCuota = true;
    }
    public String toString(){
        return "Nombre: " + this.getNombre() + ". Edad: " + this.getEdad();
    }
}