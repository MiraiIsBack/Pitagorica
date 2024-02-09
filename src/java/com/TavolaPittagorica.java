/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author NCIOCOZAN
 */
public class TavolaPittagorica extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        /* TODO output your page here. You may use following sample code. */
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet TavolaPittagorica</title>");
        out.println("<link rel=\"stylesheet\" href=\"style.css\">");
        out.println("</head>");
        out.println("<body>");
        String s = request.getParameter("num");
        int num = 0;
        try {
            num = Integer.parseInt(s);
            out.println("<table>");
            out.println("<tr>");
                for (int j = 0; j < num + 2; j++) {
                    out.println("<td " + (j == 0 ? "> x" : "class='FirstCol'>" + (j - 1)) + "</td>");
                }
                out.println("</tr>");
            for (int i = 0; i < num + 1; i++) {
                out.println("<tr>");
                for (int j = -1; j < num + 1; j++) {
                    out.println("<td " + (j == -1 ? "class='FirstCol'>" + i : ">" + (j * i)) + "</td>");
                }
                out.println("</tr>");
            }
            out.println("</table>");
        } catch (NumberFormatException e) {
            out.println("<p>Non hai inserito un numero</p>");
        }
        out.println("</body>");
        out.println("</html>");

    }
}
