
package ces2.entidades;

public class Codigo_rpg extends rpg{
    
    public Codigo_rpg(String rpg2){
        super(rpg2);
    }
    public String graCias(String graci){
        return graci;
    }
    public String horaLlegada (int hora){
         return getCarro() + "<br>" + " La hora de salida del rpg es " + hora +"PM.";
    }
    
}
