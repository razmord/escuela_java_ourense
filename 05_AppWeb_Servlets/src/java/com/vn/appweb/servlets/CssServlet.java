/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.appweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Equipo 5
 */
public class CssServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest peticionHttp, HttpServletResponse respuestaHttp) throws IOException{
        respuestaHttp.setContentType("text/css");
        try(PrintWriter salida = respuestaHttp.getWriter()){
        salida.print("h1{"
                + "color:red;"
                + "}"
                + "ul{"
                + "background-color:lightblue;"
                + "}");
        }
    }
}
