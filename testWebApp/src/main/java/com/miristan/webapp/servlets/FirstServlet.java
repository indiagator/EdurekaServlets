package com.miristan.webapp.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by DEV on 28-03-2016.
 */

@WebServlet(name = "First",urlPatterns = "/test")
public class FirstServlet extends HttpServlet
{

    public HttpSession session;

    @Override
    public void init() throws ServletException // constructor for the servlet
    {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    //write response
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        response.getWriter().write("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>");

        response.getWriter().println("<H1 align=\"center\">Welcome to Bank of Honalulu</H1>");


        response.getWriter().println("<form action=\"second\" method=\"Get\">\n" +
                "  Username:<br>\n" +
                "  <input type=\"text\" name=\"username\" value=\"\">\n" +
                "  <br>\n" +
                "  Password:<br>\n" +
                "  <input type=\"password\" name=\"password\" value=\"\">\n" +
                "  <br><br>\n" +
                "  <input type=\"submit\" value=\"Login\">\n" +
                "</form> ");


        response.getWriter().println("</body>\n" +
                "</html>");

    }

}
