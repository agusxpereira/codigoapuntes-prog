import java.util.*;

public class ComparadorNombre implements Comparator<Persona>{
    public int compare(Persona p1, Persona p2){
        return p1.getEdad() - p2.getEdad();
    }
}