<%-- 
    Document   : index
    Created on : 15/09/2022, 11:52:38 p. m.
    Author     : Alejandro Calvo
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@page import="ces2.entidades.Codigo_shooter"%>
<%@page import="ces2.entidades.Codigo_rpg"%>
<%@page import="java.util.List"%>
<%@page import="ces2.entidades.rpg"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <link rel="stylesheet" href="css/style.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div>
                <div>
                <form action="Controlador" method="POST">
                    <h2>Ingrese aquí</h2>
                    <br>
                    <br>

                    <label for="Codigo">Código del videojuego:</label>
                    <input type="text" id="Codigo" name="Codigo" placeholder="Codigo del videojuego" title="Por favor ingrese el codigo del vieojuego" required="">
                    <br>
                    <br>
                    <label for="tipos">Seleccione un tipo:</label>
                    <select id="tipos" name="tipos" title="Por favor seleccione un tipo">
                        <option value="rpg">RPG</option>
                        <option value="shooter">Shooter</option>
                        <option value="moba">MOBA</option>
                    </select>
                    <br>
                    <br>
                    <input type="submit" value="Enviar">
                </form>
                <br>
                <br>
                <%
                    List<rpg> juegos = (List<rpg>) request.getAttribute("juegos");

                    if(juegos != null){
                        for(rpg p: juegos){
                %>
                <div>

                    <p><span><%= p.ascencer(10) %></span><span><%= p.ascender2("Gracias por visitarnos")%></span></p>
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
