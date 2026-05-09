// ⚠️ Important Instruction: Copying Code
// When using the provided code for your project, please follow these guidelines to avoid errors:

// Copy Only the Logic: It is highly recommended to copy only the specific code blocks (methods or logic) from the provided class and paste them into your existing files.

// If You Copy the Entire File:

// Update the Package Name: Ensure you change the package declaration at the very top to match your own project's folder structure.

// Rename the Class: The class name in the file must strictly match your file name (e.g., if your file is MyProgram.java, the class must be public class MyProgram).

package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckVoterServlet extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CheckVoter</title>");
            out.println("</head>");
            out.println("<body>");
            String name = request.getParameter("username");
            int age = Integer.parseInt(request.getParameter("userage"));
            if(age >= 18) {
                out.println("<h4 style \"color:green\">" + name + "you are eligible to vote</h4>");
            } else {
                out.println("<h4 style \"color:red\">" + name + "you are not eligible to vote</h4>");
            }
            out.println("<a href=\"index.jsp\">Home</a>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }
}
