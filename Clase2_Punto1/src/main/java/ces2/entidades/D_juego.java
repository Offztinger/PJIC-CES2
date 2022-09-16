
package ces2.entidades;


public interface D_juego {
    
    int TOPE_AUMENTO = 5;
    
    default String aumentarSalario (int porcentaje){
        return "No tiene";
    }
    
        static double verificarLimiteAumentoSalario(){
        return 300000;
    }
   
}
