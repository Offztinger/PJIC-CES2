
package ces2.entidades;


public interface P_juego {
    int TOPE_PRECIO = 1000;
    
    default String precioJuego (int pJuego){
        return "No tiene moba";
    }
    
        static double verificarLimiteAumentoSalario(){
        return 300000;
    }
   
}
