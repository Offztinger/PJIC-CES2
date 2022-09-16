
package ces2.entidades;


public abstract class rpg {
    private final String nombre;
    
    
    int TOPE_AUMENTO = 20; //Tope del aumento del salario
    private String nombreP;
    
    public rpg(String rpg2){
        this.nombre = rpg2;
    }

    public String getCarro(){
        return " Vehiculo: "+
                this.nombre;
    }
    
    public String darViaLibre(){
        return "<br>" + " Acceso concedido al vehiculo con codigo: "+
                this.nombre+"<br>";
    }
    
    public String nombrePropietario(){
   
                return "<br>" + " "+
                this.nombre;
    }
    
    public String ascender2(String graci){
        String salida = "";
        
        salida += graCias(graci);
        salida += " vehiculo con codigo: "+
                this.nombre+"<br>";
        return salida;
    }
    
    public String ascencer(int hora){
        String salida = "";
                
        salida += darViaLibre();
        
        //Llamado un metodo abstracto
        salida += horaLlegada(hora);
        salida += " Con codigo: "+
                this.nombre+"<br>";
        return salida;
    }
    
    public abstract String horaLlegada(int hora);
    public abstract String graCias(String graci);
    
}
