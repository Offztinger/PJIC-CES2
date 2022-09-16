
package ces2.entidades;


public class Codigo_shooter extends rpg{
    
    public Codigo_shooter(String nombre){
        super(nombre);
    }
    
    public String graCias(String graci){
        return graci;
    }
    
    public String horaLlegada(int hora){

        if(hora <= TOPE_AUMENTO){
            return getCarro() + "<br>" + " La hora de salida de la shooter es " + hora + "AM.";
        }else{
            return "";
        }
        
    }

}
