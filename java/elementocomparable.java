import java.util.*;

public class ElementoComparable implements Comparable<ElementoComparable>{
    
    private double peso; 
    
    public ElementoComparable(double peso){
        this.peso = peso;
    }
    
    public double getPeso(){
        return this.peso;
    }
    
    public String toString(){
        return "Este elemento pesa:" + this.getPeso();
    }
    
    public int compareTo(ElementoComparable elemento){
        return Double.compare(this.getPeso(), elemento.getPeso());
    }
    
}