/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ces2.controladores;

import ces2.entidades.Codigo_moba;
import ces2.entidades.Codigo_rpg;
import ces2.entidades.Codigo_shooter;
import ces2.entidades.rpg;
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
            
            List<rpg> juegos;
            juegos = (List<rpg>) sesion.getAttribute("juegos");
            
            String codigo = request.getParameter("Codigo");
            String tipo = request.getParameter("tipos");
            
            if(codigo != null && !codigo.isEmpty()&& tipo != null && !tipo.isEmpty()){
                
                Codigo_rpg rpg2;
                Codigo_shooter shoot;
                Codigo_moba mob;
                
                if (tipo.equals("rpg")){
                    rpg2 = new Codigo_rpg(codigo);
                    
                    if(juegos == null){
                        juegos = new ArrayList<>();
                        juegos.add(rpg2);
                        sesion.setAttribute("juegos", juegos);
                    }else{
                        juegos.add(rpg2);
                    }
                    
                }else if(tipo.equals("shooter")){
                   shoot = new Codigo_shooter(codigo);
                    
                    if(juegos == null){
                        juegos = new ArrayList<>();
                        juegos.add(shoot);
                        sesion.setAttribute("juegos", juegos);
                    }else{
                        juegos.add(shoot);
                    }
                }else if(tipo.equals("moba")){
                   mob = new Codigo_moba(codigo);
                    
                    if(juegos == null){
                        juegos = new ArrayList<>();
                        juegos.add(mob);
                        sesion.setAttribute("trabajadores", juegos);
                    }else{
                        juegos.add(mob);
                    }
                }
                
                
                request.setAttribute("juegos", juegos);
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
