
package ces2.entidades;

public class Codigo_moba extends rpg{
        public Codigo_moba(String car){
        super(car);
    }
    public String graCias(String graci){
        return graci;
    }
    public String horaLlegada (int hora){
         return getCarro() + "<br>" + " La hora de salida del cami�n es " + hora +"PM.";
    }

}
