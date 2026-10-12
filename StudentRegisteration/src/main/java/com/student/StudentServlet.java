package com.student;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class StudentServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        // Get data from the registration form
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String course = request.getParameter("course");

        // Send data to result.jsp
        request.setAttribute("name", name);
        request.setAttribute("email", email);
        request.setAttribute("course", course);

        // Open result.jsp
        request.getRequestDispatcher("result.jsp")
               .forward(request, response);
    }
}