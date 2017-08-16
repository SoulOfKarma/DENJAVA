
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DAO;
import model.User;
import model.Error;

@WebServlet(name = "ValidateServlet", urlPatterns = {"/validate.do"})
public class ValidateServlet extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        DAO dao = new DAO();
        
        String mail,pass;
        
        mail = request.getParameter("txtmail");
        pass = request.getParameter("txtpass");
        User u = new User(mail, pass);
        
        User user2 = dao.exist(u);
         HttpSession session = request.getSession();
        if(user2.errorExist())
        {
          /*Enviar a Error.view (lista de errores)*/
            List<Error> errors = user2.getErrors();
            session.setAttribute("errors", errors);            
            request.getRequestDispatcher("error.view").forward(request, response);
        }else
        {
          /*Menu*/
             session.setAttribute("user", user2);
             request.getRequestDispatcher("menu.view").forward(request, response);
        }
      
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
