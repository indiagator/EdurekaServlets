package com.miristan.webapp.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by DEV on 05-12-2016.
 */

@WebServlet(name = "First",urlPatterns = "/third")
public class ThirdServlet extends HttpServlet
{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
       // resp.getWriter().println("this is the third servlet");

        req.getRequestDispatcher("accTxr.jsp").forward(req,resp);

        /*

        resp.getWriter().write("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>");

        resp.getWriter().println("<H1 align=\"center\">Welcome to Bank of Honalulu</H1>");

        resp.getWriter().write("<H2> Accounts Transfer Page</H2>");

        resp.getWriter().write("<H4> Hi! "+req.getSession().getAttribute("username")+" "+req.getSession().getAttribute("password")+"</H4> for get method");

        resp.getWriter().println("</body>\n" + "</html>");

        */

    }


}
