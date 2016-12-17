package com.miristan.webapp.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by DEV on 06-12-2016.
 */

@WebServlet(name = "Fourth",urlPatterns = "/fourth")
public class FourthServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        resp.getWriter().println("this 4th servlet is the latest addition to our collection"); //printwriter
    }
}
