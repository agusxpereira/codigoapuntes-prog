import java.util.*;

public class Futbol5{
    
     public static void main(String[] args) {
         ArrayList<Persona> clientes = new ArrayList<Persona>();
         ArrayList<Persona> clientesImpagos = new ArrayList<Persona>();
         ArrayList<Persona> clientesCachaC1 = new ArrayList<Persona>();
         
         
         Persona p1 = new Persona("C", "Fulanito", 23);
         Persona p2 = new Persona("B", "Fulanito1", 16);
         Persona p3 = new Persona("A", "Fulanito2", 17);
         Persona p4 = new Persona("D", "Fulanito3", 29);
         
         Cancha c1 = new Cancha(100.0);
         Cancha c2 = new Cancha(255.0);
         
         
         p1.alquilarCancha(c1);
         p2.alquilarCancha(c1);
         p2.alquilarCancha(c2);
         
         p3.alquilarCancha(c1);
         p4.alquilarCancha(c1);
         p4.alquilarCancha(c2);
         
         
         p1.setPago();
         p4.setPago();
         
         clientes.add(p1);
         clientes.add(p2);
         clientes.add(p3);
         clientes.add(p4);
         
         
        ComparadorNombre comp = new ComparadorNombre();
        ComparadorDoble comp2 = new ComparadorDoble();
        CondicionPago condicion = new CondicionPago();
         
         for(Persona per: clientes){
             if(condicion.cumple(per))
                clientesImpagos.add(per);
         }

         /*d) Todos los socios que pagaron más de $500 por algún alquiler de cancha, listando 
primero los que tienen las cuotas pagas, ordenados alfabéticamente y luego los 
morosos, también ordenados alfabéticamente.
    1. Primero tenemos que filtrarlos: "Todos los socion que pagaron..."
    2. Segundo ordenamos por si pagaron o no (Es un comparador?) Deberia ser un listado complejo
    3. 

*/
         
         
         Collections.sort(clientes, comp2);
         for(Persona per: clientes){
             System.out.println(per);
         }
         
     }
    
}