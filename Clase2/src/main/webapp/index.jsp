<%-- 
    Document   : index
    Created on : 15/09/2022, 9:36:59 p. m.
    Author     : Alejandro Calvo
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@page import="ces2.entidades.Contratista"%>
<%@page import="ces2.entidades.Empleado"%>
<%@page import="java.util.List"%>
<%@page import="ces2.entidades.Persona"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <link rel="stylesheet" href="css/style.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <div class="">
                <div>
                    
                <form action="Controlador" method="POST">
                    <h2>Ingrese aquí</h2>
                    <br>
                    <br>

                    <label for="UserName">Nombre Usuario:</label>
                    <input type="text" id="UserName" name="UserName" placeholder="Nombre Usuario" title="Por favor ingrese un usuario" required="">
                    <br>
                    <br>
                    <label for="tipos">Seleccione un tipo:</label>
                    <select id="tipos" name="tipos" title="Por favor seleccione un tipo">
                        <option value="empleado">Empleado</option>
                        <option value="contratista">Contratista</option>
                    </select>
                    <br>
                    <br>
                    <input type="submit" value="Enviar">
                </form>
                <br>
                <br>
                <%
                    List<Persona> trabajadores = (List<Persona>) request.getAttribute("trabajadores");

                    if(trabajadores != null){
                        for(Persona p: trabajadores){
                %>
                <div>
                    <p><span><%= p.ascencer(20) %></span></p>
                </div>
                <%
                        }      
                    }
                %>
                    
                </div>
            </div>
        </div>
    </body>
</html>
