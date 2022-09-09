package ces2.entidades;

import java.io.Serializable;

public class Empleado extends Persona implements Pago, Serializable {

    public Empleado(String name, int limite) {
        super(name, limite);

    }

    public String aumentarSalario(int porcentaje) {

        return "Aumentando el salario del empleado en un " + porcentaje + "%. A la " + getNombre();

    }

}
