/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import DAO.UsuarioJpaController;
import Entity.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import proceso.Paso;

/**
 *
 * @author jgcan
 */
@WebServlet(name = "anadir", urlPatterns = {"/anadir"})
public class anadir extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           String nombre=request.getParameter("nombre");
           String apellido=request.getParameter("last");
           String edad=request.getParameter("age");
           String direccion=request.getParameter("add");
           String password=request.getParameter("pass");
           String correo=request.getParameter("email");
           String captcha=request.getParameter("g-recaptcha-response");
           boolean jgcf=Paso.verificar(captcha);
            if (jgcf){
                Usuario us = new Usuario(); 
              // UsuarioJpaController thor = new UsuarioJpaController();
                EntityManagerFactory jacf= Persistence.createEntityManagerFactory("persistence");
                EntityManager fcfc=  jacf.createEntityManager();
                EntityTransaction gcf = fcfc.getTransaction();
                gcf.begin();
                us.setNombre(nombre);
                us.setApellido(apellido);
                us.setEdad(edad);
                us.setDireccion(direccion);
                us.setCorreo(correo);
                us.setPassword(password);
                fcfc.persist(us);
                gcf.commit();
                fcfc.close();
                
                response.sendRedirect("redirect.jsp");
            }else{
            response.sendRedirect("index.jsp");
            }
            
            //System.out.println( nombre + "" + apellido + "" + edad + "" + direccion + "" + password + "" + correo );
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
