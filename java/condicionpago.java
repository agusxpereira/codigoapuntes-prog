public class CondicionPago extends Condicion{
    public boolean cumple(Persona per){
        return per.getPago() == false;
    }
}