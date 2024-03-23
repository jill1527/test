package com.cj;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Servlet01", value = "/test")
public class Servlet01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        request.setAttribute("username",username);
        request.setAttribute("password",password);
    String name="wanzhen";
    this.getServletContext().setAttribute("name",name);
        request.getRequestDispatcher("test01.jsp").forward(request,response);
    }
}
