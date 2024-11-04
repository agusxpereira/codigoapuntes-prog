public class Cancha{
    public static int id_global = 0;
    public  int id;
    private double precio;
    
    public Cancha(double precio){
        this.id = id_global;
        Cancha.id_global++;
        this.precio = precio;
    }
    
    public int getId(){
        return this.id;
    }
    public double getPrecio(){
        return this.precio;
    }
}