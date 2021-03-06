/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.registroproveedores;

/**
 *
 * @author paul
 */
public class controladorProveedores extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        try {
               //llamo al carro creado e instanciar
           registroproveedores estudiante = new registroproveedores();
           //vamos a traer los datos de la vista
           //request es un metodo que inicializa los metodos post como get
           //usamos post en nuestro formulario
           estudiante.setNombre(request.getParameter("txt_nombre")); 
           estudiante.setRuc(request.getParameter("ruc"));
           estudiante.setDireccion(request.getParameter("txt_direccion"));
           estudiante.setTelefono(request.getParameter("telefono"));
           estudiante.setEmail(request.getParameter("email"));
           estudiante.setCiudad(request.getParameter("txt_ciudad"));
           estudiante.setSitioweb(request.getParameter("txt_web"));
           //los datos ya estan cargados ahora debo decir que se envien al modelo 
           //para lo cual debo especificar a que clase de deben enviar
           estudiante.RegistroEstudiante();
           
           //para redireccionar a una pagina 
           RequestDispatcher rd = request.getRequestDispatcher("verificacion.jsp");
                   rd.forward(request, response);
      
        }finally{
            out.close();
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
