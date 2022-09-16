/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ces2.controladores;

import ces2.entidades.Shooter;
import ces2.entidades.Videojuego;
import ces2.entidades.RPG;
import ces2.entidades.MOBA;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author user
 */
public class Controlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            HttpSession sesion = request.getSession(true);
            
            List<Videojuego> videojuegos;
            videojuegos = (List<Videojuego>) sesion.getAttribute("videojuegos");
            
            String videojuego = request.getParameter("videojuego");
            String tipo = request.getParameter("tipos");
            
            if(videojuego != null && !videojuego.isEmpty()&& tipo != null && !tipo.isEmpty()){
                
                RPG emp;
                Shooter contr;
                MOBA mob;
                
                if(tipo.equals("rpg")){
                    emp = new RPG(videojuego);
                    
                    if(videojuegos == null){
                        videojuegos = new ArrayList<>();
                        videojuegos.add(emp);
                        sesion.setAttribute("videojuegos", videojuegos);
                    }else{
                        videojuegos.add(emp);
                    }
                    
                }else if(tipo.equals("shooter")){
                   contr = new Shooter(videojuego);
                    
                    if(videojuegos == null){
                        videojuegos = new ArrayList<>();
                        videojuegos.add(contr);
                        sesion.setAttribute("videojuegos", videojuegos);
                    }else{
                        videojuegos.add(contr);
                    }
                }else if(tipo.equals("moba")){
                   mob = new MOBA(videojuego);
                    
                    if(videojuegos == null){
                        videojuegos = new ArrayList<>();
                        videojuegos.add(mob);
                        sesion.setAttribute("videojuegos", videojuegos);
                    }else{
                        videojuegos.add(mob);
                    }
                }
                
                request.setAttribute("videojuegos", videojuegos);
                request.getRequestDispatcher("index.jsp").forward(request, response);
                
            }else{
                out.println("Se debe ingresar el nombre y el tipo.");
            }
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
