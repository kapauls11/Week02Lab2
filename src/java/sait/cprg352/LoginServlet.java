package sait.cprg352;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 698437
 * September 18 2017
 */
@WebServlet(urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          
         getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         String usernameString = request.getParameter("username");
         String passwordString = request.getParameter("password");
         
         //validating the username and password fields are not empty
         String message;
         
        if(usernameString.trim().isEmpty()||usernameString==null||
              passwordString.trim().isEmpty()||passwordString==null  )
        {
            request.setAttribute("errorMessage", "Please enter a username and password");
            
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp"). forward(request, response);
             return;
        }
        UserService us = new UserService();
        boolean loginValid = us.login(usernameString,passwordString);
        
        //if the username or password entered is invalid
        if(!loginValid){
            
            request.setAttribute("errorMessage", "Username or password is incorrect.");
            request.setAttribute("username", usernameString);
             request.setAttribute("password", passwordString);
             
              getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").
              forward(request, response);
              return;
        }
        request.setAttribute("username", usernameString);
        request.setAttribute("password", passwordString);
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
       
    }

}
