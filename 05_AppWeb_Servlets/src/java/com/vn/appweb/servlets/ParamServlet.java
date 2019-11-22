/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.appweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Equipo 5
 */
public class ParamServlet extends HttpServlet {

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
           response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ParamServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ParamServlet at " + request.getContextPath() + "</h1>");
            out.println("<form name='formDatos' action'./formulario' method='POST'>");
            out.println("<label>Campo:</label>");
            out.println("<input id='nombre_campo' name='nombre_campo' required/>");
             out.println("<input id='email_campo' name='email_campo' required type='email'/>");
            out.println("<input type='submit' value'Envia Parametros'/>");
              out.println("</form>");
            out.println("</body>");
            out.println("</html>");}
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
                response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ParamServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ParamServlet at " + request.getContextPath() + "</h1>");
            out.println("<form name='formDatos' action'./formulario'> method='POST'");
            out.println("<label>Campo:</label>");
            out.println("<input id='nombre_campo' name='nombre_campo' required/>");
             out.println("<input id='email_campo' name='email_campo' required type='email'/>");
            out.println("<input type='submit' value'Envia Parametros'/>");
              out.println("</form>");
            String valorCampo =request.getParameter("nombre_campo");
            if("".equals(valorCampo)||valorCampo==null)
                out.println("<p style='color: red'>No se ha recibido el parámetro nombre</p>");
            else
                out.println("<p style='color: green'>Nombre: "+valorCampo+"</p>");
            String valorCampo2 =request.getParameter("email_campo");
            if("".equals(valorCampo2)||valorCampo2==null)
                out.println("<p style='color: red'>No se ha recibido el parámetro email</p>");
            else
                out.println("<p style='color: green'>Email: "+valorCampo2+"</p>");
            //jdbc:derby://localhost:1527/db_prueba
            try{
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
            }catch (Exception ex) {
                        Logger.getLogger(ParamServlet.class.getName()).log(Level.SEVERE, null, ex);
                        out.println("<p style='color: red'>No se ha cargado DerbyDB</p>");
                    }
            try(Connection con = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/db_prueba",
                    "root",
                    "1234"
            )){ //
                String sqlQuery = "INSERT INTO persona(nombre,email) VALUES ('"+valorCampo+"','"+valorCampo2+"')";
                Statement sentenciaSQL = con.createStatement();
                sentenciaSQL.executeUpdate(sqlQuery);
            
            }    catch (SQLException ex) {
                 out.println("<p style='color: red'>Error SQL.</p>");
                        Logger.getLogger(ParamServlet.class.getName()).log(Level.SEVERE, null, ex);
                    }
            out.println("</body>");
            out.println("</html>");
        }
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
