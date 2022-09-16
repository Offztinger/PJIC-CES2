
package ces2.entidades;

public class MOBA extends Videojuego implements D_juego, P_juego{

    public MOBA(String vid) {
        super (vid);
    }
        public String precioJuego (int pJuego){
        
        String salida = "";
        
        if(pJuego <= TOPE_PRECIO){
            salida = ""+ getJuego()+", es de " + "$" + pJuego + ".";
        }
        
         return salida;
    }
}
