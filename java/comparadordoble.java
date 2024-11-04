import java.util.*;

public class ComparadorDoble implements Comparator<Persona>{
    public int compare(Persona p1, Persona p2){
        int result = Boolean.compare(p1.getPago(), p2.getPago());
        
        if(result == 0)
            return p1.compareTo(p2);
        
        return result;
        
    }
}