package com.miristan.webapp.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by DEV on 28-03-2016.
 */
@WebServlet(name = "Second",urlPatterns = "/second")
public class SecondServlet extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.getWriter().write("second servlet says hi for post method");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        String userName = request.getParameter("username");
        String passWord  = request.getParameter("password");

        request.getSession().setAttribute("username",userName);
        request.getSession().setAttribute("password",passWord);

        request.getServletContext().setAttribute("time","5436436234");

        response.getWriter().write("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>");

        response.getWriter().println("<H1 align=\"center\">Welcome to Bank of Honalulu</H1>");


        response.getWriter().write("second servlet says <H3> Hi! "+userName+" "+passWord+"</H3> for get method");

        response.getWriter().write("<a href=\"http://localhost:8080/testWebApp/third\">Account Transfers</a>");


        response.getWriter().println("</body>\n" + "</html>");

    }
}
