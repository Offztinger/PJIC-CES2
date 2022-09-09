package ces2.entidades;

public class Persona {

    private String nombre;
    private int tope;

    public Persona(String name, int limite) {
        this.nombre = name;
        this.tope = limite;
    }

    public String getNombre() {
        return "Persona con nombre: " + nombre + ".";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTope() {
        return tope;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }
    
    

}
