
package ces2.entidades;


public class Shooter extends Videojuego implements D_juego, P_juego{
    
    public Shooter(String vid){
        super(vid);
    }
    
    public String aumentarSalario (int porcentaje){
        
        String salida = "";
        
        if(porcentaje <= TOPE_AUMENTO){
            salida = "" +getJuego()+", es de un -" + porcentaje+"%.";
        }else{
            salida = " Lo sentimos, no es encuentra el shooter a la videojuego: "+ getJuego();
        }
        
         return salida;
    }
}
