
package ces2.entidades;


public class Contratista extends Persona{
    
    public Contratista(String nombre){
        super(nombre);
    }
    
    public String aumentarSalario(int porcentaje){

        if(porcentaje <= TOPE_AUMENTO){
            return getNombre() + "<br>" + "Se le informa que el aumento del salario es de un " + porcentaje + "%.";
        }else{
            return "Lo sentimos, no es posible aumentar el pago por hora mas del " + TOPE_AUMENTO +"%. A la "+ getNombre() + "<br>";
        }
        
    }
}
