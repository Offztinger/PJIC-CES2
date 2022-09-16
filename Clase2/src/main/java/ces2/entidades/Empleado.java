
package ces2.entidades;

public class Empleado extends Persona{
    
    public Empleado(String nombre){
        super(nombre);
    }
    
    public String aumentarSalario (int porcentaje){
         return getNombre() + "<br>" + "Se le informa que el aumento del salario es de un " + porcentaje +"%.";
    }
    

}
