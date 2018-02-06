/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author paul
 */
@WebServlet(name = "ServletSuma", urlPatterns = {"/ServletSuma"})
public class ServletSuma extends HttpServlet {
    
    public int numero1;
    public int numero2;
    public int total;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        //variables para la conexion
        
        Connection conexion = null; //objeto para la bd
        Statement sentencia1 = null; //onjeto para ejecutar 1
        Statement sentencia2 = null; //objeto para ejecutar 2
        ResultSet resultados = null; //objeto para guardar los resultados
        
        String cadenaConexion = "jdbc:mysql://localhost:3306/suma";
        String usuariobd = "root";
        String paswordbd = "";
        
        numero1 = Integer.parseInt(request.getParameter("txt_num1"));
        numero2 = Integer.parseInt(request.getParameter("txt_num2"));
        
         total = numero1 + numero2;
         
         
             try {
            
             //leemos el driver sql
            Class.forName("com.mysql.jdbc.Driver");
            //conexion bd
            conexion = DriverManager.getConnection(cadenaConexion, usuariobd, paswordbd);
            //INSERTAR
            sentencia1 = conexion.createStatement();
            //visualizar o traer 
            sentencia2 = conexion.createStatement();

            sentencia1.execute("INSERT INTO total_suma(total, numero1, numero2)"
                    + "VALUES('" + total + "','" + numero1 + "','" + numero2 + "');");
            
            
            resultados = sentencia2.executeQuery("SELECT * FROM total_suma");

            out.println("");
            out.println("");
            out.println("Suma realizada");
            out.println("<br>");
            while (resultados.next()) {

                out.println("Operacion " + resultados.getString("id")+")");
                out.println(" ");
                out.println(resultados.getString("numero1"));
                out.println("+");
                 out.println(resultados.getString("numero2"));
                out.println("=");
                 out.println(resultados.getString("total"));
                out.println("");
                out.println("<br>");

            }
            out.println("");
            out.println("");
            
            

        } 
        catch (ClassNotFoundException e1) 
        {
            out.println("ERROR: NO DRIVER BASE DE DATOS" + e1.getMessage());
        } catch (SQLException e2) 
        {
            out.println("ERROR: fallo en sql" + e2.getMessage());
        } 
        finally 
        {
            try 
            {
                if (conexion != null) 
                {
                    conexion.close();
                }
            } 
            catch (Exception e3) 
            {
                out.println("descanectra la base de datos" + e3.getMessage());
            }
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
