package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        urlPatterns = {"/LoginServlet"},
        initParams = {
                @WebInitParam(name = "user", value = "Akshaya"),
                @WebInitParam(name = "password", value = "aks@2004")
        }
)
public class LoginServlet extends HttpServlet {

    private boolean isValidName(String name) {
        return name != null && name.matches("^[A-Z][a-zA-Z]{2,}$");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String user = request.getParameter("user");
        String pwd = request.getParameter("pwd");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (!isValidName(user)) {
            out.println("<font color='red'>Invalid Name. Name must start with a capital letter and contain at least 3 characters.</font><br><br>");
            RequestDispatcher rd = request.getRequestDispatcher("login.html");
            rd.include(request, response);
            return;
        }

        String validUser = getServletConfig().getInitParameter("user");
        String validPassword = getServletConfig().getInitParameter("password");

        if (validUser.equals(user) && validPassword.equals(pwd)) {
            request.setAttribute("user", user);
            RequestDispatcher rd = request.getRequestDispatcher("LoginSuccess.jsp");
            rd.forward(request, response);
        } else {
            out.println("<font color='red'>Invalid Username or Password</font><br><br>");
            RequestDispatcher rd = request.getRequestDispatcher("login.html");
            rd.include(request, response);
        }
    }
}
