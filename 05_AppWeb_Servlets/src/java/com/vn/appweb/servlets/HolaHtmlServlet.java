/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.appweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Equipo 5
 */
public class HolaHtmlServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest peticionHttp, HttpServletResponse respuestaHttp) throws IOException{
        respuestaHttp.setContentType("text/html;charset=UTF-8");
        try(PrintWriter salida = respuestaHttp.getWriter()){
        salida.print("<html>");
        salida.print("<head>");
        salida.print("<title>Web HTML desde Servlet</title>");
        salida.print("<LINK REL=\"StyleSheet\" HREF=\"./css\" TYPE=\"text/css\">");
        salida.print("</head>");
        salida.print("<body>"+"<h1>Web HTML desde Servlet</h1>"+"<h2>Hola que pasa</h2>"+"<ul>");
        for (int i=0;i<10;i++){
            salida.print("<li id='listado-"+i+"'> Iteración "+i+"</li>");
        }
        salida.print("</ul>");
        salida.println("</br>Ruta: "+peticionHttp.getContextPath());
        salida.println("</br>Metodo: "+peticionHttp.getMethod());
        salida.print("</body>");
        salida.print("</html>");
        }
    }
}
