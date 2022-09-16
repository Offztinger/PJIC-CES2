
package ces2.entidades;

import java.io.Serializable;


public class RPG extends Videojuego implements D_juego, P_juego, Serializable{
    
    double limite = D_juego.verificarLimiteAumentoSalario();
    
    public RPG(String vid){
        super(vid);
    }
    
    public String aumentarSalario (int porcentaje){
         return ""+getJuego()+", es de un " + porcentaje+"%.";
    }
    

}
