package ces2.controladores;

import ces2.entidades.Contratista;
import ces2.entidades.Empleado;
import ces2.entidades.Persona;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Stateful(passivationCapable = false)
public class ControladorServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {

            HttpSession sesion = request.getSession(true);

            List<Persona> trabajadores;
            trabajadores = (List<Persona>) sesion.getAttribute("trabajadores");
//Creación de variables según formulario
            String nombre = request.getParameter("Username");
            String tipo = request.getParameter("Tipo");
            int tope = 0;
            tope = Integer.parseInt(request.getParameter("Tope"));
//Validación de campos vacios
            if (nombre != null && !nombre.isEmpty() && tipo != null && !tipo.isEmpty() && tope >= 0) {
//Definición de clases
                Empleado emple;
                Contratista contra;
//Si el tipo equivale a empleado
                if (tipo.equals("Empleado")) {
//Se define el constructor y se pasan 2 parametros, el nombre y el tope
                    emple = new Empleado(nombre, tope);

                    if (trabajadores == null) {
//Se aañade un nuevo empleado a la lista
                        trabajadores = new ArrayList<>();
                        trabajadores.add(emple);
                        sesion.setAttribute("trabajadores", trabajadores);

                    } else {
//Sino, se añade al final
                        trabajadores.add(emple);

                    }

                } else if (tipo.equals("Contratista")) {

                    contra = new Contratista(nombre, tope);

                    if (trabajadores == null) {

                        trabajadores = new ArrayList<>();
                        trabajadores.add(contra);
                        sesion.setAttribute("trabajadores", trabajadores);

                    } else {
                        trabajadores.add(contra);
                    }
                }

                request.setAttribute("trabajadores", trabajadores);
                request.getRequestDispatcher("index.jsp").forward(request, response);

            } else {
                out.println("Se debe ingresar el nombre y el tipo");
            }

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
