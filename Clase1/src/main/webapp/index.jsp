<%-- 
    Document   : index
    Created on : 1/09/2022, 10:57:45 p. m.
    Author     : Alejandro Calvo
--%>

<%@page import="ces2.entidades.Contratista"%>
<%@page import="ces2.entidades.Empleado"%>
<%@page import="java.util.List"%>
<%@page import="ces2.entidades.Persona"%>
<%@page import="ces2.entidades.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            List<Persona> trabajadores = (List<Persona>) request.getAttribute("trabajadores");
            Empleado emple;
            Contratista contra;

            if (trabajadores != null) {
                for (Persona p : trabajadores) {
                    if (p instanceof Empleado) {
                        emple = (Empleado) p;
        %>
                        <span><%= emple.aumentarSalario(emple.getTope())%></span><br>
        <%

                    } else if (p instanceof Contratista) {
                        contra = (Contratista) p;
                    

        %>
                        <span><%= contra.aumentarSalario(contra.getTope())%></span><br>
        <%
        
                    }
                }
            }

        %>
        <br>
        <br>
        <form action="ControladorServlet" method="POST">
            <label for="Username">Nombre usuario:</label>
            <input type="text" id="Username" name="Username" placeholder="Nombre de usuario:">
            <br>
            <br>
            <label for="tope">Tope:</label>
            <input type="number" id="Tope" name="Tope" placeholder="Establezca un tope:">
            <br>
            <br>
            <label for="tipos">Seleccione un tipo:</label>
            <select id="Tipo" name="Tipo">
                <option value="Empleado">Empleado</option>
                <option value="Contratista">Contratista</option>             
            </select> 
            <br>
            <br>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>

