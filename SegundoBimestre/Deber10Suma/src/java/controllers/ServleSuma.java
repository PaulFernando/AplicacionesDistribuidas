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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.suma;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author paul
 */
@WebServlet(name = "ServleSuma", urlPatterns = {"/ServleSuma"})
public class ServleSuma extends HttpServlet 
{

   
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         
        
        
        
        //llamo al carro creado e instanciar
        suma proveedor = new suma();
        //vamos a traer los datos de la vista
        //request es un metodo que inicializa los metodos post como get
        //usamos post en nuestro formulario
        proveedor.setNumero1(request.getParameter("txt_num1"));
        proveedor.setNumero2(request.getParameter("txt_num2"));
        
        proveedor.setTotal(request.getParameter("total")); 
        
        
        out.println("");
        out.println("");
        out.println("Suma realizada");
        out.println("<br>");
        //los datos ya estan cargados ahora debo decir que se envien al modelo
        //para lo cual debo especificar a que clase de deben enviar
        
        
        proveedor.RegistroSuma();
        //para redireccionar a una pagina
        RequestDispatcher rd = request.getRequestDispatcher("Datos.html");
        rd.forward(request, response);
       
 
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
