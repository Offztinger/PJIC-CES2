package ces2.entidades;

public class Contratista extends Persona implements Pago {

    public Contratista(String name, int limite) {
        super(name, limite);
    }

    public String aumentarSalario(int porcentaje) {

        String salida = "";

        if (porcentaje <= TOPE_AUMENTO) {
            salida = "Aumentando el salario del contrantista en un " + porcentaje + "%. A la " + getNombre();
        } else {
            salida = "Lo sentimos, no es posible aumentar el pago por hora más del " + TOPE_AUMENTO + "%. A la " + getNombre();
        }

        return salida;
    }
}
