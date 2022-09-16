
package ces2.entidades;


public abstract class Persona {
    private final String car;
    private String direccion;
    
    int TOPE_AUMENTO = 20; //Tope del aumento del salario
    
    public  Persona(String nom){
        this.car = nom;
    }
    
    public String getNombre(){
        return " persona: "+
                this.car;
    }
    
    public String cambiarDireccion(String dir){
        this.direccion = dir;
        return "<br>" + " La nueva direccione es: "+
                this.direccion;
    }
    
    public String darDiaLibre(){
        return "<br>" + " Dando un dia libre a la persona: "+
                this.car+"<br>";
    }
    
    public String ascencer(int porcentaje){
        String salida = "";
        salida += darDiaLibre();
        
        //Llamado un metodo abstracto
        salida += aumentarSalario(porcentaje);
        salida += " Dando un ascenso a la persona: "+
                this.car+"<br>";
        return salida;
    }
    
    
    //Metodo abstracto para implementar en las subsclases
    //no se sabe que tendra este metodo
    public abstract String aumentarSalario(int porcentaje);
}
