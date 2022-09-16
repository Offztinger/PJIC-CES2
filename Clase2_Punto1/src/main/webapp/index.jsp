<%-- 
    Document   : index
    Created on : 15/09/2022, 11:52:33 p. m.
    Author     : Alejandro Calvo
--%>
<%@page import="ces2.entidades.MOBA"%>
<%@page import="ces2.entidades.Videojuego"%>
<%@page import="ces2.entidades.RPG"%>
<%@page import="ces2.entidades.Shooter"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <link rel="stylesheet" href="css/style.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <div>
                <div>
                    
                <form action="Controlador" method="POST">
                    <h2>Ingrese aquí</h2>
                    <br>
                    <br>

                    <label for="videojuego">Nombre del  videojuego:</label>
                    <input type="text" id="videojuego" name="videojuego" placeholder="Nombre del videojuego" title="Por favor ingrese una videojuego" required="">
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
                    List<Videojuego> videojuegos = (List<Videojuego>) request.getAttribute("videojuegos");
                    RPG rp;
                    Shooter shoot;
                    MOBA mob;

                    if(videojuegos != null){
                        for(Videojuego p: videojuegos){
                            if(p instanceof RPG){
                                rp = (RPG) p;


                %>
                <div>
                    <p>El descuento para el <b>RPG</b> <span><%= rp.aumentarSalario(15) %></span></p>
                </div>
                <%
                            }else if( p instanceof Shooter){
                                shoot = (Shooter) p;
               %>
                <div>
                    <p>El descuento para el <b>Shooter</b> <span><%= shoot.aumentarSalario(5) %></span></p>
                </div>
                                <%
                            }else if( p instanceof MOBA){
                                mob = (MOBA) p;
               %>
                <div>
                    <p>El descuento para el <b>MOBA</b> <span><%= mob.precioJuego(1000) %></span></p>
                </div>
                <%
                                
                            }
                        }
                    }
                %>
                    
                </div>
            </div>
        </div>
    </body>
</html>
